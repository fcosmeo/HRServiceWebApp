package pe.edu.utp.hrserviceapp.models;

import java.util.List;

/**
 * Created by GrupoUTP on 03/06/2016.
 */
public class Region {
    private int id;
    private String name;
    private List<Country> countries;

    public Region(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
