package com.jzfq.rms.enums;


import java.util.HashMap;
import java.util.Map;

/**
 * 百融 字段映射枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum BaiRongMapEnum {

    FLAG_RULESPECIALLIST("flag_rulespeciallist", "借款反欺诈规则-黑名单输出标识"),
    FLAG_RULEAPPLYLOAN("flag_ruleapplyloan", "借款反欺诈规则-多次申请输出标识"),
    FLAG_RULEACCOUNTCHANGE("flag_ruleaccountchange", "借款反欺诈规则-收支等级规则输出标识"),
    FLAG_RULEEXECUTION("flag_ruleexecution", "借款反欺诈规则-法院被执行人评分输出标识"),
    RULE_FINAL_DECISION("Rule_final_decision", ""),
    ACCEPT("Accept", "通过"),
    REJECT("Reject", "拒绝"),
    REVIEW("Review", "复议");

    public static final Map<String, String> WEIGHTS = new HashMap<>(100);

    public static final Map<String, String> CODES = new HashMap<>(100);

    static {
        WEIGHTS.put("1", "输出成功");
        WEIGHTS.put("0", "未匹配");
        WEIGHTS.put("99", "系统异常");
        WEIGHTS.put("null", "没有选择该报告");
        WEIGHTS.put("Accept", "通过");
        WEIGHTS.put("Reject", "拒绝");
        WEIGHTS.put("Review", "复议");



        WEIGHTS.put("Rule_weight_QJS010","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS015","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS020","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS025","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS030","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS035","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS040","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS045","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS090","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS100","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS110","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS120","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS130","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS135","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS136","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS137","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS141","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS142","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS143","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS144","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS145","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS146","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS150","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS151","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS152","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS156","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS157","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS158","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS159","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS160","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS161","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS170","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS171","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS172","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS176","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS177","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS178","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS179","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS180","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS181","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS190","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS191","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS192","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS196","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS197","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS198","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS199","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS200","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS201","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS215","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS216","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS217","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS221","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS222","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS223","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS224","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS225","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS226","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS235","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS236","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS237","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS241","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS242","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS243","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS244","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS245","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJS246","RuleSpeciallist_weight");
        WEIGHTS.put("Rule_weight_QJF010","RuleApplyLoan_weight");
        WEIGHTS.put("Rule_weight_QJF020","RuleApplyLoan_weight");
        WEIGHTS.put("Rule_weight_QJF025","RuleApplyLoan_weight");
        WEIGHTS.put("Rule_weight_QJF030","RuleApplyLoan_weight");
        WEIGHTS.put("Rule_weight_QJF040","RuleApplyLoan_weight");
        WEIGHTS.put("Rule_weight_QJF045","RuleApplyLoan_weight");
        WEIGHTS.put("Rule_weight_XJA010","RuleAccountChange_weight");
        WEIGHTS.put("Rule_weight_XJA020","RuleAccountChange_weight");
        WEIGHTS.put("Rule_weight_QJE010","RuleExecution_weight");
        WEIGHTS.put("Rule_weight_QJE020","RuleExecution_weight");
        
                


        CODES.put("Rule_name_QJS010","RuleSpeciallist");
        CODES.put("Rule_name_QJS015","RuleSpeciallist");
        CODES.put("Rule_name_QJS020","RuleSpeciallist");
        CODES.put("Rule_name_QJS025","RuleSpeciallist");
        CODES.put("Rule_name_QJS030","RuleSpeciallist");
        CODES.put("Rule_name_QJS035","RuleSpeciallist");
        CODES.put("Rule_name_QJS040","RuleSpeciallist");
        CODES.put("Rule_name_QJS045","RuleSpeciallist");
        CODES.put("Rule_name_QJS090","RuleSpeciallist");
        CODES.put("Rule_name_QJS100","RuleSpeciallist");
        CODES.put("Rule_name_QJS110","RuleSpeciallist");
        CODES.put("Rule_name_QJS120","RuleSpeciallist");
        CODES.put("Rule_name_QJS130","RuleSpeciallist");
        CODES.put("Rule_name_QJS135","RuleSpeciallist");
        CODES.put("Rule_name_QJS136","RuleSpeciallist");
        CODES.put("Rule_name_QJS137","RuleSpeciallist");
        CODES.put("Rule_name_QJS141","RuleSpeciallist");
        CODES.put("Rule_name_QJS142","RuleSpeciallist");
        CODES.put("Rule_name_QJS143","RuleSpeciallist");
        CODES.put("Rule_name_QJS144","RuleSpeciallist");
        CODES.put("Rule_name_QJS145","RuleSpeciallist");
        CODES.put("Rule_name_QJS146","RuleSpeciallist");
        CODES.put("Rule_name_QJS150","RuleSpeciallist");
        CODES.put("Rule_name_QJS151","RuleSpeciallist");
        CODES.put("Rule_name_QJS152","RuleSpeciallist");
        CODES.put("Rule_name_QJS156","RuleSpeciallist");
        CODES.put("Rule_name_QJS157","RuleSpeciallist");
        CODES.put("Rule_name_QJS158","RuleSpeciallist");
        CODES.put("Rule_name_QJS159","RuleSpeciallist");
        CODES.put("Rule_name_QJS160","RuleSpeciallist");
        CODES.put("Rule_name_QJS161","RuleSpeciallist");
        CODES.put("Rule_name_QJS170","RuleSpeciallist");
        CODES.put("Rule_name_QJS171","RuleSpeciallist");
        CODES.put("Rule_name_QJS172","RuleSpeciallist");
        CODES.put("Rule_name_QJS176","RuleSpeciallist");
        CODES.put("Rule_name_QJS177","RuleSpeciallist");
        CODES.put("Rule_name_QJS178","RuleSpeciallist");
        CODES.put("Rule_name_QJS179","RuleSpeciallist");
        CODES.put("Rule_name_QJS180","RuleSpeciallist");
        CODES.put("Rule_name_QJS181","RuleSpeciallist");
        CODES.put("Rule_name_QJS190","RuleSpeciallist");
        CODES.put("Rule_name_QJS191","RuleSpeciallist");
        CODES.put("Rule_name_QJS192","RuleSpeciallist");
        CODES.put("Rule_name_QJS196","RuleSpeciallist");
        CODES.put("Rule_name_QJS197","RuleSpeciallist");
        CODES.put("Rule_name_QJS198","RuleSpeciallist");
        CODES.put("Rule_name_QJS199","RuleSpeciallist");
        CODES.put("Rule_name_QJS200","RuleSpeciallist");
        CODES.put("Rule_name_QJS201","RuleSpeciallist");
        CODES.put("Rule_name_QJS215","RuleSpeciallist");
        CODES.put("Rule_name_QJS216","RuleSpeciallist");
        CODES.put("Rule_name_QJS217","RuleSpeciallist");
        CODES.put("Rule_name_QJS221","RuleSpeciallist");
        CODES.put("Rule_name_QJS222","RuleSpeciallist");
        CODES.put("Rule_name_QJS223","RuleSpeciallist");
        CODES.put("Rule_name_QJS224","RuleSpeciallist");
        CODES.put("Rule_name_QJS225","RuleSpeciallist");
        CODES.put("Rule_name_QJS226","RuleSpeciallist");
        CODES.put("Rule_name_QJS235","RuleSpeciallist");
        CODES.put("Rule_name_QJS236","RuleSpeciallist");
        CODES.put("Rule_name_QJS237","RuleSpeciallist");
        CODES.put("Rule_name_QJS241","RuleSpeciallist");
        CODES.put("Rule_name_QJS242","RuleSpeciallist");
        CODES.put("Rule_name_QJS243","RuleSpeciallist");
        CODES.put("Rule_name_QJS244","RuleSpeciallist");
        CODES.put("Rule_name_QJS245","RuleSpeciallist");
        CODES.put("Rule_name_QJS246","RuleSpeciallist");
        CODES.put("Rule_name_QJF010","RuleApplyLoan");
        CODES.put("Rule_name_QJF020","RuleApplyLoan");
        CODES.put("Rule_name_QJF025","RuleApplyLoan");
        CODES.put("Rule_name_QJF030","RuleApplyLoan");
        CODES.put("Rule_name_QJF040","RuleApplyLoan");
        CODES.put("Rule_name_QJF045","RuleApplyLoan");
        CODES.put("Rule_name_XJA010","RuleAccountChange");
        CODES.put("Rule_name_XJA020","RuleAccountChange");
        CODES.put("Rule_name_QJE020","RuleExecution");
        CODES.put("Rule_name_QJE010","RuleExecution");

        CODES.put("0000","验证成功");
        CODES.put("9941","四要素不匹配");
        CODES.put("1000","没有此接口权限");
        CODES.put("1001","未查到该用户数据");
        CODES.put("1100","系统超时");
        CODES.put("5000","接口未找到或关闭");
        CODES.put("5001","应用已停用");
        CODES.put("5002","通道不支持");
    }

    private String url;

    private String desc;

    BaiRongMapEnum(String url, String desc) {
        this.url = url;
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
