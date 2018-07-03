package com.jzfq.rms.third.web.action.util.cleanParse;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.domain.*;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;

import java.util.Date;
import java.util.UUID;

public class BrParser {


    /**
     * t_third_br_swift_order_data 百融 订单流水关联表
     *
     * @param json
     * @return
     */

    public static TThirdBrSwiftOrderData getBrSwiftData(JSONObject json, String orderNo, String traceId, String name, String idCard, String phone) {
        TThirdBrSwiftOrderData data = new TThirdBrSwiftOrderData();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setcSwiftNumber(json.getString("swift_number"));//流水号
        data.setcOrderNo(orderNo);
        data.setcTraceId(traceId);
        data.setcName(name);
        data.setcIdCard(idCard);
        data.setcPhone(phone);
        data.setcCreattime(new Date());
        return data;
    }

    /**
     * t_third_br_score 百融分信息表
     *
     * @param json
     * @return
     */

    public static TThirdBrScore getScoreInfoData(JSONObject json) {
        TThirdBrScore data = new TThirdBrScore();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setSwiftNumber(json.getString("swift_number"));
        data.setcFlagScore(json.getString("flag_score"));
        data.setcScoreafpdl(json.getString("scoreafpdl"));
        data.setcScoreafcashon(json.getString("scoreafcashon"));
        data.setcScoreafautofin(json.getString("scoreafautofin"));
        data.setcScoreafcashoff(json.getString("scoreafcashoff"));
        data.setcScoreafconsoff(json.getString("scoreafconsoff"));
        data.setcScoreafrevoloan(json.getString("scoreafrevoloan"));
        data.setcScoreScoreafcust(json.getString("Score_scoreafcust"));
        data.setcScorebankv2(json.getString("scorebankv2"));
        data.setcScoreconsoffv2(json.getString("scoreconsoffv2"));
        data.setcScorepettycashv1(json.getString("scorepettycashv1"));
        data.setcScorelargecashv1(json.getString("scorelargecashv1"));
        data.setcScorelargecashv2(json.getString("scorelargecashv2"));
        data.setcScorecust(json.getString("scorecust"));
        data.setcCreattime(new Date());
        return data;
    }


    /**
     * t_third_br_rule 百融规则信息表
     *
     * @param json
     * @return
     */

