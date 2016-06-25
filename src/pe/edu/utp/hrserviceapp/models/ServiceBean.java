package pe.edu.utp.hrserviceapp.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.Serializable;
import java.util.List;

/**
 * Created by GrupoUTP on 11/06/2016.
 */
public class ServiceBean implements Serializable {
    HRService service;
    InitialContext context = null;
    String textCriteria = "";
    public ServiceBean() {
        try {
            context = new InitialContext();
            service = new HRService(context);
        } catch (NamingException e) {
            e.printStackTrace();
        }

    }

    public int getRegionsCount() {
        return service.findAllRegions().size();
    }

    public int getCountriesCount() { return service.findAllCountries().size();}

    public List<Region> getAllRegions() { return service.findAllRegions(); }

    public List<Country> getAllCountries() { return service.findAllCountries(); }
    public void setTextCriteria(String text) {this.textCriteria = text;}
    public String getTextCriteria() { return textCriteria;}
    public List<Country> getCountriesForTextCriteria() { return service.findCountriesWhereNameContains(this.textCriteria);}
    public int getEmployeesForCountriesCountForTextCriteria() { return service.findCountEmployeesForCountriesWhereNameContains(this.textCriteria);}
    public Region getRegionForId(int id) { return service.findRegionById(id);}

}
