package Map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by kenshinji on 25/07/2017.
 */
public class mapShareTest {
    @Test
    public void mapShare() throws Exception {
        Map<String,String> test1 = new HashMap<String, String>(){{
            put("a", "aaa");
            put("b", "bbb");
            put("c", "ccc");
        }};
        Map<String,String> result1 = new HashMap<String, String>(){{
            put("a", "aaa");
            put("b", "aaa");
        }};

        Map<String,String> test2 = new HashMap<String, String>(){{
            put("b", "xyz");
            put("c", "ccc");
        }};
        Map<String,String> result2 = new HashMap<String, String>(){{
            put("b", "xyz");
        }};

        Map<String,String> test3 = new HashMap<String, String>(){{
            put("a", "aaa");
            put("c", "meh");
            put("d", "hi");
        }};
        Map<String,String> result3 = new HashMap<String, String>(){{
            put("a", "aaa");
            put("b", "aaa");
            put("d", "hi");
        }};

        System.out.println(result1.toString());
        assertEquals(mapShare.mapShare(test1).toString(), result1.toString());
    }

}