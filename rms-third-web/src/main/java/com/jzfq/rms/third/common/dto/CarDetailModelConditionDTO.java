package com.jzfq.rms.third.common.dto;

public class CarDetailModelConditionDTO {
    // 每一页最多款型数量，默认100
    private int page_size;
    // 页码
    private int page;
    /**
     * 是否必须：false
     * 1.更新的开始时间，格式可以是YY-mm-dd HH:MM:SS或者YY-mm-dd；
     * 2.如果与end_time同时为空则返回最近一个月更新的车型；
     * 3.如果传入字符串‘all’则返回全量车型
     */
    private String start_time;
    /**
     * 是否必须：false
     * 1.更新的结束时间，格式可以是YY-mm-dd HH:MM:SS或者YY-mm-dd；
     * 2.如果与end_time同时为空则返回最近一个月更新的车型;
     * 3.如果start_time不为空，end_time为空的时候默认赋值当前时间
     */
    private String end_time	;

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
}
