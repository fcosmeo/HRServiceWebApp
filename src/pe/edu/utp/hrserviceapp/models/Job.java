package pe.edu.utp.hrserviceapp.models;

/**
 * Created by GrupoUTP on 04/06/2016.
 */
public class Job {
    private String id;
    private String title;
    private float minSalary;
    private float maxSalary;

    public Job(String id, String title, float minSalary, float masSalary){
        this.id=id;
        this.title=title;
        this.minSalary=minSalary;
        this.maxSalary=masSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(float minSalary) {
        this.minSalary = minSalary;
    }

    public float getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(float maxSalary) {
        this.maxSalary = maxSalary;
    }
}
