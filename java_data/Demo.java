import java.util.*;
import java.lang.Math;

final public class Demo extends DemoParent {
    
    int a, b;
    private int c;
    String s;

    Demo() {
        super();        
        a = 10;
        b = 20;
        c = 30;
        s = "xyz";    
    }

    Demo(int a, int b) {
        super();
        this.a = a;
        this.b = b;
        this.c = 0;
        this.s = "xyz";
    }

    Demo(int a, int b, String s) {
        super();
        this.a = a;
        this.b = b;
        this.c = 0;
        this.s = s;
    }

    private int mul(int x) {
        return a * b * x;
    }

    private int add() {
        return a * b;
    }

    public static void main(String[] args) {
        Demo obj = new Demo(1, 2, "mno");
        
        int res1 = obj.mul(3);
        int res2 = obj.add();
        int res3 = obj.fun1(6);
        
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}

class DemoParent {

    int x = 1;

    protected int fun1(int a) {
        return this.x * a;
    }

    static void fun2() {
        return;
    }
}
