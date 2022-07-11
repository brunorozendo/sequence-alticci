package com.altice.service;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Hashtable;



import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;
import java.util.Optional;

@Named("dataService")
@Singleton
public class DataService {

    final private HashMap<Integer, Integer> data = new HashMap<>();


    public Integer generateSequence(Integer n){
        if (n <= 0){
            return 0;
        }
        if (n == 2 || n == 1){
            return 1;
        }

        Integer s1;
        if(data.containsKey(n-3)) {
            s1 = data.get(n-3);
        } else {
            s1 = generateSequence(n-3);
            data.put(n-3, s1);
        }

        Integer s2;
        if(data.containsKey(n-2)) {
            s2 = data.get(n-2);
        } else {
            s2 = generateSequence(n-2);
            data.put(n-2, s2);
        }
        return s1 + s2;
    }








}
