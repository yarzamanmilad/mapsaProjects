package domain.organization.zone.myproject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserGetMetodApi implements HttpMetodApi{
    @Override
    public void execut(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("UserGetMetodApi");
        response.sendRedirect("index.jsp");

    }
}
