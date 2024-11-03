import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class KindergartenGarden {
    public String[] garden;

    KindergartenGarden(String garden) {
        this.garden = garden.split("\n");
    }

    List<Plant> getPlantsOfStudent(String student) {
        
        List<Plant> result = new ArrayList<>();
        int column = (int) student.charAt(0) - 'A'; 

        result.add(Plant.getPlant(garden[0].charAt(column*2)));
        result.add(Plant.getPlant(garden[0].charAt(column*2 + 1)));
        result.add(Plant.getPlant(garden[1].charAt(column*2)));
        result.add(Plant.getPlant(garden[1].charAt(column*2 + 1)));

        return result;
    }
}
