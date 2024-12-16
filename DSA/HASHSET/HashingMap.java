import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashingMap {
    public static void main(String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150); 

        System.out.println(map);

        map.put("China", 180); //update the value
        System.out.println(map);

        //Search
        if(map.containsKey("China")){
            System.out.println("key is present in the map");
        }
        else {
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("China")); //key exists
        System.out.println(map.get("indonesia")); // key doesn't exist

        for( Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String>  keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+ " " + map.get(key));
        }

        //remove
        map.remove("China");
        System.out.println(map);
    }
}
