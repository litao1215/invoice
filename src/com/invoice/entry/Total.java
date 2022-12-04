package com.invoice.entry;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: DuanWenlei
 * @DATE: 2022/12/3 20:40
 */
public class Total {
    private String title;
    private String taxno;
    private String addressdetail;
    private String emaildetail;
    private int enterpriseid;

    public Total() {
    }

    public Total(String title, String taxno, String addressdetail, String emaildetail, int enterpriseid) {
        this.title = title;
        this.taxno = taxno;
        this.addressdetail = addressdetail;
        this.emaildetail = emaildetail;
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

    public String getAddressdetail() {
        return addressdetail;
    }

    public void setAddressdetail(String addressdetail) {
        this.addressdetail = addressdetail;
    }

    public String getEmaildetail() {
        return emaildetail;
    }

    public void setEmaildetail(String emaildetail) {
        this.emaildetail = emaildetail;
    }

    public int getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(int enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    @Override
    public String toString() {
        return "Total{" +
                "title='" + title + '\'' +
                ", taxno='" + taxno + '\'' +
                ", addressdetail='" + addressdetail + '\'' +
                ", emaildetail='" + emaildetail + '\'' +
                ", enterpriseid=" + enterpriseid +
                '}';
    }
}
