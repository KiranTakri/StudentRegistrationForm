import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login")
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h2>Welcome to our Institution </h2>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String first=req.getParameter("first");
        String last=req.getParameter("last");
        String email=req.getParameter("email");
        String pass=req.getParameter("pass");
        String gender=req.getParameter("gender");
        String dob=req.getParameter("date");
        String course=req.getParameter("course");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h4>first name is :"+first+"</h4>");
        out.println("<h4>last name is :"+last+"</h4>");
        out.println("<h4>email is :"+email+"</h4>");
        out.println("<h4>password is :"+pass+"</h4>");
        out.println("<h4>gender is :"+gender+"</h4>");
        out.println("<h4>dob is :"+dob+"</h4>");
        out.println("<h4>course is :"+course+"</h4>");


    }
}
