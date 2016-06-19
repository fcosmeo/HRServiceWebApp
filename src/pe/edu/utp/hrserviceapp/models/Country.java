package pe.edu.utp.hrserviceapp.models;

/**
 * Created by GrupoUTP on 10/06/2016.
 */
public class Country {
    private String id;
    private String name;
    private int regionId;


    public Country(String id, String name, int regionId) {
        this.id = id;
        this.name = name;
        this.regionId = regionId;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }


}
