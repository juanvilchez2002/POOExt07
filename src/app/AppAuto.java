/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import entidad.Auto;
import service.AutoServicio;

public class AppAuto {

    public static void main(String[] args) {
        // creamos e instanciamos el OBJ AutoServicio
        
        AutoServicio us = new AutoServicio();
        Auto au = us.crearAuto();
        
        System.out.println(au.toString());
    }
    
}