    public static TThirdBrRule getBrRuleInfoData(JSONObject json) {
        TThirdBrRule data = new TThirdBrRule();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setSwiftNumber(json.getString("swift_number"));
        data.setcFlagRulespeciallist(json.getString("flag_rulespeciallist"));
        data.setcFlagRuleapplyloanRevoloan(json.getString("flag_ruleapplyloan_revoloan"));
        data.setcFlagRuleapplyloanAutofin(json.getString("flag_RuleApplyLoan_autofin"));
        data.setcFlagRuleapplyloanConsoff(json.getString("flag_ruleapplyloan_consoff"));
        data.setcFlagRuleapplyloanCashon(json.getString("flag_ruleapplyloan_cashon"));
        data.setcFlagRuleapplyloanPdl(json.getString("flag_ruleapplyloan_pdl"));
        data.setcFlagRuleapplyloanCashoff(json.getString("flag_ruleapplyloan_cashoff"));
        data.setcFlagRuleexecution(json.getString("flag_ruleexecution"));
        data.setcFlagRuleinforelationRevoloan(json.getString("flag_ruleinforelation_revoloan"));
        data.setcFlagRuleinforelationCashoff(json.getString("flag_ruleinforelation_cashoff"));
        data.setcFlagRuleinforelationPdl(json.getString("flag_ruleinforelation_pdl"));
        data.setcFlagRuleinforelationCashon(json.getString("flag_ruleinforelation_cashon"));
        data.setcFlagRuleinforelationConsoff(json.getString("flag_ruleinforelation_consoff"));
        data.setcFlagRuleinforelationAutofin(json.getString("flag_ruleinforelation_autofin"));
        data.setcRuleFinalDecision(json.getString("Rule_final_decision"));
        data.setcRuleFinalWeight(json.getString("Rule_final_weight"));
        data.setcRuleNameQjs010(json.getString("Rule_name_QJS010"));
        data.setcRuleWeightQjs010(json.getString("Rule_weight_QJS010"));
        data.setcRuleNameCab001(json.getString("Rule_name_CAB001"));
        data.setcRuleWeightCab001(json.getString("Rule_weight_CAB001"));
        data.setcRuleNameCac001(json.getString("Rule_name_CAC001"));
        data.setcRuleWeightCac001(json.getString("Rule_weight_CAC001"));
        data.setcRuleNameCad001(json.getString("Rule_name_CAD001"));
        data.setcRuleWeightCad001(json.getString("Rule_weight_CAD001"));
        data.setcRuleNameCae001(json.getString("Rule_name_CAE001"));
        data.setcRuleWeightCae001(json.getString("Rule_weight_CAE001"));
        data.setcRuleNameCaf001(json.getString("Rule_name_CAF001"));
        data.setcRuleWeightCaf001(json.getString("Rule_weight_CAF001"));
        data.setcRuleNameCag001(json.getString("Rule_name_CAG001"));
        data.setcRuleWeightCag001(json.getString("Rule_weight_CAG001"));
        data.setcRuleNameQje010(json.getString("Rule_name_QJE010"));
        data.setcRuleWeightQje010(json.getString("Rule_weight_QJE010"));
        data.setcRuleNameQje020(json.getString("Rule_name_QJE020"));
        data.setcRuleWeightQje020(json.getString("Rule_weight_QJE020"));
        data.setcRuleNameCbb001(json.getString("Rule_name_CBB001"));
        data.setcRuleWeightCbb001(json.getString("Rule_weight_CBB001"));
        data.setcRuleNameCbg003(json.getString("Rule_name_CBG003"));
        data.setcRuleWeightCbg003(json.getString("Rule_weight_CBG003"));
        data.setcRuleNameCbf001(json.getString("Rule_name_CBF001"));
        data.setcRuleWeightCbf001(json.getString("Rule_weight_CBF001"));
        data.setcRuleNameCbe001(json.getString("Rule_name_CBE001"));
        data.setcRuleWeightCbe001(json.getString("Rule_weight_CBE001"));
        data.setcRuleNameCbd003(json.getString("Rule_name_CBD003"));
        data.setcRuleWeightCbd003(json.getString("Rule_weight_CBD003"));
        data.setcRuleNameCbc003(json.getString("Rule_name_CBC003"));
        data.setcRuleWeightCbc003(json.getString("Rule_weight_CBC003"));
        data.setcCreattime(new Date());
        return data;
    }


    /**
     * t_third_br_specia_list 百融特殊名单信息表
     *
     * @param json
     * @return
     */

