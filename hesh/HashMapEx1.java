package hesh;

import java.util.HashMap;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("abc",10);
        hashMap.put("bbb",20);
        hashMap.put("vvv",33);
        hashMap.put("abc",20);

        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.get("abc"));
        System.out.println(hashMap.containsKey("abc"));

        hashMap.remove("abc");
        System.out.println(hashMap.containsKey("abc"));
        System.out.println(hashMap.size());

        hashMap.clear();
        System.out.println(hashMap.isEmpty());


    }
}
