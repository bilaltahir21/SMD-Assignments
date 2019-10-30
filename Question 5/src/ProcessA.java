public class ProcessA implements Communication {
    boolean state = false; // True for running and false for not running

    ProcessA() {
        state = true;
    }

    @Override
    public String continuePlaying() {
        return "I have to play!";
    }

    @Override
    public String exitGame() {
        return "Quiting Game!";
    }

    @Override
    public void end() {
        state = false;
    }

    @Override
    public boolean isRunning() {
        return state;
    }
}
