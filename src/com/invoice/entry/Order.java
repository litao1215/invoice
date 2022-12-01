package com.invoice.entry;

import java.util.Date;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:17
 */
//订单表
public class Order {
    private int id;//主键
    private String no;//订单编号
    private Double totalamount;//订单总金额
    private int enterpriseid;//企业id
    private String enterprisename;//相关企业名称
    private String invoicingstatus;//开票状态
    private int invoicingrecordid;//开票记录表主键
    private Date createtime;//创建时间

    public Order() {
    }

    public Order(int id, String no, Double totalamount, int enterpriseid, String enterprisename, String invoicingstatus, int invoicingrecordid, Date createtime) {
        this.id = id;
        this.no = no;
        this.totalamount = totalamount;
        this.enterpriseid = enterpriseid;
        this.enterprisename = enterprisename;
        this.invoicingstatus = invoicingstatus;
        this.invoicingrecordid = invoicingrecordid;
        this.createtime = createtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Double getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Double totalamount) {
        this.totalamount = totalamount;
    }

    public int getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(int enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename;
    }

    public String getInvoicingstatus() {
        return invoicingstatus;
    }

    public void setInvoicingstatus(String invoicingstatus) {
        this.invoicingstatus = invoicingstatus;
    }

    public int getInvoicingrecordid() {
        return invoicingrecordid;
    }

    public void setInvoicingrecordid(int invoicingrecordid) {
        this.invoicingrecordid = invoicingrecordid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", totalamount=" + totalamount +
                ", enterpriseid=" + enterpriseid +
                ", enterprisename='" + enterprisename + '\'' +
                ", invoicingstatus='" + invoicingstatus + '\'' +
                ", invoicingrecordid=" + invoicingrecordid +
                ", createtime=" + createtime +
                '}';
    }
}
