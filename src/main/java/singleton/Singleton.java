package singleton;

public class Singleton {

    private static volatile Singleton singleton;
    private int a;
    private int b;

    private Singleton() {
    }

    public static Singleton getInstance()
    {
        //load in lazy manner
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
