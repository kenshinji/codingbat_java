package Map1;

import java.util.Map;

/**
 * Created by kenshinji on 25/07/2017.
 */
public class mapShare {
    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        if (map.containsKey("c")) {
            map.remove("c");
        }

        return map;
    }
}
