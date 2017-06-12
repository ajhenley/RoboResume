import java.util.ArrayList;

/**
 * Created by husb on 6/12/17.
 */
public class Job {
    private String title;
    private String startDate;
    private String endDate;
    private String company;
    private String duty;

    public Job(String aTitle, String aCompany, String aStartDate, String anEndDate, String duties)
    {
        title=aTitle;
        startDate=aStartDate;
        endDate=anEndDate;
        company=aCompany;
        duty=duties;
    }

    public String toString()
    {
        return  title+":\n"+company+", " +startDate+" - "+endDate+"\n"+duty+"\n";
    }
}