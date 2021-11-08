/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05033;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ThoiGian> ds = new ArrayList<>();
        int t  = Integer.parseInt(in.nextLine());
        while(t-->0){
            ThoiGian q = new ThoiGian(in.nextLine());
            q.compareTo(q);
            ds.add(q);
        }
        Collections.sort(ds);
        for(ThoiGian a : ds){
            System.out.println(a);
        }
    }
}
