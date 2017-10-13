package com.jzfq.rms.enums;

/**
 * 风险规则枚举
 * @author 大连桔子分期科技有限公司
 * @date   10/13/16. 上午10:14:14
 */
public enum RiskRuleEnum {
    RULE_CARD("证件号码相同的客户的信息", "历史订单中的客户证件号码与本单客户证件号码相同的订单号"),
    RULE_MOBILE("手机号码相同的客户的信息", "历史订单中的客户手机号码与本单客户手机号码相同的订单号"),
    RULE_PHONE_CONTACT("手机号码相同的联系人的信息", "历史订单中的联系人联系电话与本单客户手机号码相同的订单号"),
    RULE_COMPANY_PHONE("单位电话相同的客户的信息", "历史订单中的客户单位电话与本单客户单位电话相同的订单号"),
    RULE_CONTACT("联系人电话号码相同的信息", "历史订单中的联系人联系电话与本单联系人联系电话相同的订单号"),
    RULE_COMPANY_NAME("单位名称相同的客户的信息", "历史订单中的客户单位名称与本单客户单位名称相同的订单号"),
    RULE_CONTACT_PHONE("联系人与客户手机号码相同的信息", "历史订单中的客户手机号码与本单联系人联系电话相同的订单号"),
    RULE_CONTACT_COMPANY_PHONE("联系人与客户单位电话相同的信息", "历史订单中的客户单位电话与本单联系人联系电话相同的订单号"),
    RULE_ADDRESS("家庭住址相同的客户的信息", "历史订单中的客户家庭住址与本单客户家庭住址相同的订单号"),
    RULE_BANKNO("银行卡号相同的客户的信息", "历史订单中的客户银行卡号与本单客户银行卡号相同的订单号");


    private String rule;

    private String ruleDetail;

    private RiskRuleEnum(String rule, String ruleDetail) {
        this.rule = rule;
        this.ruleDetail = ruleDetail;
    }


    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getRuleDetail() {
        return ruleDetail;
    }

    public void setRuleDetail(String ruleDetail) {
        this.ruleDetail = ruleDetail;
    }

}
