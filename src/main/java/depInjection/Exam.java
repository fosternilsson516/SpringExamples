package depInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext AC = new ClassPathXmlApplicationContext("beans.xml");
        Student foster = AC.getBean("student", Student.class);
        foster.displayStudentInfo();

        Student ellen = AC.getBean("ellen", Student.class);
        ellen.displayStudentInfo();


    }
}
