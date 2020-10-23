package Ex5;

import java.util.ArrayList;


public class Main {
    public static void main (String[] args)
    {
        Thread thread = Thread.currentThread();
        String threadName = Thread.currentThread().getName();

        System.out.println(thread);

        ArrayList<Thread> tList=new ArrayList<Thread>();
        for (int i = 0; i < 10; i=i+1) {
            String s=String.valueOf(i);
            Thread t =new Thread();
            t.setName(s);
            t.start();
            tList.add(t);
        }

        for (Thread t : tList) {
            System.out.println("My name is"+t.getName()) ;
        }
        System.out.println(thread);
    }
}
