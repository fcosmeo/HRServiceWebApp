package pe.edu.utp.hrserviceapp.viewcontrollers;

import pe.edu.utp.hrserviceapp.models.Country;
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

/**
 * Created by GrupoUTP on 10/06/2016.
 */
@WebServlet(name = "ListCountriesServlet", urlPatterns = "/listCountries")
public class ListCountriesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            InitialContext ctx = new InitialContext();
            HRService service = new HRService(ctx);
            out.println("Country Name");
            for(Country country : service.findAllCountries()) {
                out.println(country.getName() + " ("+
                service.findRegionById(country.getRegionId()).getName()+
                ")");
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }

    }
}
