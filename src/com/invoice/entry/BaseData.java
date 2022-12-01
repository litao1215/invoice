package com.invoice.entry;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:26
 */
//发票基础信息表
public class BaseData {
    private int id;//主键
    private int enterpriseid;//企业id
    private String title;//抬头
    private String taxno;//税号
    private String bankname;//开户银行
    private String bankaccount;//开户账号
    private String phone;//注册固定电话
    private String address;//注册场所地址

    public BaseData() {
    }

    public BaseData(int id, int enterpriseid, String title, String taxno, String bankname, String bankaccount, String phone, String address) {
        this.id = id;
        this.enterpriseid = enterpriseid;
        this.title = title;
        this.taxno = taxno;
        this.bankname = bankname;
        this.bankaccount = bankaccount;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(int enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaxno() {
        return taxno;
    }

    public void setTaxno(String taxno) {
        this.taxno = taxno;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "BaseData{" +
                "id=" + id +
                ", enterpriseid=" + enterpriseid +
                ", title='" + title + '\'' +
                ", taxno='" + taxno + '\'' +
                ", bankname='" + bankname + '\'' +
                ", bankaccount='" + bankaccount + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
