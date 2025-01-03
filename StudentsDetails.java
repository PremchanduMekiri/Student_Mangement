public class StudentsDetails {
    private String name;
    private String grade;
    private String rollno;

    public StudentsDetails(String name, String rollno, String grade) {
        this.name = name;
        this.rollno = rollno;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollno;
    }

    public void setRollNumber(int rollNumber) {
        this.rollno = rollno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollno + ", Name: " + name + ", Grade: " + grade;
    }


}

