package com.liulei.gmail.mock.util;

import java.util.Random;

/**
 * Created by jihn88 on 2020/9/26.
 */
public class RandomNum {
    public static final  int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }
}
