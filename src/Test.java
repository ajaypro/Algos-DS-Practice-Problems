import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 23);
        map.put(1, 22);
        map.put(null,34);
        map.put(null,45);
        map.put(4, 67);
        map.put(5, 67);
        map.forEach((K,V) -> System.out.println("Item : " + K + " Count : " + V));

        /*for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }*/


        /*HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Motorolla", 20);
        map.put("RealMe", 30);
        map.put("Oppo", 40);
        map.put("Sony", 50);
        map.put("OnePlus", 60);

        map.forEach((K,V) -> System.out.println(K + ", Stock : " + V));*/

        /*for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", Stock : " + entry.getValue());
        }*/
    }
}
