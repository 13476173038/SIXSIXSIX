package dt59homework;

public class lianxii {

    public static void main(String[] args) {
        student Student;
        Student = new student();
        Student.name = "牛皮";
        Student.height = 180.0d;
        Student.weight = 64;
        Student.hobby = "喊牛皮";

        System.out.println("爱好是" + Student.hobby);

        Student.eat();
    }

}
