package usc;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class TestMap {
    private void addNullValue(Map<String, String> map){
        map.put("A", null);
        map.put("B","100");
        map.put("C","1");
    }

    @Test
    void test1(){
        Map<String, String> map = new HashMap<>();
        addNullValue(map);
        assertEquals(2, map.size());
        System.out.println(map.get("B"));
        assertEquals(null, map.get("A"));
    }
}
