package com.it.vehicle.utils;

import java.util.UUID;

public class NumberIdGenerate {
    public static String  getNumber(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
