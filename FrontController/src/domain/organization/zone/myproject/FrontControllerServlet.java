package domain.organization.zone.myproject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FrontControllerServlet" ,urlPatterns = "/*")
public class FrontControllerServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod()+req.getPathInfo()+"1*************"+req.getServletPath()+"2***");

        HttpMetodFactory httpMetodFactory=new HttpMetodFactory();

        HttpMetodApi httpMetodApi=httpMetodFactory.getHttpMetodApi(req);

        try {
            httpMetodApi.execut(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
