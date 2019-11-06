package com.hzh.bean;

public interface FindTopValues {
    int findMaxValue(int[] anyOldOrderValues);

    int[] findTopNValues(int[] anyOlderValues, int n);
}
