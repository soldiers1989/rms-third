package com.jzfq.rms.third.common.utils.jao;

import java.util.Map;

public class JaoParamsRequestModel {


    private int encrypted = 1 ; // 是否加密传输
    private String encryptionType = "AES" ; // AES(秘钥长度不固定)、DES(秘钥长度8)、DESede(秘钥长度24)
    private String encryptionKey = "123456789" ; // 加密类型和加密秘钥向GEO索取(如果是获取数据的时候传的是RSA那么这里自己定义即可)

    private String spiderEncryptionType = "AES" ; // AES(秘钥长度不固定)、DES(秘钥长度8)、DESede(秘钥长度24)
    private String spiderEncryptionKey = "123456789" ; // 加密类型和加密秘钥向GEO索取(如果是获取数据的时候传的是RSA那么这里自己定义即可)

    private String username = "test12" ; // 账户向GEO申请开通
    private String password = "test12" ;
    private String uno = "200206" ;
    private String etype = "" ;
    private int dsign = 0 ; // 是否进行数字签名 1是0否
    private String loginUrl = "" ; // http://yz.geotmt.com、https://yz.geotmt.com
    private String dataUrl = "" ; // http://yz.geotmt.com、https://yz.geotmt.com



    public String getEtype() {
        return etype;
    }

    public void setEtype(String etype) {
        this.etype = etype;
    }

    public int getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(int encrypted) {
        this.encrypted = encrypted;
    }


    public String getEncryptionType() {
        return encryptionType;
    }

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUno() {
        return uno;
    }

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public int getDsign() {
        return dsign;
    }

    public void setDsign(int dsign) {
        this.dsign = dsign;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }


    public String getSpiderEncryptionType() {
        return spiderEncryptionType;
    }

    public void setSpiderEncryptionType(String spiderEncryptionType) {
        this.spiderEncryptionType = spiderEncryptionType;
    }

    public String getSpiderEncryptionKey() {
        return spiderEncryptionKey;
    }

    public void setSpiderEncryptionKey(String spiderEncryptionKey) {
        this.spiderEncryptionKey = spiderEncryptionKey;
    }

    public JaoParamsRequestModel(Map<String,Object> bizParam) {
//        this.encrypted = encrypted;
//        this.encryptionType = encryptionType;
//        this.encryptionKey = encryptionKey;
//        this.spiderEncryptionType = spiderEncryptionType;
//        this.spiderEncryptionKey = spiderEncryptionKey;
//        this.username = username;
//        this.password = password;
//        this.uno = uno;
//        this.etype = etype;
//        this.dsign = dsign;
//        this.loginUrl = loginUrl;
//        this.dataUrl = dataUrl;

        this.encryptionType= bizParam.get("encryptionType").toString();
        this.encryptionKey= bizParam.get("encryptionKey").toString();
        this.username= bizParam.get("username").toString();
        this.password= bizParam.get("password").toString();
        this.uno= bizParam.get("uno").toString();
//		this.etype= "";
        this.dsign=  Integer.parseInt(bizParam.get("dsign").toString());
        this.loginUrl= bizParam.get("loginUrl").toString();
        this.dataUrl= bizParam.get("dataUrl").toString();
    }
}
