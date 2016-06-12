package pe.edu.utp.hrserviceapp.models;


import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.Serializable;


public class ServiceBean implements Serializable{
    HRService service;
    InitialContext context=null;

    public ServiceBean(){
       if(getContext()!=null)
           service=new HRService(getContext());
    }

    public InitialContext getContext(){
        if(context==null) try{
            context=new InitialContext();
        }catch(NamingException e){
            e.printStackTrace();
        }else return context;
        return null;
    }

    public int getRegionsCount(){
        if(getContext()==null) return 0;
        //return service.findAllRegions().size();
        return 1;
    }


}
