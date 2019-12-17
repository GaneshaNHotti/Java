package StudentPackage;
import java.util.Scanner;
interface Student
{
    void getName();
    void getBranch();
}
class CreditLimit extends Exception
{
    CreditLimit(int i)
    {
        System.out.println("The Total credit is:"+i);
    }
}
public class RegisterStudent
{
    public RegisterStudent()
    {
        Student ob = new student();
        ob.getName();
        ob.getBranch();
        System.out.println("Enter the total numbers of credits registered");
        int tot_cr = ( new Scanner(System.in) ).nextInt();
        try
        {
            if(tot_cr>30)
                throw new CreditLimit(tot_cr);
            else
                System.out.println("The Total credit is:"+tot_cr);
        }
        catch(Exception e)
        {
            System.out.println(e+"\nException : Total Credits is more than 30");
            System.exit(0);
        }
        ((student) ob).collectMarks();
    }
}

