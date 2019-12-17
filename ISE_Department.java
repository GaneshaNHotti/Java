
package ISE;
import java.util.Scanner;
import Main.Department;
import Main.Faculty;

public class ISE_Department implements Department {
    @Override
    public void read_data(Faculty f) {
        //n faculty details
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of employee ");
    f.name = sc.next();
    //FOR EXEPTION HANLING using USER-Defined function
        try {
        System.out.println("Enter age of employee " );
        f.age = sc.nextInt();
        if(f.age>58)
            throw new AgeException();
    }catch (AgeException e){
        System.out.println(e);
        return;
    }
        System.out.println("Enter designation of employee ");
    f.designation = sc.next();
        System.out.println("Enter Joining Data of employee ");
    f.joining_data = sc.next();
        System.out.println("Enter subjects_handled of employee ");
    f.subjects_handled = sc.nextInt();
        System.out.println("Enter years_of_experience of employee ");
    f.years_of_experience = sc.nextInt();


}

    @Override
    public void print_data(Faculty f) {
        System.out.println("\n1)Name :" +f.name +"\n2)Age :" +f.age +"\n3)Designation :" +f.designation +"\n4)years_of_experience :" +f.years_of_experience +"\n5)subjects_handled :" +f.subjects_handled +"\n6)joining_data :" +f.joining_data);

    }

//    @Override
//    public void print_no_designations() {
//
//    }
//
//    @Override
//    public void number_research_consultancy_projs() {
//
//    }
}
