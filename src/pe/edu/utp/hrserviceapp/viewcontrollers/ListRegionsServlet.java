package pe.edu.utp.hrserviceapp.viewcontrollers;

import pe.edu.utp.hrserviceapp.models.HRService;
import pe.edu.utp.hrserviceapp.models.Region;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by GrupoUTP on 04/06/2016.
 */
@WebServlet(name = "ListRegionsServlet",
        urlPatterns = "/listRegions")
public class ListRegionsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request,
                                HttpServletResponse response)
            throws ServletException, IOException {
        try {
            InitialContext ctx = new InitialContext();
            HRService service = new HRService(ctx);
            PrintWriter out = response.getWriter();

            out.println("Region Name");
            List<Region> regions = service
                    .findAllRegions();
            for(Region region : regions) {
                out.println("Region " + region.getName() + " has " + Integer.toString(
                                                region.getCountries().size()) + " countries"
                );
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
