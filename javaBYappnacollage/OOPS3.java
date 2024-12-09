class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newSchool";
    }
}

public class OOPS3 {
    public static void main(String[] args) {
        Student.school = "ABC";

        Student student1 = new Student();
        student1.name = "neeraj";
        System.out.println(student1.school);
    }
}
