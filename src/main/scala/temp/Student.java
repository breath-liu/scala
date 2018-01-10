package temp;

public class Student extends Person
{
    public int range = 2222;//为啥这里用不用final运行结果是不一样的

    public Student() {
        range();
        System.out.println("子类构造器初始化");
    }

    public int range() {
        System.out.println("初始化子range:"+range);
        return this.range;
    }
}

abstract class Person {
    private String name = "tom";

    public int range = 10;
    public int pos = range();
    public int[] env = new int[range];

    public Person() {
        System.out.println("父类构造器初始化");
        range();
        System.out.println(range);
    }

    public int range() {
        System.out.println("初始化父range");
        return this.range;
    }

    public int[] env() {
        return this.env;
    }


}

class test{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("==========="+s.env().length);
        System.out.println(s.range);
        // System.out.println("pos:"+s.pos);
        Student s2 = new Student();
        System.out.println("==========="+s2.env().length);
    }
}

