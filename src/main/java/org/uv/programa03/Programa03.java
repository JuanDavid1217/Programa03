/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa03;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author FHATIMA
 */
public class Programa03 {

    public static void main(String[] args) {
//      ClaseConcreta c= new ClaseConcreta();
//       c.imprimir();
//
//      ClaseAHija cah= new ClaseAhija();
//       cah.imprimir();

/*        ClaseA ca=null;
        
        ca=new ClaseAHija();
        ca.imprimir();
        
        ca=new ClaseAHija2();
        ca.imprimir();
        
        ca = new ClaseA() { //Permite hacer llamadas anonimas
            @Override
            public void msg() {
                Logger.getLogger(Programa03.class.getName()).log(Level.INFO, "Otra Clase concreta");
            }
        };
        ca.imprimir();*/

        NewInterface eje=null;
        eje=new IClaseconcreta1();
        eje.msg();
        
        eje=new IClaseConcreta2();
        eje.msg();
        
        eje=new NewInterface(){
            @Override
            public void msg(){
                System.out.println("llamada anonima");
            }
        };
        eje.msg();
    }
}
