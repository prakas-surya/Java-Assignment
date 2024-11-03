import java.util.Arrays;
import java.util.List;

public class ResistorColorTrio {

    List<String> colorValues = Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");

    String label(String[] colors) {

        long significantDigits = colorValues.indexOf(colors[0]) * 10 + colorValues.indexOf(colors[1]);
        long multiplier = (long) Math.pow(10, colorValues.indexOf(colors[2]));
        long result = significantDigits * multiplier;

        String label;
        if (result >= 1_000_000_000) {
            label = (result / 1_000_000_000) + " gigaohms";
        } else if (result >= 1_000_000) {
            label = (result / 1_000_000) + " megaohms";
        } else if (result >= 1_000) {
            label = (result / 1_000) + " kiloohms";
        } else {
            label = result + " ohms";
        }

        return label;
    }
}

