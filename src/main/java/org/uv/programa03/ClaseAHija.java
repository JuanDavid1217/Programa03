/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa03;

import java.util.logging.Logger;
import java.util.logging.Level;


/**
 *
 * @author FHATIMA
 */
public class ClaseAHija extends ClaseA{
    
    @Override
    public void msg(){
        Logger.getLogger(ClaseAHija.class.getName()).log(Level.INFO, "Hola en abstracto");

    }
}
