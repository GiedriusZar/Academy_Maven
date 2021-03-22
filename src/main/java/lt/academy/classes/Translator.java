package lt.academy.classes;

import java.util.HashMap;
import java.util.Map;

public class Translator {

    public static Map<String, String> translations;

    public Translator() {
        translations = new HashMap<>();
        translations.put("hello", "Welcome to our app");
        translations.put("entry_added", "Entry has been added");
        translations.put("logout", "Logout");
    }

    public static String toLocale (String key){
        return translations.get(key);

    }
}

