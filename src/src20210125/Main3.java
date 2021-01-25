/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src20210125;

/**
 *
 * @author Campus FP
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num={34,21,7,73,53};
        int menor=99999;
        int mayor=-9999;
        for(int i=0;i<num.length;i++){
            if(menor>num[i]) menor=num[i];
            if(mayor<num[i]) mayor=num[i];
        }
        System.out.println("Mayor: "+mayor);
        System.out.println("Menor: "+menor);
    }
    
}
