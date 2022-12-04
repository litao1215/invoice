package com.invoice.server;

import com.invoice.biz.impl.InvoicingRecordBizImpl;
import com.invoice.biz.impl.UserBizImpl;
import com.invoice.dao.impl.BaseDataDaoImpl;
import com.invoice.dao.impl.InvoicingRecordDaoImpl;
import com.invoice.dao.impl.OrderDaoImpl;
import com.invoice.dao.impl.UserDaoImpl;
import com.invoice.entry.InvoicingRecord;
import com.invoice.entry.Order;
import com.invoice.entry.Total;
import com.invoice.entry.User;
import com.invoice.util.DBHelper;
import com.mysql.cj.Session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:12
 */
@WebServlet("/login")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        String account=request.getParameter("account");
        String password=request.getParameter("password");
        UserBizImpl ubi=new UserBizImpl();
        User user=new User();
        user.setAccount(account);
        user.setPassword(password);

        boolean b=ubi.queryUser(account,password);

        UserDaoImpl udi =new UserDaoImpl();
        User u = udi.selectUser(user.getAccount(), user.getPassword());

        HttpSession session=request.getSession();
        session.setAttribute("u",u);

        InvoicingRecordDaoImpl irdi=new InvoicingRecordDaoImpl();
        InvoicingRecord invoicingRecord = irdi.selectamountById(u.getEnterpriseid());
        session.setAttribute("irbi",invoicingRecord);

        OrderDaoImpl odi =new OrderDaoImpl();
        Order order = odi.selectorderById(u.getEnterpriseid());
        Order order1=odi.selectorderById1(u.getEnterpriseid());
        session.setAttribute("order",order);
        session.setAttribute("order1",order1);

        if (b){
            request.getRequestDispatcher("invoice-list.jsp").forward(request,response);
        }else {
            response.sendRedirect("/invoice/login.jsp?error=yes");
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
