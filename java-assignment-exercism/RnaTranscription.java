import java.util.Map;
import java.util.HashMap;

class RnaTranscription {

    Map<Character, String> map = new HashMap<>();
    RnaTranscription() {
        map.put('G', "C");map.put('C', "G");map.put('T', "A");map.put('A', "U");
    }
    String transcribe(String dnaStrand) {
        String transcribe = "";
        for (int i=0; i<dnaStrand.length(); i++) {
            transcribe = transcribe + map.get(dnaStrand.charAt(i));
        }
        return transcribe;
    }

}
