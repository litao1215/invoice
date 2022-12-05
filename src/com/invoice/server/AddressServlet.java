package com.invoice.server;

import com.google.gson.Gson;
import com.invoice.biz.impl.AddressBizImpl;
import com.invoice.entry.Address;
import com.invoice.entry.User;

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
 * @DATE: 2022/12/1 21:36
 */

@WebServlet("/ads")
public class AddressServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");

        int i=Integer.parseInt(request.getParameter("i"));
        if(i==1){
            selectByEid(request,response);
        }else if (i==2){
            showAddress(request,response);
        }else if (i==3){
            insertAddress(request,response);
        }else if (i==4){
            updateAddress(request,response);
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

    AddressBizImpl abi=new AddressBizImpl();

    //通过企业ID查看一组对象
    public void selectByEid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int enterpriseid = Integer.parseInt(request.getParameter("enterpriseid"));
        Address address =abi.queryByEid(enterpriseid,"默认");
        response.getWriter().println(new Gson().toJson(address));
    }

    //点击增加按钮，通过企业ID添加一行数据
    public void showAddress(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int enterpriseid=Integer.parseInt(request.getParameter("enterpriseid"));
        List<Address> addresslist=abi.queryAddress(enterpriseid);
        response.getWriter().println(new Gson().toJson(addresslist));
    }

    public void insertAddress(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int enterpriseid = Integer.parseInt(request.getParameter("enterpriseid"));
        String addressee = request.getParameter("addressee");
        String phone = request.getParameter("phone");
        String area = request.getParameter("area");
        String addressdetail = request.getParameter("addressdetail");
        Address address=new Address();
        address.setEnterpriseid(enterpriseid);
        address.setAddressee(addressee);
        address.setPhone(phone);
        address.setArea(area);
        address.setAddressdetail(addressdetail);
        String s="false";
        boolean boo = abi.addAddress(address);
        if (boo){
            showAddress(request,response);
        }else {
            response.getWriter().println(new Gson().toJson(s));
        }
    }

    public void updateAddress(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        String addressee = request.getParameter("addressee");
        String phone = request.getParameter("phone");
        String area=request.getParameter("area");
        String addressdetail = request.getParameter("addressdetail");
        Address address=new Address();
        address.setId(id);
        address.setAddressee(addressee);
        address.setPhone(phone);
        address.setArea(area);
        address.setAddressdetail(addressdetail);
        boolean boo=abi.modifyAddress(address);
        String s="false";
        if (boo){
            response.getWriter().print(new Gson().toJson(s));
        }else {
            response.getWriter().print(new Gson().toJson(s));
        }
    }
}
