package com.day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example1 {


    public static void main(String[] args) {
        HashMap<String,Integer> hm =new HashMap<>();
        //LinkedHashMap<String,Integer> hm =new LinkedHashMap<>();
        //TreeMap<String,Integer> hm =new TreeMap<>();
        System.out.println(hm.size());


        hm.put("a", 10);
        hm.put("h", 20);
        hm.put("c", 25);
        hm.put("a", 23);
        hm.put("b", 24);

        System.out.println(hm.size());  //3
        System.out.println(hm);

        System.out.println(hm.get("h"));  //20
        hm.remove("h");
        System.out.println(hm.get("h"));  //null
        System.out.println(hm.containsKey("a")); //true
        System.out.println(hm.containsValue(20));//false


        //print separate value
        //we can't directly Iterator in HashMap so covert HashMap to Set interface
        Set s=hm.entrySet();  //convert both key and value to set interface
        Iterator itr=s.iterator();
        while(itr.hasNext()) {
            Map.Entry me=(Map.Entry)itr.next();  //next return both key and value so use Map
            System.out.println(me.getKey()+ " " +me.getValue());
            System.out.println();

            Set s1=hm.keySet();   //covert only key
            Iterator itr1=s1.iterator();
            while(itr1.hasNext()) {
                String key=(String)itr1.next();
                System.out.println(key+" "+hm.get(key));
            }


        }

    }

}
