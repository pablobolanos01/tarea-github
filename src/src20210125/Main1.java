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
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array tipo cadena
        String[] nombre={"Luis","Miguel","Carlos"}; 
        //recorrer array
        for(int i=0;i<nombre.length;i++){
            System.out.println(nombre[i]);
        }
        //array tipo double
        double[] estatura={1.72,1.75,1.65};
        for(int i=0;i<estatura.length;i++){
            System.out.println(estatura[i]);
        }
    }
    
    
}
