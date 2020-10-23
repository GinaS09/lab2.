package ex33;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterTask implements Task{
    private int counter=0;

    public CounterTask() {
        this.counter++;
    }


    @Override
    public void executa() {
        System.out.println( counter);
    }
}
