

import java.util.Arrays;
import java.util.HashMap;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class J02005_giao_cua_2_day_so {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m =  in.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        for(int i=0; i<m; i++){
            b[i]=in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int dem=0;
        int A[]=new int[n];
        HashMap<Integer, Boolean> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            if(mp.get(a[i])==null){
                A[dem]=a[i];
                dem++;
                mp.put(a[i], true);
            }
        } 
        int dem1=0;
        int B[]=new int[m];
        HashMap<Integer, Boolean> mp1 = new HashMap<>();
        for(int i=0; i<m; i++){
            if(mp1.get(b[i])==null){
                B[dem1]=b[i];
                dem1++;
                mp1.put(b[i], true);
            }
        } 
        for(int i=0; i<dem; i++){
            for(int j=0; j<dem1; j++){
                if(A[i]==B[j]){
                    System.out.print(A[i]+" ");
                }
            }
        }
        System.out.println("");
    }
}
