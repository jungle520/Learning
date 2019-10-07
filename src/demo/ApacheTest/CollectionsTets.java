package demo.ApacheTest;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.OrderedMap;
import org.apache.commons.collections.bidimap.TreeBidiMap;
import org.apache.commons.collections.map.LinkedMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by wangjiang on 2019/9/24.
 */
public class CollectionsTets {
    public static void main(String[] args) {
        OrderedMap map = new LinkedMap();

        map.put("FIVE", "5");
        map.put("SIX", "6");
        map.put("SEVEN", "7");
        map.firstKey(); // returns "FIVE"
        map.nextKey("FIVE"); // returns "SIX"
        map.nextKey("SIX"); // returns "SEVEN"

        /**
         * 通过key得到value
         * 通过value得到key
         * 将map里的key和value对调
         */

        BidiMap bidi = new TreeBidiMap();
        bidi.put("SIX", "6");
        bidi.get("SIX");  // returns "6"
        bidi.getKey("6");  // returns "SIX"
        //       bidi.removeValue("6");  // removes the mapping
        BidiMap inverse = bidi.inverseBidiMap();  // returns a map with keys and values swapped
        System.out.println(inverse);

        /**
         * 得到两个集合中相同的元素
         */
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        List<String> list2 = new ArrayList<String>();
        list2.add("2");
        list2.add("3");
        list2.add("5");
        Collection c = CollectionUtils.retainAll(list1, list2);
        System.out.println(c);
    }
}
