import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExamples {
    static void HashTableExamples(){

    }
    static void HashMapExamples(){
        Map<Integer,String> mp=new HashMap<>();
        mp.put(1,"Ritik");
        mp.put(2,"Yadav");
        mp.put(3,"Tushar");
        mp.putIfAbsent(1,"Yad");
//        System.out.println(mp);
//        System.out.println(mp.get(2));
//        System.out.println(mp.containsKey(4));
//        System.out.println(mp.containsValue("Tushar"));
//        System.out.println(mp.entrySet());
//        System.out.println(mp.values());
        for (Integer i:mp.keySet()){  //Iterate over keys
            System.out.println(i);
        }
        for (var e:mp.entrySet()){  // Iterate over key,value mapping
            System.out.print(e.getValue()+" ");
            System.out.println(e.getKey());
        }
    }

    public static void main(String[] args) {
        HashMapExamples();
        HashTableExamples();
    }
}
