import java.util.List;
import java.util.Collections;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> rankCars) {
        Collections.sort(rankCars);
        return rankCars;
    }
}

public interface RemoteControlCar {
    
    public void drive();
    public int getDistanceTravelled(); 
}

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    
    private int distance;
    private int victories;

    public void drive() {
        distance += 10;  
    }
    
    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar compCar) {
        return Integer.compare(compCar.getNumberOfVictories(), getNumberOfVictories());
    }
}

public class ExperimentalRemoteControlCar implements RemoteControlCar  {
    
    private int distance;

    public void drive() {
        this.distance += 20;  
    }

    public int getDistanceTravelled() {
        return distance;
    }
}