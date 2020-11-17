package domain.organization.zone.myproject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NotFoundHttpMetodApi implements HttpMetodApi {
    @Override
    public void execut(HttpServletRequest request, HttpServletResponse response) throws Exception {
      //  request.getRequestDispatcher(request.getServletContext().getContextPath()+"notFound.html")
           //     .forward(request,response);
        System.out.println("NotFoundHttpMetodApi");
        response.sendRedirect("notFound.html");
    }
}
