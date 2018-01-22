/*
Navicat MySQL Data Transfer

Source Server         : third-prd
Source Server Version : 50634
Source Host           : dba.juzifenqi.cn:13324
Source Database       : rms_third

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2018-01-22 18:43:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_br_transfer_log`
-- ----------------------------
CREATE TABLE `t_br_transfer_log` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID' ,
`c_interface_key`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接口标识' ,
`c_traceId`  varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务标识traceId/taskId' ,
`c_system_id`  varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT 'systemId' ,
`c_pro_line`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用产品线' ,
`c_channel`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用渠道' ,
`c_params`  varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用参数' ,
`c_status`  char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '调用状态' ,
`c_msg`  varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '响应信息' ,
`c_msg_detail`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '信息详情' ,
`n_del`  int(1) NULL DEFAULT 0 COMMENT '是否删除' ,
`c_ip`  varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用IP' ,
`dt_create_time`  datetime NULL DEFAULT NULL COMMENT '调用时间' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_gpj_car_detail_model`
-- ----------------------------
CREATE TABLE `t_gpj_car_detail_model` (
`n_bh`  int(11) NOT NULL COMMENT '编号' ,
`n_gpj_id`  int(10) NULL DEFAULT NULL COMMENT '公平价款型id' ,
`c_brand_slug`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌slug' ,
`c_brand_name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌名称' ,
`c_model_slug`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '型号slug' ,
`c_model_name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '型号名称' ,
`c_detail_model_slug`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '款型slug' ,
`c_detail_model_name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '款型名称' ,
`c_model_mum`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生产商' ,
`n_price_bn`  float(12,2) NULL DEFAULT NULL COMMENT '新车指导价' ,
`n_emission_standard`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标准排量' ,
`n_volume`  float(5,1) NULL DEFAULT NULL COMMENT '排量' ,
`n_listed_year`  int(4) NULL DEFAULT NULL COMMENT '上市年份' ,
`n_delisted_year`  int(4) NULL DEFAULT NULL COMMENT '退市年份' ,
`dt_update_time`  datetime NULL DEFAULT NULL COMMENT '更新时间' ,
`c_status`  char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '信息状态' ,
`dt_opt_time`  datetime NULL DEFAULT NULL COMMENT '操作时间' ,
`c_opt_user`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人' ,
PRIMARY KEY (`n_bh`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_gpj_transfer_log`
-- ----------------------------
CREATE TABLE `t_gpj_transfer_log` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID' ,
`c_interface_key`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接口标识' ,
`c_traceId`  varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务标识traceId/taskId' ,
`c_system_id`  varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT 'systemId' ,
`c_pro_line`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用产品线' ,
`c_channel`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用渠道' ,
`c_params`  varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用参数' ,
`c_status`  char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '调用状态' ,
`c_msg`  varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '响应信息' ,
`c_msg_detail`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '信息详情' ,
`n_del`  int(1) NULL DEFAULT 0 COMMENT '是否删除' ,
`c_ip`  varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用IP' ,
`dt_create_time`  datetime NULL DEFAULT NULL COMMENT '调用时间' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_jiean_transfer_log`
-- ----------------------------
CREATE TABLE `t_jiean_transfer_log` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID' ,
`c_interface_key`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接口标识' ,
`c_traceId`  varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务标识traceId/taskId' ,
`c_system_id`  varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT 'systemId' ,
`c_pro_line`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用产品线' ,
`c_channel`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用渠道' ,
`c_params`  varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用参数' ,
`c_status`  char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '调用状态' ,
`c_msg`  varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '响应信息' ,
`c_msg_detail`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '信息详情' ,
`n_del`  int(1) NULL DEFAULT 0 COMMENT '是否删除' ,
`c_ip`  varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用IP' ,
`dt_create_time`  datetime NULL DEFAULT NULL COMMENT '调用时间' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_jxl_transfer_log`
-- ----------------------------
CREATE TABLE `t_jxl_transfer_log` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID' ,
`c_interface_key`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接口标识' ,
`c_traceId`  varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务标识traceId/taskId' ,
`c_system_id`  varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT 'systemId' ,
`c_pro_line`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用产品线' ,
`c_channel`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用渠道' ,
`c_params`  varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用参数' ,
`c_status`  char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '调用状态' ,
`c_msg`  varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '响应信息' ,
`c_msg_detail`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '信息详情' ,
`n_del`  int(1) NULL DEFAULT 0 COMMENT '是否删除' ,
`c_ip`  varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用IP' ,
`dt_create_time`  datetime NULL DEFAULT NULL COMMENT '调用时间' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_py_transfer_log`
-- ----------------------------
CREATE TABLE `t_py_transfer_log` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID' ,
`c_interface_key`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接口标识' ,
`c_traceId`  varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务标识traceId/taskId' ,
`c_system_id`  varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT 'systemId' ,
`c_pro_line`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用产品线' ,
`c_channel`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用渠道' ,
`c_params`  varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用参数' ,
`c_status`  char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '调用状态' ,
`c_msg`  varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '响应信息' ,
`c_msg_detail`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '信息详情' ,
`n_del`  int(1) NULL DEFAULT 0 COMMENT '是否删除' ,
`c_ip`  varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用IP' ,
`dt_create_time`  datetime NULL DEFAULT NULL COMMENT '调用时间' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_rsll_transfer_log`
-- ----------------------------
CREATE TABLE `t_rsll_transfer_log` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID' ,
`c_interface_key`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接口标识' ,
`c_traceId`  varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务标识traceId/taskId' ,
`c_system_id`  varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT 'systemId' ,
`c_pro_line`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用产品线' ,
`c_channel`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用渠道' ,
`c_params`  varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用参数' ,
`c_status`  char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '调用状态' ,
`c_msg`  varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '响应信息' ,
`c_msg_detail`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '信息详情' ,
`n_del`  int(1) NULL DEFAULT 0 COMMENT '是否删除' ,
`c_ip`  varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用IP' ,
`dt_create_time`  datetime NULL DEFAULT NULL COMMENT '调用时间' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_sys_code`
-- ----------------------------
CREATE TABLE `t_sys_code` (
`c_id`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID' ,
`c_parent_id`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'root' COMMENT '父ID' ,
`c_key`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '代码key' ,
`c_value`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '代码value' ,
`c_description`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '代码描述' ,
`n_order`  int(10) NULL DEFAULT 0 COMMENT '代码序号' ,
`c_status`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '代码状态' ,
`dt_create_time`  datetime NULL DEFAULT NULL COMMENT '创建时间' ,
`c_create_user`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户' ,
`dt_update_time`  datetime NULL DEFAULT NULL COMMENT '更新时间' ,
`c_opt_user`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新用户' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_sys_config`
-- ----------------------------
CREATE TABLE `t_sys_config` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID' ,
`c_key`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '配置标识' ,
`c_description`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配置描述' ,
`c_value`  varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配置值' ,
`c_level`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配置级别' ,
`c_owner`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属者' ,
`c_del`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '是否删除' ,
`dt_create_time`  datetime NULL DEFAULT NULL COMMENT '创建时间' ,
`c_create_user`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户' ,
`dt_update_time`  datetime NULL DEFAULT NULL COMMENT '更新时间' ,
`c_opt_user`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新用户' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_sys_task`
-- ----------------------------
CREATE TABLE `t_sys_task` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务ID' ,
`c_task_slug`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务标识' ,
`c_task_dec`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务描述' ,
`c_task_params`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务参数' ,
`c_status`  char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执行状态' ,
`dt_exc_time`  datetime NULL DEFAULT NULL COMMENT '执行时间' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_td_transfer_log`
-- ----------------------------
CREATE TABLE `t_td_transfer_log` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID' ,
`c_interface_key`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接口标识' ,
`c_traceId`  varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务标识traceId/taskId' ,
`c_system_id`  varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT 'systemId' ,
`c_pro_line`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用产品线' ,
`c_channel`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用渠道' ,
`c_params`  varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用参数' ,
`c_status`  char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '调用状态' ,
`c_msg`  varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '响应信息' ,
`c_msg_detail`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '信息详情' ,
`n_del`  int(1) NULL DEFAULT 0 COMMENT '是否删除' ,
`c_ip`  varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用IP' ,
`dt_create_time`  datetime NULL DEFAULT NULL COMMENT '调用时间' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_third_transfer_log`
-- ----------------------------
CREATE TABLE `t_third_transfer_log` (
`c_id`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID' ,
`c_third_key`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '第三方标识' ,
`c_interface_key`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接口标识' ,
`c_pro_line`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用产品线' ,
`c_channel`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用渠道' ,
`c_params`  varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用参数' ,
`c_status`  char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '调用状态' ,
`c_msg`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '响应信息' ,
`dt_create_time`  datetime NULL DEFAULT NULL COMMENT '调用时间' ,
PRIMARY KEY (`c_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Indexes structure for table t_gpj_car_detail_model
-- ----------------------------
CREATE UNIQUE INDEX `i_detail_model_slug` ON `t_gpj_car_detail_model`(`c_detail_model_slug`) USING BTREE ;

-- 初始化数据
INSERT INTO `t_sys_config` VALUES ('137ada4fa4e94cbc868cf7fcc5e22c1f', 'com.jzfq.rms.third.url.jxl.accessreportdata', '获取聚信立用户报告', 'https://www.juxinli.com/api/access_report_data', '1', NULL, '0', '2017-10-15 21:20:07', 'init', NULL, NULL);
INSERT INTO `t_sys_config` VALUES ('24484c79245a46f68c3cd7c4db81d77a', 'com.jzfq.rms.third.url.jxl.accessreportstatus', '获取聚信立报告状态', 'https://www.juxinli.com/api/v2/job/access_jobs_status_by_user_info', '1', NULL, '0', '2017-10-15 21:18:15', 'init', NULL, NULL);
INSERT INTO `t_sys_config` VALUES ('2ff5e642349140208daf0dab4f59adbd', 'com.jzfq.rms.third.url.pengyuan.pycredit', '鹏元pycredit接口', 'http://test.pycredit.com:9001/services/WebServiceSingleQuery?wsdl', '1', NULL, '0', '2017-10-15 17:16:36', 'init', NULL, NULL);
INSERT INTO `t_sys_config` VALUES ('477f9e3f9e894ba894a13d44d2b69422', 'com.jzfq.rms.third.url.td.logintdscore', '查询同盾登录决策分', 'http://dev2.fraud.juzifenqi.com/fraud/tdscore.json?mobile=%s', '1', NULL, '0', '2017-10-15 21:28:08', 'init', NULL, NULL);
INSERT INTO `t_sys_config` VALUES ('68da5f25e56545f5bbc03a0774379efc', 'com.jzfq.rms.third.url.jxl.accesstoken', '获取聚信立安全凭证', 'https://www.juxinli.com/api/access_report_token', '1', NULL, '0', '2017-10-15 21:22:42', 'init', NULL, NULL);
INSERT INTO `t_sys_config` VALUES ('6975c28675dc48b2b616af8a41c299d6', 'com.jzfq.rms.third.url.jxl.accessbusirawdata', '获取聚信立电商数据', 'https://www.juxinli.com/api/access_e_business_raw_data', '1', NULL, '0', '2017-10-15 21:24:56', 'init', NULL, NULL);
INSERT INTO `t_sys_config` VALUES ('6ca8d058abc34df29e21c438eb59e53b', 'com.jzfq.rms.third.url.jxl.accessrawdata', '获取聚信立移动运营商数据', 'https://www.juxinli.com/api/access_raw_data', '1', NULL, '0', '2017-10-15 21:21:15', 'init', NULL, NULL);
INSERT INTO `t_sys_config` VALUES ('894a23b4e22a43aba1afc5c303a2d39f', 'gongpingjia.evaluation.apiUrl', '公平价更新车型库接口', 'https://apigw.gongpingjia.com/api/cars/evaluation/juzi/', '1', NULL, '0', '2017-10-23 20:27:30', 'init', NULL, NULL);
INSERT INTO `t_sys_config` VALUES ('c72e6d99ad2e498a88cf50a8dec2876d', 'com.jzfq.rms.third.url.td.addtdfraudblack', '同盾反欺诈加黑接口', 'http://dev2.fraud.juzifenqi.com/fraud/addblack.json', '1', NULL, '0', '2017-10-15 21:29:43', 'init', NULL, NULL);
INSERT INTO `t_sys_config` VALUES ('cee35743b9214fe3bb00d7eae11600a7', 'gongpingjia.detail.model.apiUrl', '公平价更新车型库接口', 'http://openapi.gongpingjia.com/api/modeldetail/lastupdated/', '1', NULL, '0', '2017-10-23 20:26:03', 'init', NULL, NULL);
