package extendsDemo;

/**
 * Created by Administrator on 2018/1/9.
 */
public class Father {

    public final int a =1 ;
    public final int[] arr = new int[getA()];

    public int getA() {
        return this.a;
    }

    public int[] getArr() {
        return this.arr;
    }

    private final int range = 10;
    private final int[] env = new int[range()];


    public int range() {
        return this.range;
    }

    public int[] env() {
        return this.env;
    }

}
