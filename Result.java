package ResultPackage;
import StudentPackage.RegisterStudent;
import static StudentPackage.student.*;
class InvalidSGPA extends Exception
{
    InvalidSGPA(String s)
    {
        super(s);
    }
}
public class Result
{
    public static void main(String[] args)
    {
        new RegisterStudent();
        System.out.println("Name : "+ name);
        System.out.println("Branch : "+ br);
        for(int i=0;i<4;i++)
        {
            System.out.println("Grade of Semester "+(i+1)+":");
            System.out.println("Grade of subject1: "+ getGrade(sub1[i]));
            System.out.println("Grade of subject2: "+ getGrade(sub2[i]));
            System.out.println("Grade of subject3: "+ getGrade(sub3[i]));
            try
            {
                if( SGPA(i+1)>10)
                    throw new InvalidSGPA("SPGA is greater than 10");
                else
                    System.out.println("SGPA of Semester "+(i+1)+": "+ SGPA(i+1));
            }
            catch(Exception e)
            {
                System.out.println("Invalid SGPA : "+e);
                System.exit(0);
            }
        }
        System.out.println("CGPA of 4 Semesters : "+CGPA());
    }
}
