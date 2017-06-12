/**
 * Created by husb on 6/12/17.
 */
public class Education {
    private String schoolName;
    private int yearGrad;
    private String degree;


    public Education(String aSchoolName, int aYearGrad, String degreeType, String aMajor) {
        schoolName=aSchoolName;
        yearGrad=aYearGrad;
        degree = degreeType +" in "	+ aMajor;
    }

    @Override
    public String toString()
    {
        return degree+",\n"+schoolName+", "+yearGrad+"\n";
    }
}
