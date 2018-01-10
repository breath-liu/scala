package temp;

import extendsDemo.Father;
import extendsDemo.Son;

public class demo {

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("==========="+s.env().length);
        System.out.println(s.range());
        System.out.println("pos:"+s.pos);
        //Son son = new Son();
       // Father father = new Father();
       // System.out.println(father.b);
       // System.out.println(son.getArr().length);
       // System.out.println(son.env().length);
    }
}
