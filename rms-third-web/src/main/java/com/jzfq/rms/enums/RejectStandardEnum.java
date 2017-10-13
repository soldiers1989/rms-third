package com.jzfq.rms.enums;

/**
 * 拒绝标准枚举
 * @author 大连桔子分期科技有限公司
 * @date  2016/11/23. 上午10:14:14
 */
public enum RejectStandardEnum {
    /**
     * 欺诈类
     */
    REJECT_STANDARD_D101("D101","前段识别上报伪冒或欺诈等高风险行为"),
    REJECT_STANDARD_D102("D102","信审端查出伪冒申请"),
    REJECT_STANDARD_D103("D103","代办公司/黑中介"),
    REJECT_STANDARD_D104("D104","团伙骗贷"),
    REJECT_STANDARD_D105("D105","关联信息异常"),
    REJECT_STANDARD_D106("D106","申请人命中黑名单库"),
    REJECT_STANDARD_D107("D107","同行欺诈"),
    REJECT_STANDARD_D108("D108","借款用途为套现"),
    REJECT_STANDARD_D109("D109","客户线下所购买数码产品，产品官网，京东，国美，苏宁均不存在或者价格差距过大"),
    REJECT_STANDARD_D110("D110","其他风险情况"),

    /**
     * 虚假类
     */
    REJECT_STANDARD_D201("D201","身份证明虚假"),
    REJECT_STANDARD_D202("D202","工作证明虚假"),
    REJECT_STANDARD_D203("D203","学籍证明虚假"),
    REJECT_STANDARD_D204("D204","工作信息虚假"),
    REJECT_STANDARD_D205("D205","学籍信息虚假"),
    REJECT_STANDARD_D206("D206","提供联系人或联系方式虚假"),
    REJECT_STANDARD_D207("D207","重复申请虚假信息未变"),
    REJECT_STANDARD_D208("D208","其他虚假信息"),

    /**
     * 负面信息类
     */
    REJECT_STANDARD_D301("D301","三方核查有负面信息"),
    REJECT_STANDARD_D302("D302","法院网显示客户有法律纠纷且执行中"),
    REJECT_STANDARD_D303("D303","借款用途异常（现金类）"),
    REJECT_STANDARD_D304("D304","帮助他人代办"),
    REJECT_STANDARD_D305("D305","申请人态度恶劣、不配合"),
    REJECT_STANDARD_D306("D306","本人调查异常"),
    REJECT_STANDARD_D307("D307","单位调查异常"),
    REJECT_STANDARD_D308("D308","其他负面信息"),

    /**
     * 违反基本政策类
     */
    REJECT_STANDARD_D401("D401","手机号码非本人实名制办理"),
    REJECT_STANDARD_D402("D402","手机号码在网时长不满足条件"),
    REJECT_STANDARD_D403("D403","银行卡非本人名下，无法提供代扣银行卡"),
    REJECT_STANDARD_D404("D404","银行卡号无效"),
    REJECT_STANDARD_D405("D405","身份证过期或三天内过期"),
    REJECT_STANDARD_D406("D406","全网分期网址不合规，无法为其购买"),
    REJECT_STANDARD_D407("D407","单位电话非固话"),
    REJECT_STANDARD_D408("D408","三方查询要求不匹配"),
    REJECT_STANDARD_D409("D409","申请期数与最大分期数不符"),
    REJECT_STANDARD_D410("D410","额度超限或低于下限"),
    REJECT_STANDARD_D411("D411","信息填写错误/未填写或资料上传有误"),
    REJECT_STANDARD_D412("D412","其他违反基本政策"),

    /**
     * 违反大纲要求类
     */
    REJECT_STANDARD_D501("D501","年龄不符合大纲要求"),
    REJECT_STANDARD_D502("D502","工作时长不符合大纲要求"),
    REJECT_STANDARD_D503("D503","学制不符合大纲要求"),
    REJECT_STANDARD_D504("D504","工作地，居住地，合作商户任一未在开通范围内"),
    REJECT_STANDARD_D505("D505","历史逾期10天以上或者当月正在逾期"),
    REJECT_STANDARD_D506("D506","专三大四不符合最低分期期数"),
    REJECT_STANDARD_D507("D507","其他违反大纲要求"),
    REJECT_STANDARD_D508("D508","历史逾期30天以上或者当月正在逾期"),
    REJECT_STANDARD_D509("D509","限制区域进件进件"),

    /**
     * 非目标客户
     */
    REJECT_STANDARD_D601("D601","工作性质不符合要求"),
    REJECT_STANDARD_D602("D602","单位状态异常"),
    REJECT_STANDARD_D603("D603","进件人群不符合要求"),
    REJECT_STANDARD_D604("D604","民族不符合要求"),
    REJECT_STANDARD_D605("D605","高危行业/非法职业"),
    REJECT_STANDARD_D606("D606","同行业人员"),

    /**
     * 信息无法核实类
     */
    REJECT_STANDARD_D701("D701","无法提供有效的直系亲属"),
    REJECT_STANDARD_D702("D702","接听者有第三方协助提醒"),
    REJECT_STANDARD_D703("D703","接听者沟通障碍或不配合"),
    REJECT_STANDARD_D704("D704","无法联系申请人"),
    REJECT_STANDARD_D705("D705","无法联系申请人单位"),
    REJECT_STANDARD_D706("D706","无法联系申请人直系亲属"),
    REJECT_STANDARD_D707("D707","其他信息无法核实"),

    /**
     * 综合评级不达标
     */
    REJECT_STANDARD_D801("D801","多家分期平台办理"),
    REJECT_STANDARD_D802("D802","同盾分超限，百融分不足"),
    REJECT_STANDARD_D803("D803","还款能力不足"),
    REJECT_STANDARD_D804("D804","权重分不足"),
    REJECT_STANDARD_D805("D805","综合资质较差"),

    /**
     * 本人放弃类
     */
    REJECT_STANDARD_D901("D901","借款人本人放弃"),

    /**
     * 补件不合规
     */
    REJECT_STANDARD_D1001("D1001","补件超时"),
    REJECT_STANDARD_D1002("D1002","补件无效"),

    /**
     * 测试单拒绝
     */
    REJECT_STANDARD_D1101("D1101","测试单拒绝"),

    /**
     * 交易风险
     */
    REJECT_STANDARD_D1201("D1201","收货地址信息异常"),
    REJECT_STANDARD_D1202("D1202","收货人姓名信息异常"),
    REJECT_STANDARD_D1203("D1203","收货人电话信息异常"),
    REJECT_STANDARD_D1204("D1204","购买产品信息无法明确核实");



    RejectStandardEnum(String code,String name){
        this.code = code;
        this.name = name;
        this.handleMethod = handleMethod;
    }

    private String code;
    private String name;
    private Integer handleMethod;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHandleMethod() {
        return handleMethod;
    }

    public void setHandleMethod(Integer handleMethod) {
        this.handleMethod = handleMethod;
    }

    public static String getName(String code){
        for(RejectStandardEnum c : RejectStandardEnum.values()){
            if(c.getCode().equals(code)){
                return c.getName();
            }
        }
        return null;
    }

}
