package Training;
import java.util.HashMap;
public class LanguageCount {
	public static void main(String[] args) {
        String languages = "eng chinese eng telugu chinese hindi chinese";
        HashMap<String, Integer> languageCount = new HashMap<>();

        
        String[] languageArray = languages.split(" ");

       
        for (String language : languageArray) {
           
            languageCount.put(language, languageCount.getOrDefault(language, 0) + 1);
        }

        for (String language : languageCount.keySet()) {
            if (languageCount.get(language) > 1) {
                System.out.println(language);
            }
        }
    }
}
