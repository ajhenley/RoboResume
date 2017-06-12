/**
 * Created by husb on 6/12/17.
 */
public class Skill {
    private String skillName;
    private String skillRating;

    public Skill(String aName,String aRating) {
        skillName=aName;
        skillRating=aRating;
    }

    @Override
    public String toString()
    {
        return skillName+", "+skillRating;
    }
}
