class BottleSong {

    String recite(int startBottles, int takeDown) {
        String[] number = {"no", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        String result = "";
        
        while (takeDown != 0) {
            result = result + verse(number[startBottles], number[startBottles - 1]);
            startBottles--;
            takeDown--;
            if (takeDown != 0) result = result + "\n";
        }

        return result;
    }

    String verse(String current, String previous) {
        previous = Character.toLowerCase(previous.charAt(0)) + previous.substring(1);
        String PBottles = "bottles";
        String CBottles = "bottles";
        if (previous.equals("one")) PBottles = "bottle";
        if (current.equals("One")) CBottles = "bottle";
        String recite = current + " green " + CBottles + " hanging on the wall,\n" +
                        current + " green " + CBottles + " hanging on the wall,\n" +
                        "And if one green bottle should accidentally fall,\n" +
                        "There'll be " + previous + " green " + PBottles + " hanging on the wall.\n";
        return recite;
    }

}