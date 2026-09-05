package com.nimish.CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Maps {
    public static void main(String[] args) {

        Map <String, String> map = new HashMap<>();

        map.put("in", "India");
        map.put("en", "England");
        map.put("eu", "Europe");

        System.out.println(map);

        map.putIfAbsent("au", "Australia");

        System.out.println(map);

        System.out.println(map.get("au"));

        map.replace("au", "Australia", "Austria");

        System.out.println(map);

        // Key Set
        Set <String> Keys = map.keySet();
        System.out.println(Keys);

        // Values Set
        Collection<String> ValuesSet = map.values();
        System.out.println(ValuesSet);



    }
}
