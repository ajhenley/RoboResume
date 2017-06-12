import java.util.ArrayList;

/**
 * Created by husb on 6/12/17.
 */
public class Job {
    private String role;
    private int id;
    private String name;
    private String startDate;
    private String endDate;
    private String company;
    private String duty;

    public Job(String aName, String aCompany, String aRole, String aStartDate, String anEndDate)
    {
        role=aRole;
        name=aName;
        startDate=aStartDate;
        endDate=anEndDate;
        company=aCompany;

    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getStart()
    {
        return startDate;
    }
    public String getEnd()
    {
        return endDate;
    }

    public void setEnd(String anEndDate)
    {
        endDate=anEndDate;
    }
    public void setStart(String aStartDate)
    {
        startDate=aStartDate;
    }

    public String toString()
    {
        return  name+":\n"+company+", " +startDate+" - "+endDate+"\n"+duty+"\n";
    }
}