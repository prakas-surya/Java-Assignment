import java.util.ArrayList;
import java.util.List;

public class KillerSudokuHelper {

    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize, List<Integer> exclude) {
        List<List<Integer>> combinations = new ArrayList<List<Integer>>();
        generateCombinations(cageSum,  cageSize, 1, new ArrayList<>(), combinations, exclude);

        return combinations;
    }

    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize) {
        return combinationsInCage(cageSum, cageSize, new ArrayList<>());
    }


    public void generateCombinations(Integer cageSum, Integer cageSize, int start, List<Integer> currentCombinations,List<List<Integer>> combinations, List<Integer> exclude){
        if (cageSize == 0 && cageSum == 0) {
            combinations.add(new ArrayList<>(currentCombinations));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (!exclude.contains(i)) {
                currentCombinations.add(i);
                generateCombinations(cageSum - i, cageSize - 1, i + 1, currentCombinations, combinations, exclude);
                currentCombinations.remove(currentCombinations.size() - 1);
            }
        }
    }

}