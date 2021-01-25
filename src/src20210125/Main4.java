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
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num={34,21,7,73,53};
        double avg=0;
        int cont=0;
        for(int i=0; i < num.length; i++){
            avg+=num[i];
            cont++;
        }
        System.out.println("Media: "+(avg/cont));
    }
    
}
