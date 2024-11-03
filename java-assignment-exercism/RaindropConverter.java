class RaindropConverter {

    String convert(int number) {
        String rainDrop = "";
        if (number % 3 == 0) rainDrop = rainDrop + "Pling";
        if (number % 5 == 0) rainDrop = rainDrop + "Plang";
        if (number % 7 == 0) rainDrop = rainDrop + "Plong";
        if (rainDrop.isEmpty()) {
            rainDrop = String.valueOf(number);
        }
        return rainDrop;
    }

}
