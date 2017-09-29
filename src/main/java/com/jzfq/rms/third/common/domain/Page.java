package com.jzfq.rms.third.common.domain;


import com.jzfq.rms.third.common.constant.RmsConstants;

/**
 * 分页
 * @ClassName:  Page
 * @author: 大连桔子分期科技有限公司
 * @date:   2015年11月6日 下午3:34:15
 */
public abstract class Page {

    private int pageNum = 1;
    private int numPerPage = RmsConstants.PAGESIZE;
    
    public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}
	
	public int getStartOfPage() {
		if (pageNum == 0) {
			pageNum = 1;// 页数是从第一页是从1开始计算的
		}
		return (pageNum - 1) * numPerPage;
	}
}
