package exercise;

import java.time.LocalDate;

/**
 * Created by Administrator on 2018/1/5.
 */
public class DateDemo {
    private int age;

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 12, 21);
        System.out.println(date);
    }

    public void isless(DateDemo dd){
        System.out.println(this.age<dd.age);//java并没有提供更细粒度的访问控制权限
    }

}
