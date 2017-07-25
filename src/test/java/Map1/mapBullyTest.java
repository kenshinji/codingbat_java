package Map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;


/**
 * Created by kenshinji on 25/07/2017.
 */
public class mapBullyTest {
    @Test
    public void mapBully() throws Exception {
        Map<String,String> test1 = new HashMap<String, String>(){{
            put("a", "candy");
            put("b", "dirty");
        }};
        Map<String,String> result1 = new HashMap<String, String>(){{
            put("a", "");
            put("b", "candy");
        }};

        Map<String,String> test2 = new HashMap<String, String>(){{
            put("a", "candy");
        }};
        Map<String,String> result2 = new HashMap<String, String>(){{
            put("a", "");
            put("b", "candy");
        }};

        Map<String,String> test3 = new HashMap<String, String>(){{
            put("a", "candy");
            put("b", "carrot");
            put("c", "meh");
        }};
        Map<String,String> result3 = new HashMap<String, String>(){{
            put("a", "");
            put("b", "candy");
            put("c", "meh");
        }};

        System.out.println(result1.toString());
        assertEquals(mapBully.mapBully(test1).toString(), result1.toString());
    }

}