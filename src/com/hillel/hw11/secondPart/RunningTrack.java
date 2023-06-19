package src.com.hillel.hw11.secondPart;

public class RunningTrack extends Obstacle{
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void overcome(Participant participant) {
        participant.running(distance);
    }

}
