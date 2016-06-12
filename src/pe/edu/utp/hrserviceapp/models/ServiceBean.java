package pe.edu.utp.hrserviceapp.models;



import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.Serializable;

public class ServiceBean implements Serializable{
    HRService service;
    InitialContext context=null;

    public ServiceBean(){
        try {
            context = new InitialContext();
            service = new HRService(context);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public int getRegionsCount(){
        return service.findAllRegions().size();
    }

    public int getCountriesCount(){
        return service.findAllCountries().size();
    }

}
