package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.common.mongo.BaseData;
import com.jzfq.rms.third.service.IMongoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @description mongo批处理
 */
@Service
public class MongoServiceImpl implements IMongoService {

    private static final Logger logger = LoggerFactory.getLogger(MongoServiceImpl.class);

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void save(List<BaseData> list) {
        logger.info("mongo 数据开始入库......");
        try {
//            mongoTemplate.insert(list, c);
            mongoTemplate.insertAll(list);
        } catch (Exception e) {
            logger.error("mongo 入库失败......", e);
        }
        logger.info("mongo 数据入库结束......");
    }

    @Override
    public Long findCount(Class c) {
        return mongoTemplate.count(null,c);
    }
}
