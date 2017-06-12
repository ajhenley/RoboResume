/**
 * Created by husb on 6/12/17.
 */
public class Education {
    private String schoolName;
    private int yearGrad;
    private String degree;


    public Education(String aSchoolName, int aYearGrad, String degreeType, String aMajor,String persID) {
        schoolName=aSchoolName;
        yearGrad=aYearGrad;
        setDegree(degreeType, aMajor);
    }

    public void setSchool(String aSchoolName)
    {
        schoolName=aSchoolName;
    }
    public void setYearGrade(int aYear)
    {
        yearGrad=aYear;
    }
    public void setDegree(String degreeType, String aMajor)
    {
        degree = degreeType +" in "	+ aMajor;
    }
    public String getSchool()
    {
        return schoolName;
    }
    public String getDegree()
    {
        return degree;
    }
    public int getYear()
    {
        return yearGrad;
    }

    @Override
    public String toString()
    {
        return degree+",\n"+schoolName+", "+yearGrad+"\n";
    }
}
