package Persistent;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommunicationModel {

    private static HashMap<String, String> responseMap;
    static {
        responseMap = new HashMap<>();
        responseMap.put("(hi)+?", "Hello!");
        responseMap.put("(how)+(you)?", "I'm good; how about you? how's your game play? did you find some hidden gold? I need some money to buy a rifle, but I don’t know where it is");
        responseMap.put("(link|info|way)+(get|money|gold)*", "Yes, I need that information.");
        responseMap.put("http", "this is great. But it is hard to see the map for the gold bar.");
        responseMap.put("(give|wait)+(second)*", "yup!");
        responseMap.put("map", "Thanks again!!");
        responseMap.put("download", "Okay, I will download..");
        responseMap.put("jpg", "This will be helpful");
        responseMap.put("enjoy", "I'm gonna play right now! See you Isabelle!");
        responseMap.put("(game)", "I found all the gold bars! thanks Isabelle!");
        responseMap.put("(see).(you)", "See you! bye!");
    }
    public static final String defaultMessageFromBot = "I am sorry.. I don't know what you mean...";

    public HashMap<String, String> getResponseMap() {
        return responseMap;
    }
}
