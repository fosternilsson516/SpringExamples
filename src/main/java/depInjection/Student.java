package depInjection;

public class Student {
   private final String studentName;
   private final int age;

    public Student(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    public void displayStudentInfo()  {

        System.out.println("students name is = " + studentName
        + " and their age is = " + age);
    }
}