    public static TThirdBrSpecialList getBrSpeciaInfoData(JSONObject json) {
        TThirdBrSpecialList data = new TThirdBrSpecialList();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setSwiftNumber(json.getString("swift_number"));
        data.setcLinkmanCell(json.getString("flag_rulespeciallist"));
        data.setcTimeRange(json.getString("flag_ruleapplyloan_revoloan"));
        data.setcFlagSpeciallistC(json.getString("flag_RuleApplyLoan_autofin"));
        data.setcSlIdAbnormal(json.getString("flag_ruleapplyloan_consoff"));
        data.setcSlIdPhoneOverdue(json.getString("flag_ruleapplyloan_cashon"));
        data.setcSlIdCourtBad(json.getString("flag_ruleapplyloan_pdl"));
        data.setcSlIdBankOverdue(json.getString("flag_ruleapplyloan_cashoff"));
        data.setcSlIdBankFraud(json.getString("flag_ruleexecution"));
        data.setcSlIdBankLost(json.getString("flag_ruleinforelation_revoloan"));
        data.setcSlIdBankRefuse(json.getString("flag_ruleinforelation_cashoff"));
        data.setcSlIdP2pBad(json.getString("flag_ruleinforelation_pdl"));
        data.setcSlIdP2pOverdue(json.getString("flag_ruleinforelation_cashon"));
        data.setcSlIdP2pFraud(json.getString("flag_ruleinforelation_consoff"));
        data.setcSlIdP2pLost(json.getString("flag_ruleinforelation_autofin"));
        data.setcSlIdP2pRefuse(json.getString("Rule_final_decision"));
        data.setcSlIdNbankP2pBad(json.getString("Rule_final_weight"));
        data.setcSlIdNbankP2pOverdue(json.getString("Rule_name_QJS010"));
        data.setcSlIdNbankP2pFraud(json.getString("Rule_weight_QJS010"));
        data.setcSlIdNbankP2pLost(json.getString("Rule_name_CAB001"));
        data.setcSlIdNbankP2pRefuse(json.getString("Rule_weight_CAB001"));
        data.setcSlIdNbankMcBad(json.getString("Rule_name_CAC001"));
        data.setcSlIdNbankMcOverdue(json.getString("Rule_weight_CAC001"));
        data.setcSlIdNbankMcFraud(json.getString("Rule_name_CAD001"));
        data.setcSlIdNbankMcLost(json.getString("Rule_weight_CAD001"));
        data.setcSlIdNbankMcRefuse(json.getString("Rule_name_CAE001"));
        data.setcSlIdNbankCaBad(json.getString("Rule_weight_CAE001"));
        data.setcSlIdNbankCaOverdue(json.getString("Rule_name_CAF001"));
        data.setcSlIdNbankCaFraud(json.getString("Rule_weight_CAF001"));
        data.setcSlIdNbankCaLost(json.getString("Rule_name_CAG001"));
        data.setcSlIdNbankCaRefuse(json.getString("Rule_weight_CAG001"));
        data.setcSlIdNbankComBad(json.getString("Rule_name_QJE010"));
        data.setcSlIdNbankComOverdue(json.getString("Rule_weight_QJE010"));
        data.setcSlIdNbankComFraud(json.getString("Rule_name_QJE020"));
        data.setcSlIdNbankComLost(json.getString("Rule_weight_QJE020"));
        data.setcSlIdNbankComRefuse(json.getString("Rule_name_CBB001"));
        data.setcSlIdNbankCfBad(json.getString("Rule_weight_CBB001"));
        data.setcSlIdNbankCfOverdue(json.getString("Rule_name_CBG003"));
        data.setcSlIdNbankCfFraud(json.getString("Rule_weight_CBG003"));
        data.setcSlIdNbankCfLost(json.getString("Rule_name_CBF001"));
        data.setcSlIdNbankCfRefuse(json.getString("Rule_weight_CBF001"));
        data.setcSlIdNbankOtherBad(json.getString("Rule_name_CBE001"));
        data.setcSlIdNbankOtherOverdue(json.getString("Rule_weight_CBE001"));
        data.setcSlIdNbankOtherFraud(json.getString("Rule_name_CBD003"));
        data.setcSlIdNbankOtherLost(json.getString("Rule_weight_CBD003"));
        data.setcSlIdNbankOtherRefuse(json.getString("Rule_name_CBC003"));
        data.setcSlCellAbnormal(json.getString("Rule_name_CBC003"));
        data.setcSlCellPhoneOverdue(json.getString("Rule_name_CBC003"));
        data.setcSlCellBankBad(json.getString("Rule_name_CBC003"));
        data.setcSlCellBankOverdue(json.getString("Rule_name_CBC003"));
        data.setcSlCellBankFraud(json.getString("Rule_name_CBC003"));
        data.setcSlCellBankLost(json.getString("Rule_name_CBC003"));
        data.setcSlCellBankRefuse(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellAbnormal(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellBankBad(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellBankOverdue(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellBankFraud(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellBankLost(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellBankRefuse(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankP2pBad(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankP2pOverdue(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankP2pFraud(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankP2pLost(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankP2pRefuse(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankMcBad(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankMcOverdue(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankMcFraud(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankMcLost(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankMcRefuse(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankCaBad(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankCaOverdue(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankCaFraud(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankCaLost(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankCaRefuse(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankComBad(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankComOverdue(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankComFraud(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankComLost(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankComRefuse(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankCfBad(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankCfOverdue(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankCfFraud(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankCfLost(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankCfRefuse(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankOtherBad(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankOtherOverdue(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankOtherFraud(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankOtherLost(json.getString("Rule_name_CBC003"));
        data.setcSlLmCellNbankOtherRefuse(json.getString("Rule_name_CBC003"));
        data.setcCreattime(new Date());
        return data;
    }


    /**
     * t_third_br_real_list 百融实名认证信息表
     *
     * @param json
     * @return
     */

    public static TThirdBrRealInfo getBrRealInfoData(JSONObject json) {
        TThirdBrRealInfo data = new TThirdBrRealInfo();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setSwiftNumber(json.getString("swift_number"));
        data.setcLinkmanCell(json.getString("linkman_cell"));
        data.setcTelHome(json.getString("tel_home"));
        data.setcHomeAddr(json.getString("home_addr"));
        data.setcFlagInforelation(json.getString("flag_inforelation"));
        data.setcIrIdXCellCnt(json.getString("ir_id_x_cell_cnt"));
        data.setcIrIdXMailCnt(json.getString("ir_id_x_mail_cnt"));
        data.setcIrIdXNameCnt(json.getString("ir_id_x_name_cnt"));
        data.setcIrCellXIdCnt(json.getString("ir_cell_x_id_cnt"));
        data.setcIrCellXMailCnt(json.getString("ir_cell_x_mail_cnt"));
        data.setcIrCellXNameCnt(json.getString("ir_cell_x_name_cnt"));
        data.setcIrIdInlistwithCell(json.getString("ir_id_inlistwith_cell"));
        data.setcIrCellInlistwithId(json.getString("ir_cell_inlistwith_id"));
        data.setcIrAllmatchDays(json.getString("ir_allmatch_days"));
        data.setcIrIdXCellNotmatDays(json.getString("ir_id_x_cell_notmat_days"));
        data.setcIrCellXIdNotmatDays(json.getString("ir_cell_x_id_notmat_days"));
        data.setcIrIdXCellLastchgDays(json.getString("ir_id_x_cell_lastchg_days"));
        data.setcIrCellXIdLastchgDays(json.getString("ir_cell_x_id_lastchg_days"));
        data.setcIrIdIsReabnormal(json.getString("ir_id_is_reabnormal"));
        data.setcIrCellIsReabnormal(json.getString("ir_cell_is_reabnormal"));
        data.setcIrMailIsReabnormal(json.getString("ir_mail_is_reabnormal"));
        data.setcIrM1IdXCellCnt(json.getString("ir_m1_id_x_cell_cnt"));
        data.setcIrM1IdXMailCnt(json.getString("ir_m1_id_x_mail_cnt"));
        data.setcIrM1IdXNameCnt(json.getString("ir_m1_id_x_name_cnt"));
        data.setcIrM1CellXIdCnt(json.getString("ir_m1_cell_x_id_cnt"));
        data.setcIrM1CellXMailCnt(json.getString("ir_m1_cell_x_mail_cnt"));
        data.setcIrM1CellXNameCnt(json.getString("ir_cell_x_name_cnt"));
        data.setcIrM1IdXTelHomeCnt(json.getString("ir_m1_id_x_tel_home_cnt"));
        data.setcIrM1IdXHomeAddrCnt(json.getString("ir_m1_id_x_home_addr_cnt"));
        data.setcIrM1CellXTelHomeCnt(json.getString("ir_m1_cell_x_tel_home_cnt"));
        data.setcIrM1CellXHomeAddrCnt(json.getString("ir_m1_cell_x_home_addr_cnt"));
        data.setcIrM1CellXBizAddrCnt(json.getString("ir_m1_cell_x_biz_addr_cnt"));
        data.setcIrM1LinkmanCellXIdCnt(json.getString("ir_m1_linkman_cell_x_id_cnt"));
        data.setcIrM1LinkmanCellXTelHomeCnt(json.getString("ir_m1_linkman_cell_x_cell_cnt"));
        data.setcIrM1LinkmanCellXTelHomeCnt(json.getString("ir_m1_linkman_cell_x_tel_home_cnt"));
        data.setcIrM1TelHomeXCellCnt(json.getString("ir_m1_tel_home_x_cell_cnt"));
        data.setcIrM1TelHomeXIdCnt(json.getString("ir_m1_tel_home_x_id_cnt"));
        data.setcIrM1HomeAddrXCellCnt(json.getString("ir_m1_home_addr_x_cell_cnt"));
        data.setcIrM1HomeAddrXIdCnt(json.getString("ir_m1_home_addr_x_id_cnt"));
        data.setcIrM1TelHomeXHomeAddrCnt(json.getString("ir_m1_tel_home_x_home_addr_cnt"));
        data.setcIrM1HomeAddrXTelHomeCnt(json.getString("ir_m1_home_addr_x_tel_home_cnt"));
        data.setcIrM3IdXCellCnt(json.getString("ir_m3_id_x_cell_cnt"));
        data.setcIrM3IdXMailCnt(json.getString("ir_m3_id_x_mail_cnt"));
        data.setcIrM3IdXNameCnt(json.getString("ir_m3_id_x_name_cnt"));
        data.setcIrM3CellXIdCnt(json.getString("ir_m3_cell_x_id_cnt"));
        data.setcIrM3CellXMailCnt(json.getString("ir_m3_cell_x_mail_cnt"));
        data.setcIrM3CellXNameCnt(json.getString("ir_m3_cell_x_name_cnt"));
        data.setcIrM3IdXTelHomeCnt(json.getString("ir_m3_id_x_tel_home_cnt"));
        data.setcIrM3IdXHomeAddrCnt(json.getString("ir_m3_id_x_home_addr_cnt"));
        data.setcIrM3IdXBizAddrCnt(json.getString("ir_m3_id_x_biz_addr_cnt"));
        data.setcIrM3CellXTelHomeCnt(json.getString("ir_m3_cell_x_tel_home_cnt"));
        data.setcIrM3CellXHomeAddrCnt(json.getString("ir_m3_cell_x_home_addr_cnt"));
        data.setcIrM3CellXBizAddrCnt(json.getString("ir_m3_cell_x_biz_addr_cnt"));
        data.setcIrM3LinkmanCellXIdCnt(json.getString("ir_m3_linkman_cell_x_id_cnt"));
        data.setcIrM3LinkmanCellXCellCnt(json.getString("ir_m3_linkman_cell_x_cell_cnt"));
        data.setcIrM3LinkmanCellXTelHomeCnt(json.getString("ir_m3_linkman_cell_x_tel_home_cnt"));
        data.setcIrM3TelHomeXCellCnt(json.getString("ir_m3_tel_home_x_cell_cnt"));
        data.setcIrM3TelHomeXIdCnt(json.getString("ir_m3_tel_home_x_id_cnt"));
        data.setcIrM3HomeAddrXCellCnt(json.getString("ir_m3_home_addr_x_cell_cnt"));
        data.setcIrM3HomeAddrXIdCnt(json.getString("ir_m3_home_addr_x_id_cnt"));
        data.setcIrM3TelHomeXHomeAddrCnt(json.getString("ir_m3_tel_home_x_home_addr_cnt"));
        data.setcIrM3HomeAddrXTelHomeCnt(json.getString("ir_m3_home_addr_x_tel_home_cnt"));
        data.setcIrM6IdXCellCnt(json.getString("ir_m6_id_x_cell_cnt"));
        data.setcIrM6IdXMailCnt(json.getString("ir_m6_id_x_mail_cnt"));
        data.setcIrM6IdXNameCnt(json.getString("ir_m6_id_x_name_cnt"));
        data.setcIrM6CellXIdCnt(json.getString("ir_m6_cell_x_id_cnt"));
        data.setcIrM6CellXMailCnt(json.getString("ir_m6_cell_x_mail_cnt"));
        data.setcIrM6CellXNameCnt(json.getString("ir_m6_cell_x_name_cnt"));
        data.setcIrM6IdXTelHomeCnt(json.getString("ir_m6_id_x_tel_home_cnt"));
        data.setcIrM6IdXHomeAddrCnt(json.getString("ir_m6_id_x_home_addr_cnt"));
        data.setcIrM6IdXBizAddrCnt(json.getString("ir_m6_id_x_biz_addr_cnt"));
        data.setcIrM6CellXTelHomeCnt(json.getString("ir_m6_cell_x_tel_home_cnt"));
        data.setcIrM6CellXHomeAddrCnt(json.getString("ir_m6_cell_x_home_addr_cnt"));
        data.setcIrM6CellXBizAddrCnt(json.getString("ir_m6_cell_x_biz_addr_cnt"));
        data.setcIrM6LinkmanCellXIdCnt(json.getString("ir_m6_linkman_cell_x_id_cnt"));
        data.setcIrM6LinkmanCellXCellCnt(json.getString("ir_m6_linkman_cell_x_cell_cnt"));
        data.setcIrM6LinkmanCellXTelHomeCnt(json.getString("ir_m6_linkman_cell_x_tel_home_cnt"));
        data.setcIrM6TelHomeXCellCnt(json.getString("ir_m6_tel_home_x_cell_cnt"));
        data.setcIrM6TelHomeXIdCnt(json.getString("ir_m6_tel_home_x_id_cnt"));
        data.setcIrM6HomeAddrXCellCnt(json.getString("ir_m6_home_addr_x_cell_cnt"));
        data.setcIrM6HomeAddrXIdCnt(json.getString("ir_m6_home_addr_x_id_cnt"));
        data.setcIrM6TelHomeXHomeAddrCnt(json.getString("ir_m6_tel_home_x_home_addr_cnt"));
        data.setcIrM6HomeAddrXTelHomeCnt(json.getString("ir_m6_home_addr_x_tel_home_cnt"));
        data.setcIrM12IdXCellCnt(json.getString("ir_m12_id_x_cell_cnt"));
        data.setcIrM12IdXMailCnt(json.getString("ir_m12_id_x_mail_cnt"));
        data.setcIrM12IdXNameCnt(json.getString("ir_m12_id_x_name_cnt"));
        data.setcIrM12CellXIdCnt(json.getString("ir_m12_cell_x_id_cnt"));
        data.setcIrM12CellXMailCnt(json.getString("ir_m12_cell_x_mail_cnt"));
        data.setcIrM12CellXNameCnt(json.getString("ir_m12_cell_x_name_cnt"));
        data.setcIrM12IdXTelHomeCnt(json.getString("ir_m12_id_x_tel_home_cnt"));
        data.setcIrM12IdXHomeAddrCnt(json.getString("ir_m12_id_x_home_addr_cnt"));
        data.setcIrM12IdXBizAddrCnt(json.getString("ir_m12_id_x_biz_addr_cnt"));
        data.setcIrM12CellXTelHomeCnt(json.getString("ir_m12_cell_x_tel_home_cnt"));
        data.setcIrM12CellXHomeAddrCnt(json.getString("ir_m12_cell_x_home_addr_cnt"));
        data.setcIrM12CellXBizAddrCnt(json.getString("ir_m12_cell_x_biz_addr_cnt"));
        data.setcIrM12LinkmanCellXIdCnt(json.getString("ir_m12_linkman_cell_x_id_cnt"));
        data.setcIrM12LinkmanCellXCellCnt(json.getString("ir_m12_linkman_cell_x_cell_cnt"));
        data.setcIrM12LinkmanCellXTelHomeCnt(json.getString("ir_m12_linkman_cell_x_tel_home_cnt"));
        data.setcIrM12TelHomeXCellCnt(json.getString("ir_m12_tel_home_x_cell_cnt"));
        data.setcIrM12TelHomeXIdCnt(json.getString("ir_m12_tel_home_x_id_cnt"));
        data.setcIrM12HomeAddrXCellCnt(json.getString("ir_m12_home_addr_x_cell_cnt"));
        data.setcIrM12HomeAddrXIdCnt(json.getString("ir_m12_home_addr_x_id_cnt"));
        data.setcIrM12TelHomeXHomeAddrCnt(json.getString("ir_m12_tel_home_x_home_addr_cnt"));
        data.setcIrM12HomeAddrXTelHomeCnt(json.getString("ir_m12_home_addr_x_tel_home_cnt"));
        data.setcCreattime(new Date());
        return data;
    }


    /**
     * t_third_br_execut_list 百法院被执行人信息表
     *
     * @param json
     * @return
     */

    public static TThirdBrExecutInfo getBrExecutInfoData(JSONObject json) {
        TThirdBrExecutInfo data = new TThirdBrExecutInfo();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setSwiftNumber(json.getString("swift_number"));
        data.setcFlagExecution(json.getString("flag_execution"));
        data.setcExBad1Name(json.getString("ex_bad1_name"));
        data.setcExBad1Cid(json.getString("ex_bad1_cid"));
        data.setcExBad1Cidtype(json.getString("ex_bad1_cidtype"));
        data.setcExBad1Datatime(json.getString("ex_bad1_datatime"));
        data.setcExBad1Datatypeid(json.getString("ex_bad1_datatypeid"));
        data.setcExBad1Datatype(json.getString("ex_bad1_datatype"));
        data.setcExBad1Leader(json.getString("ex_bad1_leader"));
        data.setcExBad1Address(json.getString("ex_bad1_address"));
        data.setcExBad1Court(json.getString("ex_bad1_court"));
        data.setcExBad1Time(json.getString("ex_bad1_time"));
        data.setcExBad1Casenum(json.getString("ex_bad1_casenum"));
        data.setcExBad1Money(json.getString("ex_bad1_money"));
        data.setcExBad1Base(json.getString("ex_bad1_base"));
        data.setcExBad1Basecompany(json.getString("ex_bad1_basecompany"));
        data.setcExBad1Obligation(json.getString("ex_bad1_obligation"));
        data.setcExBad1Lasttime(json.getString("ex_bad1_lasttime"));
        data.setcExBad1Performance(json.getString("ex_bad1_performance"));
        data.setcExBad1Concretesituation(json.getString("ex_bad1_concretesituation"));
        data.setcExBad1Breaktime(json.getString("ex_bad1_breaktime"));
        data.setcExBad1Posttime(json.getString("ex_bad1_posttime"));
        data.setcExBad1Performedpart(json.getString("ex_bad1_performedpart"));
        data.setcExBad1Unperformpart(json.getString("ex_bad1_unperformpart"));
        data.setcExExecut1Name(json.getString("ex_execut1_name"));
        data.setcExExecut1Cid(json.getString("ex_execut1_cid"));
        data.setcExExecut1Cidtype(json.getString("ex_execut1_cidtype"));
        data.setcExExecut1Datatime(json.getString("ex_execut1_datatime"));
        data.setcExExecut1Datatypeid(json.getString("ex_execut1_datatypeid"));
        data.setcExExecut1Datatype(json.getString("ex_execut1_datatype"));
        data.setcExExecut1Court(json.getString("ex_execut1_court"));
        data.setcExExecut1Time(json.getString("ex_execut1_time"));
        data.setcExExecut1Casenum(json.getString("ex_execut1_casenum"));
        data.setcExExecut1Money(json.getString("ex_execut1_money"));
        data.setcExExecut1Statute(json.getString("ex_execut1_statute"));
        data.setcExExecut1Basic(json.getString("ex_execut1_basic"));
        data.setcExExecut1Basiccourt(json.getString("ex_execut1_basiccourt"));
        data.setcExBad10Name(json.getString("ex_bad10_name"));
        data.setcExBad10Cid(json.getString("ex_bad10_cid"));
        data.setcExBad10Cidtype(json.getString("ex_bad10_cidtype"));
        data.setcExBad10Datatime(json.getString("ex_bad10_datatime"));
        data.setcExBad10Datatypeid(json.getString("ex_bad10_datatypeid"));
        data.setcExBad10Datatype(json.getString("ex_bad10_datatype"));
        data.setcExBad10Leader(json.getString("ex_bad10_leader"));
        data.setcExBad10Address(json.getString("ex_bad10_address"));
        data.setcExBad10Court(json.getString("ex_bad10_court"));
        data.setcExBad10Time(json.getString("ex_bad10_time"));
        data.setcExBad10Casenum(json.getString("ex_bad10_casenum"));
        data.setcExBad10Money(json.getString("ex_bad10_money"));
        data.setcExBad10Base(json.getString("ex_bad10_base"));
        data.setcExBad10Basecompany(json.getString("ex_bad10_basecompany"));
        data.setcExBad10Obligation(json.getString("ex_bad10_obligation"));
        data.setcExBad10Lasttime(json.getString("ex_bad10_lasttime"));
        data.setcExBad10Performance(json.getString("ex_bad10_performance"));
        data.setcExBad10Concretesituation(json.getString("ex_bad10_concretesituation"));
        data.setcExBad10Breaktime(json.getString("ex_bad10_breaktime"));
        data.setcExBad10Posttime(json.getString("ex_bad10_posttime"));
        data.setcExBad10Performedpart(json.getString("ex_bad10_performedpart"));
        data.setcExBad10Unperformpart(json.getString("ex_bad10_unperformpart"));
        data.setcExBad10Name(json.getString("ex_execut10_name"));
        data.setcExExecut10Cid(json.getString("ex_execut10_cid"));
        data.setcExExecut10Cidtype(json.getString("ex_execut10_cidtype"));
        data.setcExExecut10Datatime(json.getString("ex_execut10_datatime"));
        data.setcExExecut10Datatypeid(json.getString("ex_execut10_datatypeid"));
        data.setcExExecut10Datatype(json.getString("ex_execut10_datatype"));
        data.setcExExecut10Court(json.getString("ex_execut10_court"));
        data.setcExExecut10Time(json.getString("ex_execut10_time"));
        data.setcExExecut10Casenum(json.getString("ex_execut10_casenum"));
        data.setcExExecut10Money(json.getString("ex_execut10_money"));
        data.setcExExecut10Statute(json.getString("ex_execut10_statute"));
        data.setcExExecut10Basic(json.getString("ex_execut10_basic"));
        data.setcExExecut10Basiccourt(json.getString("ex_execut10_basiccourt"));
        data.setcCreattime(new Date());
        return data;
    }


    /**
     * t_third_br_stab_info 百融稳定性指数信息表
     *
     * @param json
     * @return
     */

    public static TThirdBrStabInfo getBrStabInfoData(JSONObject json) {
        TThirdBrStabInfo data = new TThirdBrStabInfo();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setSwiftNumber(json.getString("swift_number"));
        data.setcMail(json.getString("mail"));
        data.setcTelBiz(json.getString("tel_biz"));
        data.setcTelHome(json.getString("tel_home"));
        data.setcFlagStabilityC(json.getString("flag_stability_c"));
        data.setcStabAuthId(json.getString("stab_auth_id"));
        data.setcStabAuthCell(json.getString("stab_auth_cell"));
        data.setcStabAuthMail(json.getString("stab_auth_mail"));
        data.setcStabAuthKeyRelation(json.getString("stab_auth_key_relation"));
        data.setcStabAuthName(json.getString("stab_auth_name"));
        data.setcStabAuthIdName(json.getString("stab_auth_id_name"));
        data.setcStabAuthBizTel(json.getString("stab_auth_biz_tel"));
        data.setcStabAuthHomeTel(json.getString("stab_auth_home_tel"));
        data.setcStabIdNum(json.getString("stab_id_num"));
        data.setcStabCellNum(json.getString("stab_cell_num"));
        data.setcStabCellFirsttime(json.getString("stab_cell_firsttime"));
        data.setcStabMailNum(json.getString("stab_mail_num"));
        data.setcStabNameNum(json.getString("stab_name_num"));
        data.setcStabTelNum(json.getString("stab_tel_num"));
        data.setcStabAddrNum(json.getString("stab_addr_num"));
        data.setcCreattime(new Date());
        return data;
    }

    /**
     * t_third_br_cons_info 百融商品消费评估信息表
     *
     * @param json
     * @return
     */

    public static TThirdBrConsInfo getBrConsInfoData(JSONObject json) {
        TThirdBrConsInfo data = new TThirdBrConsInfo();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setSwiftNumber(json.getString("swift_number"));
        data.setcMail(json.getString("mail"));
        data.setcFlagConsumptionC(json.getString("flag_consumption_c"));
        data.setcConsCont(json.getString("cons_cont"));
        data.setcConsTimeRecent(json.getString("cons_time_recent"));
        data.setcConsTotM3Visits(json.getString("cons_tot_m3_visits"));
        data.setcConsTotM3Num(json.getString("cons_tot_m3_num"));
        data.setcConsTotM3Pay(json.getString("cons_tot_m3_pay"));
        data.setcConsTotM3PCatenum(json.getString("cons_tot_m3_p_catenum"));
        data.setcConsTotM3VCatenum(json.getString("cons_tot_m3_v_catenum"));
        data.setcConsTotM12Visits(json.getString("cons_tot_m12_visits"));
        data.setcConsTotM12Num(json.getString("cons_tot_m12_num"));
        data.setcConsTotM12Pay(json.getString("cons_tot_m12_pay"));
        data.setcConsTotM12PCatenum(json.getString("cons_tot_m12_p_catenum"));
        data.setcConsTotM12VCatenum(json.getString("cons_tot_m12_v_catenum"));
        data.setcConsMaxM3Num(json.getString("cons_max_m3_num"));
        data.setcConsMaxM3Pay(json.getString("cons_max_m3_pay"));
        data.setcConsMaxM3Paycate(json.getString("cons_max_m3_paycate"));
        data.setcConsMaxM12Num(json.getString("cons_max_m12_num"));
        data.setcConsMaxM12Pay(json.getString("cons_max_m12_pay"));
        data.setcConsMaxM12Paycate(json.getString("cons_max_m12_paycate"));
        data.setcConsM3RybhNum(json.getString("cons_m3_RYBH_num"));
        data.setcConsM3RybhPay(json.getString("cons_m3_RYBH_pay"));
        data.setcConsM3JydqNum(json.getString("cons_m3_JYDQ_num"));
        data.setcConsM3JydqPay(json.getString("cons_m3_JYDQ_pay"));
        data.setcConsM3MyypNum(json.getString("cons_m3_MYYP_num"));
        data.setcConsM3MyypPay(json.getString("cons_m3_MYYP_pay"));
        data.setcConsM12RybhNum(json.getString("cons_m12_RYBH_num"));
        data.setcConsM12RybhPay(json.getString("cons_m12_RYBH_pay"));
        data.setcConsM12JydqNum(json.getString("cons_m12_JYDQ_num"));
        data.setcConsM12JydqPay(json.getString("cons_m12_JYDQ_pay"));
        data.setcConsM12MyypNum(json.getString("cons_m12_MYYP_num"));
        data.setcConsM12MyypPay(json.getString("cons_m12_MYYP_pay"));
        data.setcCreattime(new Date());
        return data;
    }


}
