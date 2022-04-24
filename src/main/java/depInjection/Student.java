package depInjection;

public class Student {
   private String studentName;
   private int age;

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Student setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public void displayStudentInfo() {

        System.out.println("students name is = " + studentName
        + " and the age is = " + age);
    }
}
