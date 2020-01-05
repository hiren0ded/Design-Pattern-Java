package singleton;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface A
{

    default void print()
    {
        System.out.println("I am A.. Default Method");
    }

    static void ok()
    {
        System.out.println("I am A.. Ok Method");
    }

}

interface B{
    default void print()
    {
        System.out.println("I am B default Method");
    }
}


public class test implements A,B {
    test(){
        this.print();
    }


    public static void main(String[] args) {
        A obj = new test();
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
    }

    public void print()
    {
        A.super.print();
        B.super.print();
    }


}
