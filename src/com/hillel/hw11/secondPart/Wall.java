package src.com.hillel.hw11.secondPart;

public class Wall extends Obstacle{
    private int heightDistance;

    public Wall(int heightDistance) {
        this.heightDistance = heightDistance;
    }

    @Override
    public void overcome(Participant participant) {
        participant.jumping(heightDistance);
    }
}
