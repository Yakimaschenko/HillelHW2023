package src.com.hillel.hw11.secondPart;

public class Cat implements Participant{
    Integer runDistance;
    Integer jumpDistance;

    public Cat(Integer runDistance, Integer jumpDistance) {
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public int running() {
        return 0;
    }

    @Override
    public int jumping() {
        return 0;
    }
}
