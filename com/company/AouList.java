package com.company;

import java.util.ArrayList;

/**
 * Created by madooding on 9/25/2017 AD.
 */
public class AouList extends ArrayList<Object> {

    @Override
    public boolean add(Object obj){
        if(super.size() < 10){
            return super.add(obj);
        }
        return false;
    }
}
