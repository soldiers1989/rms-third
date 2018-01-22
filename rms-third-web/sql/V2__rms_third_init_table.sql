-- v2 初始化数据
--  鹏元的配置，暂时不修改
--  DELETE FROM `t_sys_config` WHERE `c_id`='2ff5e642349140208daf0dab4f59adbd';
--  INSERT INTO `t_sys_config` (`c_id`, `c_key`, `c_description`, `c_value`, `c_level`, `c_owner`, `c_del`, `dt_create_time`, `c_create_user`, `dt_update_time`, `c_opt_user`) VALUES ('2ff5e642349140208daf0dab4f59adbd', 'com.jzfq.rms.third.url.pengyuan.pycredit', '鹏元pycredit接口', 'http://www.pycredit.com:8001/services/WebServiceSingleQuery?wsdl', '1', NULL, '0', '2017-10-15 17:16:36', 'init', NULL, NULL);
INSERT INTO `t_sys_config` (`c_id`, `c_key`, `c_description`, `c_value`, `c_level`, `c_owner`, `c_del`, `dt_create_time`, `c_create_user`, `dt_update_time`, `c_opt_user`) VALUES ('6975c28675dc48b2b616af8a41c29910', 'com.jzfq.rms.third.url.jxl.rawdatabytoken', '获取聚信立移动运营商数据token', 'https://www.juxinli.com/api/access_raw_data_by_token', '1', NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `t_sys_config` (`c_id`, `c_key`, `c_description`, `c_value`, `c_level`, `c_owner`, `c_del`, `dt_create_time`, `c_create_user`, `dt_update_time`, `c_opt_user`) VALUES ('6975c28675dc48b2b616af8a41c299d7', 'com.jzfq.rms.third.url.jxl.busirawdatabytoken', '获取聚信立电商数据token', 'https://www.juxinli.com/api/access_e_business_raw_data_by_token', '1', NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `t_sys_config` (`c_id`, `c_key`, `c_description`, `c_value`, `c_level`, `c_owner`, `c_del`, `dt_create_time`, `c_create_user`, `dt_update_time`, `c_opt_user`) VALUES ('6975c28675dc48b2b616af8a41c299d8', 'com.jzfq.rms.third.url.jxl.reportstatusbytoken', '获取聚信立报告状态token', 'https://www.juxinli.com/api/v2/job/access_jobs_status_by_token', '1', NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `t_sys_config` (`c_id`, `c_key`, `c_description`, `c_value`, `c_level`, `c_owner`, `c_del`, `dt_create_time`, `c_create_user`, `dt_update_time`, `c_opt_user`) VALUES ('6975c28675dc48b2b616af8a41c299d9', 'com.jzfq.rms.third.url.jxl.reportdatabytoken', '获取聚信立用户报告token', 'https://www.juxinli.com/api/access_report_data_by_token', '1', NULL, '0', NULL, NULL, NULL, NULL);
/*
Navicat MySQL Data Transfer

Source Server         : dev2
Source Server Version : 50634
Source Host           : 47.93.43.48:3321
Source Database       : rms_third

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2018-01-18 12:00:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_jiean_phone_data`
-- ----------------------------
DROP TABLE IF EXISTS `t_jiean_phone_data`;
CREATE TABLE `t_jiean_phone_data` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编号' ,
`c_jiean_id`  varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '流水号' ,
`c_type`  char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据类型' ,
`c_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '姓名' ,
`c_phone`  varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话' ,
`c_certcard_no`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证' ,
`c_status`  char(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '响应代码' ,
`c_result`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '响应值' ,
`c_value`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '转换值' ,
`dt_update_time`  datetime NOT NULL COMMENT '入库时间' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_jxl_token`
-- ----------------------------
DROP TABLE IF EXISTS `t_jxl_token`;
CREATE TABLE `t_jxl_token` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID' ,
`c_id_number`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '身份证' ,
`c_type`  char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型：1.用户报告2.电商数据3.运营商数据' ,
`c_token`  char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '聚信立token' ,
`dt_create_time`  datetime NULL DEFAULT NULL COMMENT '创建时间' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_py_car_check`
-- ----------------------------
DROP TABLE IF EXISTS `t_py_car_check`;
CREATE TABLE `t_py_car_check` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编号' ,
`c_pengyuan_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流水号' ,
`c_license_no`  char(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '车牌号码' ,
`c_name`  varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名' ,
`c_certcard_no`  varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '身份证' ,
`c_car_type`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '牌号类型' ,
`c_status`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '响应代码' ,
`c_result`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '响应值' ,
`c_value`  char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '转换值' ,
`dt_update_time`  datetime NOT NULL COMMENT '入库时间' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;
