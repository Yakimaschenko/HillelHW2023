package src.com.hillel.hw11.secondPart;

abstract class Participant {
    private String name;
    private int MaxRunDistance;
    private int MaxJumpDistance;
    protected boolean active;


    public Participant(String name, int maxRunDistance, int maxJumpDistance) {
        this.name = name;
        this.MaxRunDistance = maxRunDistance;
        this.MaxJumpDistance = maxJumpDistance;
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void running(int distance) {
        if (active) {
            if (distance <= MaxRunDistance) {
                System.out.println(name + " успешно пробежал - " + distance + " m.");
            } else {
                System.out.println("к сожалению " + name + " не может столько пробежать..." + "( Максимальная дистанция для бега = " + MaxRunDistance + " м.)");
                active = false;
            }
        }
    }



        public void jumping ( int heightDistance){
            if (active) {
                if (heightDistance <= MaxJumpDistance) {
                    System.out.println(name + " успешно прыгнул - " + heightDistance + " m.");
                } else {
                    System.out.println("к сожалению " + name + "  не может столько прыгнуть ..." + "( Максимальная дистанция для прыжка = " + MaxJumpDistance + " м.)");
                    active = false;
                }
            }
        }
    }

