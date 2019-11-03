package demo.Redis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjiang on 2019/10/20.
 * 模拟hashmap结构
 */
public class ArrayMap<K,V> {
    private List<K> keys=new ArrayList<>();
    private List<V> values =new ArrayList<>();

    public  V put(K k,V v){
        for (int i=0;i<keys.size();i++){
            if (keys.get(i).equals(k)){
                V oldv =values.get(i);
                values.set(i,v);
                return oldv;
            }
        }
        keys.add(k);
        values.add(v);
        return null;
    }
}
