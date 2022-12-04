package com.invoice.server;

import com.google.gson.Gson;
import com.invoice.biz.impl.AddressBizImpl;
import com.invoice.biz.impl.EmailBizImpl;
import com.invoice.dao.impl.EmailDaoImpl;
import com.invoice.entry.Address;
import com.invoice.entry.Email;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: DuanWenlei
 * @DATE: 2022/12/1 21:35
 */

@WebServlet("/es")
public class EmailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        int i=Integer.parseInt(request.getParameter("i"));
        if (i==1){
            selectByEid(request,response);
        }else if (i==2){
            showEmail(request, response);
        }else if(i==3){
            insertEmail(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
    }

    EmailBizImpl ebi=new EmailBizImpl();

    public void selectByEid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int enterpriseid = Integer.parseInt(request.getParameter("enterpriseid"));
        Email email =ebi.queryByEid(enterpriseid,"默认");
        response.getWriter().println(new Gson().toJson(email));
    }


    public void insertEmail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int enterpriseid = Integer.parseInt(request.getParameter("enterpriseid"));
        String emaildetail = request.getParameter("emaildetail");
        String defaultstatus = request.getParameter("defaultstatus");
        Email email = new Email();
        email.setEnterpriseid(enterpriseid);
        email.setEmaildetail(emaildetail);
        email.setDefaultstatus(defaultstatus);
        String s = "false";
        boolean boo = ebi.addEmail(email);
        if(boo){
            showEmail(request, response);
        } else {
            response.getWriter().println(new Gson().toJson(s));
        }

    }
    //点击增加按钮，通过企业ID添加一行数据
    public void showEmail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int enterpriseid = Integer.parseInt(request.getParameter("enterpriseid"));
        List<Email> emaillist = ebi.queryEmail(enterpriseid);
        response.getWriter().println(new Gson().toJson(emaillist));
    }
}
