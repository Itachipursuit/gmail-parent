package com.liulei.gmail.mock.util;

/**
 * Created by jihn88 on 2020/9/26.
 */
public class RanOpt <T>{
    T value ;
    int weight;

    public RanOpt ( T value, int weight ){
        this.value=value ;
        this.weight=weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }

}
