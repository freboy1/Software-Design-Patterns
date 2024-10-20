package assignment_4.Assignment4.State;

public class PausedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Воспроизведение возобновлено.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Плеер уже на паузе.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Воспроизведение остановлено.");
        player.setState(new StoppedState());
    }
}