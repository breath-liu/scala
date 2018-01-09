package extendsDemo;

/**
 * Created by Administrator on 2018/1/9.
 */
public class Father {

    private String name;
    public String age;
    public void eat(){
        System.out.println("father eat");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.eat();
    }
}
