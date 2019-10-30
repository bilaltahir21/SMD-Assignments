import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Application {
    Communication obj;

    int secondsPassed = 0;
    Timer myTimer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            ++secondsPassed;
            System.out.println("Second: " + secondsPassed);
            if (secondsPassed % 5 == 0) {
                isProcessARunning(obj);
            }
        }
    };

    Application(Communication obj) {
        this.obj = obj;
        System.out.println("Application started!");
        myTimer.scheduleAtFixedRate(task, 1000, 1000);
    }

    void isProcessARunning(Communication obj) {
        boolean ifYes = obj.isRunning();
        if (ifYes) {
            System.out.println("Stop wasting time!");
            Random rand = new Random();
            int x = rand.nextInt(2);
            if (x == 0) {
                System.out.println(obj.continuePlaying());
            } else {
                System.out.println(obj.exitGame());
                obj.end();
                task.cancel();
                myTimer.cancel();
                myTimer.purge();
                return;
            }
        }
    }
}
