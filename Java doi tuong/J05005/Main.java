/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05005;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.text.*;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<SinhVien> ds = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i=1; i<=n; i++){
            SinhVien sv = new SinhVien(i,  in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
            sv.compareTo(sv);
            ds.add(sv);
        }        
        Collections.sort(ds);
        for(SinhVien a : ds){
            System.out.println(a);
        }
    }
}
