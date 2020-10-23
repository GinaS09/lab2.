package ex33;

import java.util.ArrayList;

public class Main {
    public static  void main(String[] args)
    {
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new OutTask());
        tasks.add(new OutTask());
        tasks.add(new RandomOutTask());
        tasks.add(new CounterTask());


        for(Task j:tasks)
            j.executa();

        MyThread t = new MyThread();
        t.start();

        MyRunnable obj=new MyRunnable();
        Thread r=new Thread(obj);
        r.start();

        new Thread(new Runnable() {
            @Override
            public void run() {System.out.println("Thread anonim");}}).start();

    }
}
