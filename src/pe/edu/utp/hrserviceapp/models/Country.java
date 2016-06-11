package pe.edu.utp.hrserviceapp.models;

/**
 * Created by GrupoUTP on 10/06/2016.
 */
public class Country {
    private String id;
    private int regionId;
    private String name;

    public Country(String id,int regionId,String name){
        this.id=id;
        this.regionId=regionId;
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
