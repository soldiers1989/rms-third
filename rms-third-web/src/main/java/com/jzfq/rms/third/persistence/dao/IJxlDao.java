package com.jzfq.rms.third.persistence.dao;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 19:43.
 **/
public interface IJxlDao {
    String getAccessTokenUrl();

    String getAccessReportStatusUrl();

    String getAccessReportDataUrl();

    String getAccessRawDataUrl();

    String getAccessBusiRawDataUrl();

    String getAccessReportStatusByTokenUrl();

    String getAccessReportDataByTokenUrl();

    String getAccessRawDataByTokenUrl();

    String getAccessBusiRawDataByTokenUrl();
}
