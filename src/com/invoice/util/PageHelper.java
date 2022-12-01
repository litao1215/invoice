package com.invoice.util;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:11
 */
public class PageHelper<T> {

    //1.总条数
    private int totalCount;

    //2.一页的条数
    private int pageSize;

    //3.第几页 页码
    private int indexPage;

    //4.一共几页
    private int totalPage;

    //5.一页的集合
    private List<T> pageList;

    //6.从第几页开始
    private int startNum;

    public PageHelper() {
    }

    public PageHelper(int totalCount, int pageSize, int indexPage, int totalPage, List<T> pageList, int startNum) {
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.indexPage = indexPage;
        this.totalPage = totalPage;
        this.pageList = pageList;
        this.startNum = startNum;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getIndexPage() {
        return indexPage;
    }

    public void setIndexPage(int indexPage) {
        this.indexPage = indexPage;
    }

    //计算总页数：
    public int getTotalPage() {
        this.totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        return totalPage;
    }

    /*public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }*/

    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }

    //给开始行数赋值：开始行==（当前页-1）*每页显示的行数
    public int getStartNum() {
        return (indexPage - 1) * pageSize;
    }

    /*public void setStartNum(int startNum) {
        this.startNum = startNum;
    }*/
}

