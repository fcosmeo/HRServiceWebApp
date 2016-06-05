package pe.edu.utp.hrserviceapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrupoUTP on 04/06/2016.
 */
public class JobsEntity extends BaseEntity {

    private static String DEFAULT_QUERY="SELECT * FROM jobs";

    public List<Job> finAll(){
        String query = DEFAULT_QUERY;
        try {
            ResultSet rs=getConnection().createStatement().executeQuery(query);
            if(rs==null){
                return null;
            }
            List<Job> jobs = new ArrayList<>();
            while(rs.next()){
                Job job=new Job(rs.getString("job_id"),rs.getString("job_title"),rs.getFloat("min_salary"),rs.getFloat("max_salary"));
                jobs.add(job);
            }
            return jobs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Job findById(String id){
        String query = DEFAULT_QUERY+" where job_id='"+id+"'";
        try {
            ResultSet rs=getConnection().createStatement().executeQuery(query);
            if(rs==null){
                return null;
            }

            if(rs.next()){
                Job job=new Job(rs.getString("job_id"),
                                rs.getString("job_title"),
                                rs.getFloat("min_salary"),
                                rs.getFloat("max_salary"));
                return job;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Job findByTitle(String title){
        String query = DEFAULT_QUERY+" where job_title='"+title+"'";
        try {
            ResultSet rs=getConnection().createStatement().executeQuery(query);
            if(rs==null){
                return null;
            }

            if(rs.next()){
                Job job=new Job(rs.getString("job_id"),
                        rs.getString("job_title"),
                        rs.getFloat("min_salary"),
                        rs.getFloat("max_salary"));
                return job;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
