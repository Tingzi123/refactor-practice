package com.twu.refactoring;

import java.util.HashMap;
import java.util.Map;

public class NumberCruncher {
    private final int[] numbers;
    private final Map<String,Integer> numbersMap;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
        numbersMap = new HashMap<String, Integer>() {
            {
                put("even",0);
                put("odd",0);
                put("positive",0);
                put("negative",0);
            }};
    }

    public int countEven() {
        return getNumbersCount("even");
    }

    public int countOdd() {
        return getNumbersCount("odd");
    }

    public int countPositive() {
        return getNumbersCount("positive");
    }

    public int countNegative() {
        return getNumbersCount("negative");
    }

    private int getNumbersCount(String pattern) {
        Map<String, Integer> reMap = countNumbers();
        return reMap.get(pattern);
    }

    public Map<String,Integer> countNumbers(){
        for (int number : numbers) {
            if (number % 2 == 0) numbersMap.put("even",numbersMap.get("even")+1);
            if (number % 2 == 1) numbersMap.put("odd",numbersMap.get("odd")+1);
            if (number >= 0) numbersMap.put("positive",numbersMap.get("positive")+1);
            if (number < 0) numbersMap.put("negative",numbersMap.get("negative")+1);
        }
        return numbersMap;
    }
}
