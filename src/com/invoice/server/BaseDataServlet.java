package com.invoice.server;

import com.google.gson.Gson;
import com.invoice.biz.impl.AddressBizImpl;
import com.invoice.biz.impl.BaseDataBizImpl;
import com.invoice.biz.impl.EmailBizImpl;
import com.invoice.entry.Address;
import com.invoice.entry.BaseData;
import com.invoice.entry.Email;
import com.invoice.entry.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: DuanWenlei
 * @DATE: 2022/12/1 21:35
 */
@WebServlet("/bds")
public class BaseDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        int i=Integer.parseInt(request.getParameter("i"));
        if (i==1){
            buttonone(request,response);
        }else if (i==2){
            updateone(request,response);
        }

    }
    public void buttonone(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int enterpriseid = Integer.parseInt(request.getParameter("enterpriseid"));
        BaseData baseData=new BaseData();
        baseData.setEnterpriseid(enterpriseid);
        BaseDataBizImpl bdbi=new BaseDataBizImpl();
        BaseData queryone = bdbi.queryone(baseData);
        HttpSession session=request.getSession();
        session.setAttribute("basedata",queryone);
        response.getWriter().print(new Gson().toJson(queryone));
    }


    public void updateone(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入update");
        int id= Integer.parseInt(request.getParameter("id"));
        String bankname=request.getParameter("bankname");
        String bankaccount=request.getParameter("bankaccount");
        String phone=request.getParameter("phone");
        String address=request.getParameter("address");

        BaseDataBizImpl bdbi=new BaseDataBizImpl();
        BaseData baseData=new BaseData();
        baseData.setId(id);
        baseData.setBankname(bankname);
        baseData.setBankaccount(bankaccount);
        baseData.setPhone(phone);
        baseData.setAddress(address);
        boolean b=bdbi.modifyBaseDate(baseData);

        System.out.println(baseData);
        if (b){
            buttonone(request,response);
        }else {
            response.getWriter().print("failure");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
    }



}
