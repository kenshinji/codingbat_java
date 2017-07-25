package Map1;

import java.util.Map;

/**
 * Created by kenshinji on 25/07/2017.
 */
public class mapBully {

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }

        return map;
    }
}
