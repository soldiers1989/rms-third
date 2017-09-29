package com.jzfq.rms.third.common.dto;

import java.util.List;

public class CarModelResponseDTO {
    // 估值请求成功该值为‘success’,失败为‘fail’
    private String status;
    // 对响应估值请求的描述，若请求成功，返回成功的描述信息，失败返回失败原因的描述信息
    private String message;
    // 当前页的款型数据
    private List<CarDetialModelDTO> d_models;
    // 数据总页数
    private int num_pages;
    // 当前页数
    private int page;
    // 每页数据量
    private int per_page;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<CarDetialModelDTO> getD_models() {
        return d_models;
    }

    public void setD_models(List<CarDetialModelDTO> d_models) {
        this.d_models = d_models;
    }

    public int getNum_pages() {
        return num_pages;
    }

    public void setNum_pages(int num_pages) {
        this.num_pages = num_pages;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }
}
