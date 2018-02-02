package com.jzfq.rms.third.support.pool.factory;

import com.jzfq.rms.third.support.log.ILogger;
import com.jzfq.rms.third.support.log.impl.RmsLogger;
import com.jzfq.rms.third.web.action.GongPingJiaAction;
import com.jzfq.rms.third.web.action.handler.Request1004Handler;
import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.apache.commons.dbcp.PoolableConnectionFactory;
import org.apache.commons.dbcp.PoolingDataSource;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * log4j2 ConnectionFactory
 *
 * @author 大连桔子分期科技有限公司
 * @date 2017-12-27.
 */
public class ConnectionFactory {
    private static final Logger log = LoggerFactory.getLogger(Request1004Handler.class);

    private final String serverUrl = "/data/config/rms-third/prod.properties";

    private final String projectUrl = "rms-third.properties";

    private static interface Singleton {
        final ConnectionFactory INSTANCE = new ConnectionFactory();
    }

    private final DataSource dataSource;

    private ConnectionFactory() {
        PropertiesUtil logProperties = getUtilObject();
        try {
            String driver = logProperties.getStringProperty("log.db.driver");
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }
        Properties properties = new Properties();
        String user = logProperties.getStringProperty("log.db.username");
        properties.setProperty("user", user);
        String password = logProperties.getStringProperty("log.db.password");
        properties.setProperty("password", password);

        GenericObjectPool pool = new GenericObjectPool();
        String url = logProperties.getStringProperty("log.db.url");
        DriverManagerConnectionFactory connectionFactory = new DriverManagerConnectionFactory(
                url,properties
        );
        new PoolableConnectionFactory(
                connectionFactory, pool, null,"SELECT 1", 3, false, false, Connection.TRANSACTION_READ_COMMITTED
        );

        this.dataSource = new PoolingDataSource(pool);
    }

    public static Connection getDatabaseConnection() throws SQLException {
        return Singleton.INSTANCE.dataSource.getConnection();
    }


    private PropertiesUtil getUtilObject(){
        Properties configProperties = new Properties();
        File file = new File(serverUrl);
        if(file.exists()){
            System.out.println(serverUrl);
            try (FileInputStream in = new FileInputStream(file) ){
                configProperties.load(in);
                return new PropertiesUtil(configProperties);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(projectUrl);
        return new PropertiesUtil(projectUrl);
    }
}
