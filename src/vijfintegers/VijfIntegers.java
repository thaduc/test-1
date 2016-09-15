/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vijfintegers;

import java.lang.Math;
import java.util.Arrays;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class VijfIntegers {

    private int xx;

    public int getXx() {
        return xx;
    }
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        int[] v = new int[7];
        int som;
        
        som = 0;
        for (int i=0; i<v.length; i++)
        {
            v[i] = (int)(Math.random() * 100 + 1);
        }
        
        Arrays.sort(v);
        
        for (int i=0; i<v.length; i++)
        {
            som += v[i];
            System.out.println(v[i]); 
        }
        System.out.println("gemiddelde: " + (float) som / v.length); 
    }

    public void setXx(int xx) {
        this.xx = xx;
    }
    
}
