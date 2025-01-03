

import java.util.ArrayList;
import java.util.Objects;

public class Students_list {

        private ArrayList<StudentsDetails> students;

        public Students_list() {

            students = new ArrayList<>();
        }


        public void addStudent(StudentsDetails Student){
            students.add(Student);
        }
       public void removeStudent(String rollnum) {
            Boolean t=true;
          if(students.removeIf(StudentDetails-> Objects.equals(StudentDetails.getRollNumber(), rollnum))==t){
              System.out.println("data is removed");
          }
          else{
              System.out.println("provide the valid data");
          }
    }
    public void searchStudent(String rollnum){
           for(int i=0;i<students.size();i++){
            if(students.get(i).getRollNumber().equals(rollnum)){
                System.out.println(students.get(i));
                break;
            }
            else {
                System.out.println("provide the valid rollnum");
            }

            }

    }
    public void getAllStudents() {
            if(students.isEmpty()){
                System.out.println("There is no student date is present here");
            }
            else {
                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i));
                }
            }


    }
        }





