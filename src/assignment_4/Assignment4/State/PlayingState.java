package assignment_4.Assignment4.State;

public class PlayingState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Плеер уже воспроизводит аудио.");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Пауза. Аудио приостановлено.");
        player.setState(new PausedState());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Воспроизведение остановлено.");
        player.setState(new StoppedState());
    }
}