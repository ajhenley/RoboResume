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

    public Person(String myName, String myEmail, String myLinkedin){
        name = myName;
        email = myEmail;
        linkedin = myLinkedin;
    }

    public void addEducation(Education ed){
        eds.add(ed);
    }
    public void addJob(Job j){
        jobs.add(j);
    }
    public void addSkill(Skill s){
        skills.add(s);
    }

    public String toString(){
        return name+"\n"+email +"\n"+linkedin +"\n \n"+eds.toString() +jobs.toString()+skills.toString();
    }
}
