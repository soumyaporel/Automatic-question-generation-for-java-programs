import java.util.*;
import java.lang.Math;

public final class Demo extends DemoParent {
    
    int a, b;
    private int c;
    String s;

    Demo() {
        super();        
        a = 10;
        b = 20;
        s = "xyz";    
    }

    Demo(int a, int b) {
        super();
        this.a = a;
        this.b = b;
        this.s = "xyz";
    }

    Demo(int a, int b, String s) {
        super();
        this.a = a;
        this.b = b;
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
    final float y = 2;

    final protected int fun1(int a) {
        return this.x * a;
    }
    static int fun2(int a) {
        return this.x * a;
    }
}

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
    	System.out.println("Zzz");
    }
}

class Cat extends Animal {

    final int x = 1;

    public void animalSound() {
    	// The body of animalSound() is provided here
    	System.out.println("The dog says: mew mew");
    }
  
    public static void demoMethod() {
    	System.out.println("This is a static method");
    }
}

// Interface
interface AnimalIF {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements AnimalIF {

    private int d;
    protected float f;
  
    public void animalSound() {
        // The body of animalSound() is provided here
    	System.out.println("The pig says: wee wee");
    }
  
    public void sleep() {
    	// The body of sleep() is provided here
    	System.out.println("Zzz");
    }
}
