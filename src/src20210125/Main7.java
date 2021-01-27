/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src20210125;

import java.util.Arrays;

/**
 *
 * @author Campus FP
 */
public class Main7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        String y;
        Boolean rep=true;
        int[] num={};
        while(rep==true){
            System.out.println("introduce un numero o escribe 'fin' para terminar:");
            y=Entrada.readStr();
            if(y!="fin" || y!="FIN" || y!="f" || y!="F"){
                x=Integer.parseInt(y);
                //num.add(x)
                //lista=Arrays.asList(num);
                //lista.add(x);
                //num=new int[lista.size()];
            }else{
                System.out.println("generando array");
                for(int i=0;i<num.length;i++){
                    System.out.println(num[i]);
                }
            }
        }
    }
}