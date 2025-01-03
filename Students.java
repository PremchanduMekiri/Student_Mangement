import java.util.Scanner;

public class Students {
    static Scanner scn=new Scanner(System.in);
    static Students_list sl=new Students_list();


    public static void addStudent(){
        System.out.println("please enter the name of  the Student");
        String name= scn.nextLine();
        System.out.println("plese enter the rollno");
        String rollno=scn.nextLine();

        System.out.println("pplease enter the grade");
        String grade=scn.nextLine();

        if(name.isEmpty() || rollno.isEmpty() || grade.isEmpty()){
            System.out.println("enter the valid detaills");
            return;
        }
        else {

            sl.addStudent(new StudentsDetails(name, rollno, grade));
            System.out.println("Student added successfully.");
        }
    }

    public static void RemoveStudent(){
        System.out.println("enter the roll num");
        String rollnum=scn.nextLine();
        sl.removeStudent(rollnum);

    }
    public static void ViewStudent(){
        sl.getAllStudents();
    }
    public static void serhstudents(){
        System.out.println("enter the student roolnum");
        String roolno=scn.nextLine();
        sl.searchStudent(roolno);
    }


}
