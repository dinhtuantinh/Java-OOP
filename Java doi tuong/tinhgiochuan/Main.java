/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiochuan;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        ArrayList<GiangVien> dsgv = new ArrayList<>();
        ArrayList<GioChuan> dsgc = new ArrayList<>();
        Scanner in1 = new Scanner(new File("MONHOC.in")); 
        Scanner in2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner in3 = new Scanner(new File("GIOCHUAN.in"));
        int t1 = Integer.parseInt(in1.nextLine());
        while(t1-->0){
            MonHoc q = new MonHoc(in1.nextLine());
            dsmh.add(q);
        }
        int t2 = Integer.parseInt(in2.nextLine());
        for(int i=1; i<=t2; i++){
            GiangVien q = new GiangVien(in2.nextLine());
            dsgv.add(q);
        }
        int t3 = Integer.parseInt(in3.nextLine());
        while(t3-->0){
            GioChuan q = new GioChuan(in3.nextLine());
            dsgc.add(q);
        }
        for(int i=0; i<dsgc.size(); i++){
            String maso = dsgc.get(i).getMa();
            
            for(int j=0; j<dsgv.size(); j++){
                
                if(maso.equals(dsgv.get(j).getMagv())){
                    int ktra=0;
                    for(int k=0; k<dsmh.size(); k++){
                        if(dsgc.get(i).getMamon().equals(dsmh.get(k).getMamon())){
                            System.out.printf("%s %.2f", dsgv.get(j).getHoten(), dsgc.get(i).getGio());
                            ktra=1;
                        }
                        
                    }
                    if(ktra==0){
                        System.out.printf(dsgv.get(j).getHoten()+" 0.00");
                    }
                    
                }
                
            }
            System.out.println("");
        }
    }    
}
