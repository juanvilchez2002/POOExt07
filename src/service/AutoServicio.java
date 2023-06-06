package service;

import entidad.Auto;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;


public class AutoServicio {
    
    Scanner consola = new Scanner(System.in).useDelimiter("\n");
    
    public Auto crearAuto(){
        
        //creamos e iniciamos el OBJ
        Auto au = new Auto();
        
        //creamos y pasamos parametros
        System.out.println("Cargar Ficha de Auto:");
        System.out.println("");
        System.out.print("Ingrese el nombre del Dueño: ");
        au.setDuenio(consola.nextLine());
        
        String fecha="";
        System.out.print("Año de Vencimiento: ");
        int anio = consola.nextInt();
        System.out.print("Mes de Vencimiento: ");
        int mes = consola.nextInt();
        System.out.print("Dia de Vencimiento: ");
        int dia = consola.nextInt();
        
        //trabajamos con la libreria LocalDate y le damos formato con DateTimeFormartter
        //con DateTimeFormatter.ofPattern se le otorga el formato
        LocalDate ld = LocalDate.of((int)anio, (int)mes, (int)dia);
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("formateador = " + formateador.format(ld));
        fecha = formateador.format(ld);
        
        au.setFechaVencimiento(fecha);
        
        consola.nextLine();
        
        System.out.print("Color del Vehiculo: ");
        au.setColor(consola.nextLine());
        System.out.print("Modelo del Vehiculo: ");
        au.setModelo(consola.nextLine());
        
        return au;
    }
    
}
