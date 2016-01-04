package com.gamis214;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //-->ArrayList
        List<Integer> lstArrayList = new ArrayList<>();
        lstArrayList.add(1);
        lstArrayList.add(2);
        lstArrayList.add(3);
        lstArrayList.add(4);
        lstArrayList.add(5);

        //-->LinkedList
        List<Integer> lstLinkedList = new LinkedList<>();
        lstLinkedList.add(1);
        lstLinkedList.add(2);
        lstLinkedList.add(3);
        lstLinkedList.add(4);
        lstLinkedList.add(5);

        //-->HashSet
        Set<Integer> lstHashSet = new HashSet<>();
        lstHashSet.add(1);
        lstHashSet.add(2);
        lstHashSet.add(3);
        lstHashSet.add(4);
        lstHashSet.add(5);

        //-->HashMap Forma 1
        HashMap<String,Integer> lstHashMap = new HashMap<>();
        lstHashMap.put("A",1);
        lstHashMap.put("B",2);
        lstHashMap.put("C",3);
        lstHashMap.put("D",4);
        lstHashMap.put("E",5);

        //-->HashMap Forma 2
        HashMap lstHashMap2 = new HashMap();
        lstHashMap2.put(1,"A");
        lstHashMap2.put(2,"B");
        lstHashMap2.put(3,"C");
        lstHashMap2.put(4,"D");
        lstHashMap2.put(5,"F");


    }
}
