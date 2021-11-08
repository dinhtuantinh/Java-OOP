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
public class ThoiGian implements Comparable<ThoiGian>{
    private int gio,phut,giay;
    
    public ThoiGian(String thoigian){
        this.gio = Gio(thoigian);
        this.phut = Phut(thoigian);
        this.giay = Giay(thoigian);
    }
    public String toString(){
        return gio+" "+phut+" "+giay;
    }
    private int Gio(String a){
        int res = 0;
        for(int i=0; i<2; i++){
            res= res*10+a.charAt(i)-'0';
        }
        return res;
    }
    private int Phut(String a){
        int res = 0;
        for(int i=3; i<5; i++){
            res= res*10+a.charAt(i)-'0';
        }
        return res;
    }
    private int Giay(String a){
        int res = 0;
        for(int i=6; i<8; i++){
            res= res*10+a.charAt(i)-'0';
        }
        return res;
    }
    public int compareTo(ThoiGian o){
        if(this.gio==o.gio){
            if(this.phut==o.phut){
                if(this.giay>o.giay) return 1;
                if(this.giay<o.giay) return -1;
                return 0;
            }
            if(this.phut<o.phut) return -1;
            if(this.phut>o.phut) return 1;
        }
        if(this.gio>o.gio) return 1;
        return -1;
    }
}
