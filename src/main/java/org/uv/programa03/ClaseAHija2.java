/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa03;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author FHATIMA
 */
public class ClaseAHija2 extends ClaseA{
    
    @Override
    public void msg(){
        Logger.getLogger(ClaseAHija2.class.getName()).log(Level.INFO, "Hola desde ClaseAHija2");
    }
}

