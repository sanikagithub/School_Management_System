import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Hector = new Teacher(1,"Hector",500);
        Teacher Erin = new Teacher(2,"Erin",700);
        Teacher Pasha = new Teacher(3,"Pasha",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Hector);
        teacherList.add(Erin);
        teacherList.add(Pasha);

        Student Sanika = new Student(1,"Sanika",4);
        Student Prakriti = new Student(2,"Prakriti",12);
        Student Rutti = new Student(3,"Rutti",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Sanika);
        studentList.add(Rutti);
        studentList.add(Prakriti);

        School ghs = new School(teacherList,studentList);

        Teacher matt = new Teacher(6,"Matt", 900);

        ghs.addTeacher(matt);

        Sanika.payFees(5000);
        Prakriti.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("--Making SCHOOL PAY SALARY--");
        Hector.receiveSalary(Hector.getSalary());
        System.out.println("GHS has spent for salary to " + Hector.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        Pasha.receiveSalary(Pasha.getSalary());
        System.out.println("GHS has spent for salary to " + Pasha.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());
        System.out.println(Prakriti);

        Erin.receiveSalary(Erin.getSalary());

        System.out.println(Erin);


    }
}