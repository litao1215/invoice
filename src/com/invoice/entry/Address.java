package com.invoice.entry;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:28
 */
//邮寄地址表
public class Address {
    private int id;//主键
    private int enterpriseid;//企业id
    private String addressee;//收件人
    private String phone;//联系电话
    private String area;//省市区
    private String addressdetail;//详细地址
    private String defaultstatus;//是否默认

    public Address() {
    }

    public Address(int id, int enterpriseid, String addressee, String phone, String area, String addressdetail, String defaultstatus) {
        this.id = id;
        this.enterpriseid = enterpriseid;
        this.addressee = addressee;
        this.phone = phone;
        this.area = area;
        this.addressdetail = addressdetail;
        this.defaultstatus = defaultstatus;
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

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddressdetail() {
        return addressdetail;
    }

    public void setAddressdetail(String addressdetail) {
        this.addressdetail = addressdetail;
    }

    public String getDefaultstatus() {
        return defaultstatus;
    }

    public void setDefaultstatus(String defaultstatus) {
        this.defaultstatus = defaultstatus;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", enterpriseid=" + enterpriseid +
                ", addressee='" + addressee + '\'' +
                ", phone='" + phone + '\'' +
                ", area='" + area + '\'' +
                ", addressdetail='" + addressdetail + '\'' +
                ", defaultstatus='" + defaultstatus + '\'' +
                '}';
    }
}
