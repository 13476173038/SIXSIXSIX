package dt59homework;

public class phoenix {

    public static void main(String[] args) {
        Phenix phoenix;
        phoenix = new Phenix();
        phoenix.name = "炎鸢";
        phoenix.born = "公元前84年";
        phoenix.ability = "涅槃重生";
        phoenix.legend = "听说的";
        phoenix.bodily_form = 666;

        System.out.println("名字叫" + phoenix.name);

        phoenix.fly();
        System.out.println(phoenix.niupi());
    }
}
