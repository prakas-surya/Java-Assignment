public class PangramChecker {

    public boolean isPangram(String input) {
        if (input.isEmpty()) return false;
        for (int i=65; i<=90; i++) {
            char lowerCase = (char) i;
            char upperCase = (char) (i+32);
            if(input.indexOf(lowerCase) == -1 && input.indexOf(upperCase) == -1) return false;
        }
        return true;
    }

}
