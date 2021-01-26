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
public class Main6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] txt1={"texto1.1","texto1.2","texto1.3","texto1.4","texto1.5"};
        String[] txt2={"texto2.1","texto2.2","texto2.3","texto2.4","texto2.5","texto2.6","texto2.7","texto2.8","texto2.9"};
        System.out.println("ARRAY 1:");
        for(int i=0;i<txt1.length;i++){
            System.out.println(txt1[i]);
        }
        System.out.println("ARRAY 2:");
        for(int i=0;i<txt2.length;i++){
            System.out.println(txt2[i]);
        }
        System.out.println("Reemplazando...");
        System.arraycopy(txt1, 0, txt2, 0, 5);
        System.out.println("ARRAY 1:");
        for(int i=0;i<txt1.length;i++){
            System.out.println(txt1[i]);
        }
        System.out.println("ARRAY 2:");
        for(int i=0;i<txt2.length;i++){
            System.out.println(txt2[i]);
        }
    }
}