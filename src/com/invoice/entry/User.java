package com.invoice.entry;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:14
 */
//用户表
public class User {
    private int id;//主键
    private String name;//用户名
    private String enterpriseid;//企业id
    private String phone;//手机号
    private String account;//账号
    private String password;//密码
    private String idcardname;//身份证姓名
    private String idcardno;//身份证号码

    public User() {
    }

    public User(int id, String name, String enterpriseid, String phone, String account, String password, String idcardname, String idcardno) {
        this.id = id;
        this.name = name;
        this.enterpriseid = enterpriseid;
        this.phone = phone;
        this.account = account;
        this.password = password;
        this.idcardname = idcardname;
        this.idcardno = idcardno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(String enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdcardname() {
        return idcardname;
    }

    public void setIdcardname(String idcardname) {
        this.idcardname = idcardname;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", enterpriseid='" + enterpriseid + '\'' +
                ", phone='" + phone + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", idcardname='" + idcardname + '\'' +
                ", idcardno='" + idcardno + '\'' +
                '}';
    }
}
