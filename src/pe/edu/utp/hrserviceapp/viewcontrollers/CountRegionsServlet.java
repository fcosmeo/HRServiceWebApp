package pe.edu.utp.hrserviceapp.viewcontrollers;

import pe.edu.utp.hrserviceapp.models.HRService;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "CountRegionsServlet",urlPatterns = "/countRegions")
public class CountRegionsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    private void processRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            InitialContext ctx = new InitialContext();
            HRService service= new HRService(ctx);
            PrintWriter out =response.getWriter();
            out.println(
                        "<p>Number of Region = "+
                                Integer.toString(
                                        service.getRegionsEntity().findAll().size()
                                )+
                        "</p>"
            );

        } catch (NamingException e) {
            e.printStackTrace();
        }


    }

}
