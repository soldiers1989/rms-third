package com.jzfq.rms.third.common.pojo.tongdun;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/5 10:59.
 **/
public class BodyGuardApiResponse {

    private static final long serialVersionUID = 4152462611121573434L;
    private Boolean success = false;
    private String id;
    private String result_desc;
    private String reason_desc;
    private String reason_code;

    public String getReason_code() {
        return reason_code;
    }

    public void setReason_code(String reason_code) {
        this.reason_code = reason_code;
    }

    public String getResult_desc() {
        return result_desc;
    }

    public void setResult_desc(String result_desc) {
        this.result_desc = result_desc;
    }

    public String getReason_desc() {
        return reason_desc;
    }

    public void setReason_desc(String reason_desc) {
        this.reason_desc = reason_desc;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        if (success) {
            return "BodyGuardApiResponse [success=" + success + ", id=" + id
                    + ", result_desc=" + result_desc + "]";
        } else {
            return "BodyGuardApiResponse [success=" + success
                    + ", reason_code=" + reason_code + ", reason_desc=" + reason_desc + "]";
        }
    }
}
