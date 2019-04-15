package com.hld.service.entity;

/**
 * @author: ykbian
 * @date: 2019/4/14 22:10
 * @Description:
 */
public class pagecondition {

    public int pageIndex;
    public int pageSize;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
