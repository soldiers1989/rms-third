DELETE FROM `t_sys_config` WHERE `c_id`='2ff5e642349140208daf0dab4f59adbd';
INSERT INTO `t_sys_config` (`c_id`, `c_key`, `c_description`, `c_value`, `c_level`, `c_owner`, `c_del`, `dt_create_time`, `c_create_user`, `dt_update_time`, `c_opt_user`) VALUES ('2ff5e642349140208daf0dab4f59adbd', 'com.jzfq.rms.third.url.pengyuan.pycredit', '鹏元pycredit接口', 'http://www.pycredit.com:8001/services/WebServiceSingleQuery?wsdl', '1', NULL, '0', '2017-10-15 17:16:36', 'init', NULL, NULL);