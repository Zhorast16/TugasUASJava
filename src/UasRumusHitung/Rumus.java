/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UasRumusHitung;

/**
 *
 * @author lab3
 */
public class Rumus {

    public int Rumus(int n1) {
         int x = Integer.valueOf(n1);
         String hitung = Integer.toBinaryString(x);
         int test = Integer.valueOf(hitung);
        return test;
    }
    
    public String Rumus(String n1) {
        int rem;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F',};
        
        int v1 = Integer.parseInt(n1);
        while(v1>0){
        rem=v1%16;
        hex=hexchars[rem]+hex;
        v1=v1/16;
        }
        
        //String test = Integer.valueOf(hex);
        return hex;
    }


}
