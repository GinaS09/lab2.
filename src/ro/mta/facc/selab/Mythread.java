package ro.mta.facc.selab;

public class Mythread extends Thread {
    @Override
    public void run() {
        System.out.println("Se executa pe alt thread");
    }
}
