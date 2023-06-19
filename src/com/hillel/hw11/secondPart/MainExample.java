package src.com.hillel.hw11.secondPart;


public class MainExample {
    public static void main(String[] args) {
        Participant[] participants = {
                new Person("Человек", 5000, 15),
                new Cat("Кот", 1100, 10),
                new Robot("Робот", 10000, 10)
        };

        Obstacle[] obstacles = {
                new RunningTrack(1000),
                new Wall(2),
                new RunningTrack(1500),
                new Wall(1),

        };

//        for (Participant participant : participants) {
//            boolean isFailed = false;
//
//            for (Obstacle obstacle : obstacles) {
//                obstacle.overcome(participant);
//                if (participant instanceof Participant){// && (participant.jumping() || participant.)){
//                isFailed = true;
//                break;
//                }
//            }
//
//            if (!isFailed){
//                System.out.println("Учасник "+ participant.getName() + " пройшов перешкоди");
//            }
//        }
        for(Participant participant : participants){
            for(Obstacle obstacle : obstacles){
                obstacle.overcome(participant);
                if(!participant.isActive()){
                    break;
                }
            }

        }

    }
}
