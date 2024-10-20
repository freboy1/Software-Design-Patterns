package assignment_4.Assignment4.State;

public class Player {
    private PlayerState state;

    public Player() {
        state = new StoppedState(); // Изначально плеер в состоянии остановки
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}
