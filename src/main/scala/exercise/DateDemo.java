package exercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/5.
 */
public class DateDemo {
    private int age;

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 12, 21);
        System.out.println(date);
        Inner aa = new DateDemo().new Inner("aa");
        Inner bb = new DateDemo().new Inner("bb");
        aa.list.add(bb);
        System.out.println(aa.list);

        long addend = 0xBL;
        System.out.println(addend);


    }

    public void isless(DateDemo dd){
        System.out.println(this.age<dd.age);//java并没有提供更细粒度的访问控制权限
    }

    class Inner{
        List<Inner> list = new ArrayList<Inner>();
        String name;
        public Inner(String name) {
            this.name = name;
            list.add(this);
        }

        @Override
        public String toString() {
            return "Inner{" +
                    "name=" + name +
                    '}';
        }
    }

}
