import java.util.ArrayList;

/**
 * Created by husb on 6/12/17.
 */
public class Person {
    private String name;
    private String email;
    private String linkedin;
    ArrayList<Education> eds = new ArrayList<Education>();
    ArrayList<Job> jobs = new ArrayList<Job>();
    ArrayList<Skill> skills = new ArrayList<Skill>();

    public void addEducation(String aSchoolName, int aYearGrad, String degreeType, String aMajor,String persID){
        Education e = new Education(aSchoolName, aYearGrad, degreeType, aMajor, persID);
        eds.add(e);
    }
    public void addJob(String aName, String aCompany, String aRole, String aStartDate, String anEndDate){
        Job j = new Job(aName, aCompany, aRole, aStartDate, anEndDate);
        jobs.add(j);
    }
    public void addSkill(String aName,String aRating,String persID){
        Skill s = new Skill(aName,aRating,persID);
        skills.add(s);
    }

    public void toString(){

    }

}
