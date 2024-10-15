class Acronym {

    private final String acronym;
  
    Acronym(String phrase) {
        this.acronym = generateAcronym(phrase);
    }

    String get() {
        return acronym;
    }

    private String generateAcronym(String phrase) {
        String[] words = phrase.split("[\\s-_]+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)));
        }

        return result.toString();
    }

}
