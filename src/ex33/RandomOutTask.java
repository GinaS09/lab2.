package ex33;
import java.util.Random;

public class RandomOutTask implements Task {
    @Override
    public void executa() {
        // create instance of Random class 
        Random rand = new Random();

        // Generate random integers in range 0 to 999 
        int rand_int = rand.nextInt(1000);
        

        // Print random integers 
        System.out.println("RandomOutTask:  "+rand_int);

    }
}
