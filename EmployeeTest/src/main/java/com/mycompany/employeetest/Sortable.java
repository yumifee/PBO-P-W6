package com.mycompany.employeetest;

/**
 * @author Yumi Febriana
 */
abstract class Sortable {
    public abstract int compare(Sortable b);
    public static void shell_sort(Sortable[] a){
        int jumlahStaff = a.length;
        
        for ( int gap  = jumlahStaff / 2 ; gap > 0; gap /= 2 ){
            for (int i = gap; i < jumlahStaff ; i++){
            Sortable key = a[i];
            int j = i;
            while (j >= gap && a[j-gap].compare(key) == 1){
                a[j] = a[j-gap];
                j -= gap;
            }
            a[j] = key;
        }
       }
    }
}
