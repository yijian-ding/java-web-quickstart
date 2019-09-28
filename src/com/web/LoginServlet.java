package com.web;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login,do")
public class LoginServlet extends HttpServlet {
    protected void dopost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //处理乱码
        req.setCharacterEncoding("UTF-8");
        //通过req请求参数获取表单用户信息
        String username = req.getParameter( "username");
        String password = req.getParameter( "password");
        //用户参数存入req对象
        req.setAttribute( "username",username);
        req.setAttribute(" password",password);
        //req跳转
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
        //通过req请求获取session会话
        HttpSession session=req.getSession();
        //用户名存入session
        session.setAttribute("username ",username);
        //通过resq跳转
        resp.sendRedirect("/index.jsp");

    }
}
