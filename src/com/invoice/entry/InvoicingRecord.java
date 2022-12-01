package com.invoice.entry;

import java.util.Date;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:19
 */
//开票记录表
public class InvoicingRecord {
    private int id;//主键
    private Double amount;//发票金额
    private int enterpriseid;//开票企业id
    private int creatorid;//申请人id
    private Date createtime;//申请时间
    private String category;//发票种类
    private String type;//发票类型
    private String status;//处理状态
    private int basedataid;//基本信息主键
    private int addressid;//邮寄地址主键
    private int emailid;//电子邮箱主键
    private String uplinkaddress;//上链地址

    public InvoicingRecord() {
    }

    public InvoicingRecord(int id, Double amount, int enterpriseid, int creatorid, Date createtime, String category, String type, String status, int basedataid, int addressid, int emailid, String uplinkaddress) {
        this.id = id;
        this.amount = amount;
        this.enterpriseid = enterpriseid;
        this.creatorid = creatorid;
        this.createtime = createtime;
        this.category = category;
        this.type = type;
        this.status = status;
        this.basedataid = basedataid;
        this.addressid = addressid;
        this.emailid = emailid;
        this.uplinkaddress = uplinkaddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(int enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public int getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(int creatorid) {
        this.creatorid = creatorid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBasedataid() {
        return basedataid;
    }

    public void setBasedataid(int basedataid) {
        this.basedataid = basedataid;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public int getEmailid() {
        return emailid;
    }

    public void setEmailid(int emailid) {
        this.emailid = emailid;
    }

    public String getUplinkaddress() {
        return uplinkaddress;
    }

    public void setUplinkaddress(String uplinkaddress) {
        this.uplinkaddress = uplinkaddress;
    }

    @Override
    public String toString() {
        return "InvoicingRecord{" +
                "id=" + id +
                ", amount=" + amount +
                ", enterpriseid=" + enterpriseid +
                ", creatorid=" + creatorid +
                ", createtime=" + createtime +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", basedataid=" + basedataid +
                ", addressid=" + addressid +
                ", emailid=" + emailid +
                ", uplinkaddress='" + uplinkaddress + '\'' +
                '}';
    }
}
