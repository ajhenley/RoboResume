import java.time.LocalDate;
import java.util.Scanner;

public class CoreRoutine {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);

        System.out.println("Please input your name");
        String name=user.nextLine();

        System.out.println("Please input your email");
        String email=user.nextLine();

        System.out.println("Please input your linkedin");
        String linkedin=user.nextLine();

        Person seeker = new Person(name, email, linkedin);

        System.out.print("Please input your educational experiences.\n"
                + "Please enter 1 experience at a time. You must input at least 1 and no more than 10 \n"
                + "The experience will include the School, Year Graduated, Degree type awarded and Major\n");
        boolean check=false;
        do
        {
            seeker.addEducation(getEducation());

            System.out.println("Would you like to add another educational experience (Y/N)?");
            String cont=user.nextLine();
            if(cont.equals("Y"))
            {
                check=true;
            }
            else
            {
                check=false;
            }
        }while(check==true);


        System.out.print("Please input your work experiences.\n"
                + "Please enter 1 experience at a time. You must input 0 and no more than 10 \n"
                + "The experience will include the job title, company worked for,\n"
                + "Description of you role in that job, and the start and end month and year for that job\n");
        check=false;
        do
        {
            System.out.println("Would you like to add another work experience (Y/N)?");
            String cont=user.nextLine();

            if(cont.equals("Y")) {
                seeker.addJob(getJob());
                check=true;
            }
            else
            {
                check=false;
            }


        }while(check==true);

        System.out.print("Please input your applicable work skills.\n"
                + "Please enter 1 skill at a time. You must input 1 and no more than 20 \n"
                + "The experience will include the desired skill and a skill rating ,\n");

        check=false;
        do
        {

            seeker.addSkill(getSkill());
            System.out.println("Would you like to add another skill (Y/N)?");
            String cont=user.nextLine();

            if(cont.equals("Y"))
            {
                check=true;
            }
            else
            {
                check=false;
            }
        }while(check==true);

        System.out.print(seeker.toString());



        user.close();
    }


    public static Education getEducation(){
        Scanner user = new Scanner(System.in);

        System.out.println("Please enter the school you attended");
        String school=user.nextLine();

        System.out.println("Please enter the degree type you were awarded");
        String degree=user.nextLine();

        System.out.println("Please enter the major you had");
        String major=user.nextLine();

        int year=0;
        boolean check3=true;
        while(check3==true) {
            System.out.println("Please enter the year you graduated");
            try
            {
                String year1=user.nextLine();
                System.out.println("");
                year=Integer.parseInt(year1);

                if(year<= LocalDate.now().getYear()&&year>=1900)
                {
                    check3=false;
                }
                else
                {
                    System.out.println("That is an invalid input. Please try again.");
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("That is an invalid input. Please try again.");
            }
        }
        Education e = new Education(school,year,degree,major);
        return e;
    }
    public static Job getJob(){
        Scanner user = new Scanner(System.in);
        System.out.println("Please enter the job title");
        String title=user.nextLine();

        System.out.println("Please enter the company you worked for");
        String company=user.nextLine();

        System.out.println("Please enter the start Month and year");
        String start=user.nextLine();

        System.out.println("Please enter the end Month and year, if current job, enter 'Present'");
        String end=user.nextLine();

        System.out.println("Please enter your job duties:");
        String duties=user.nextLine();

        Job j = new Job(title, company,start,end,duties);
        return j;
    }
    public static Skill getSkill(){
        Scanner user = new Scanner(System.in);
        System.out.println("Please enter the desired skill");
        String skill=user.nextLine();

        System.out.println("Please enter a rating of your ability with the skill\n"
                + "The available ratings are 'familiar','intermediate', 'proficient', 'expert'");
        String rating=user.nextLine();
        Skill s=new Skill(skill, rating);
        return s;
    }
}
