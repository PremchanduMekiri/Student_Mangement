import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("select 1 to add the student  \n Select 2 to remove the student \n selct 3 to view the data \n select 4 to search for the student \n select 5 toexit");
        while (true) {
            System.out.println("pleaase select the any one of the above options");
            int choice = scn.nextInt();

            switch (choice){
                case 1:
                    Students.addStudent();
                    break;
                case 2:
                    Students.RemoveStudent();
                    break;
                case 3:
                    Students.ViewStudent();
                    break;
                case 4:
                    Students.serhstudents();
                    break;
                case 5:
                    System.out.println("we are closed");
                    System.exit(0);
            }
        }

    }
}