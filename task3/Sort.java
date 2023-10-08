package com.mycompany.task3;

/*@author Fikri*/
public abstract class Sort {
    public abstract int compare(Sort b);
    public static void shell_short(Sort[] a){
        int n = a.length;
        for (int interval = n / 2; interval > 0; interval /= 2){
            for (int i = interval; i < n; i += 1){
                Sort temp = a[i];
                int j;
                for (j = i; j >= interval; j -= interval){
                    a[j] = a[j - interval];
                }
                a[j] = temp;
            }
        }
    }
}
