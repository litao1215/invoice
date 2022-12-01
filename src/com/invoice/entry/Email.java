package com.invoice.entry;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:30
 */
//电子邮箱表
public class Email {
    private int id;//主键
    private int enterpriseid;//企业id
    private String emaildetail;//电子邮箱
    private String defaultstatus;//是否默认

    public Email() {
    }

    public Email(int id, int enterpriseid, String emaildetail, String defaultstatus) {
        this.id = id;
        this.enterpriseid = enterpriseid;
        this.emaildetail = emaildetail;
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

    public String getEmaildetail() {
        return emaildetail;
    }

    public void setEmaildetail(String emaildetail) {
        this.emaildetail = emaildetail;
    }

    public String getDefaultstatus() {
        return defaultstatus;
    }

    public void setDefaultstatus(String defaultstatus) {
        this.defaultstatus = defaultstatus;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", enterpriseid=" + enterpriseid +
                ", emaildetail='" + emaildetail + '\'' +
                ", defaultstatus='" + defaultstatus + '\'' +
                '}';
    }
}
