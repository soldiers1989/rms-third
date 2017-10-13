package com.jzfq.rms.third.common.vo;

import java.util.List;

public class RiskCarEvaluationVo {
    // 车架号
    String frameNo ;
    // 品牌信息
    String brandName;
    // 估值信息
    List<EvaluationInfoVo> evaluationInfo;

    public String getFrameNo() {
        return frameNo;
    }

    public void setFrameNo(String frameNo) {
        this.frameNo = frameNo;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<EvaluationInfoVo> getEvaluationInfo() {
        return evaluationInfo;
    }

    public void setEvaluationInfo(List<EvaluationInfoVo> evaluationInfo) {
        this.evaluationInfo = evaluationInfo;
    }
}
