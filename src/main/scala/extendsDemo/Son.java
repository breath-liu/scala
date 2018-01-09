package extendsDemo;

/**
 * Created by Administrator on 2018/1/9.
 */
public class Son extends Father {

    @Override
    public void eat(){
        String age = super.age;
        System.out.println("son eat");
    }

}
