package com.hzh.bean.lmpl;

import com.hzh.bean.FindTopValues;

public class FindTop implements FindTopValues {
    @Override
    public int findMaxValue(int[] anyOldOrderValues) {
        int max = anyOldOrderValues[0];
        for (int i : anyOldOrderValues) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    @Override
    public int[] findTopNValues(int[] anyOlderValues, int n) {
        int max = anyOlderValues[0];
        int[] b = new int[n];
        int c = 0;

        for (int i = 0; i < anyOlderValues.length; i++) {
            for (int j = 0; j <anyOlderValues.length ; j++) {
                if (i > max) {
                    max = i;
                    b[c] = i;
                    c++;
                }
            }
        }
        return b;
    }
}
