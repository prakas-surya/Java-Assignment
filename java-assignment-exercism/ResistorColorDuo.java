import java.util.List;
import java.util.Arrays;

class ResistorColorDuo {
    List<String> colorValues = Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");
    
    int value(String[] colors) {
        return colorValues.indexOf(colors[0]) * 10 + colorValues.indexOf(colors[1]);
    }
}
