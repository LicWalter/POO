package com.mycompany.ejercicioherencia;
import java.util.Scanner;
public class principal {  
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
     carro miCarro = new carro(11000,"Segunda mano -  Buen estado",2012 ,"Renault", "Twingo", "Colombia","1.2 Access", "Azul", 23000000 );
     moto miMoto = new moto("Nueva", "102 cc", 2024, "Bajaj", "BOXER CT 100 ES", "Colombia", "4 tiempos", "Negro", 6350000);
     microbus miMicrobus = new microbus (20, 1, 2011, "Chevrolet", "NPR", "España","5.193 CC, TDI turbo de geometría variable", "Blanco",130000000);
     bicicleta miBicicleta = new bicicleta("Mountain bike", "Acero inoxidable", 120,"Roadmaster","Hurricane", "Colombia", "", "Rojo", 671900);
        
     
        System.out.println("_____________________________________________");
        System.out.print("-BIENVENIDO,");
       
        while(true) {
        
        System.out.println(" ¿QUE ATRIBUTO DESEA CONOCER?");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Microbus");
        System.out.println("4. Bicicleta");
        System.out.println("5. Salir del programa");
        System.out.print("--> "); int num = sc.nextInt();
        
        
      if(num==5){
          System.out.println("Saliendo del programa...");
          
          break;
      }
       
        switch (num){
        
             case 1:
                 
        System.out.println("_____________________________________________");
        System.out.println("-ATRIBUTOS DEL CARRO");
        System.out.println("_____________________________________________");
        System.out.println("-Marca: "+miCarro.getMarca());
        System.out.println("-Modelo: "+miCarro.getModelo());
        System.out.println("-Pais de Produccion: "+miCarro.getPais_de_produccion());
        System.out.println("-Motor: "+miCarro.getMotor());
        System.out.println("-Color: "+miCarro.getColor());
        System.out.println("-Kilometraje: "+miCarro.getKilometraje());
        System.out.println("-Año de Fabricación: "+miCarro.getAñoF());
        System.out.println("-Estado: "+miCarro.getEstado());
        System.out.println("-Precio: $"+miCarro.getPrecio());
        System.out.println("_____________________________________________");
                break;
        
             case 2:
           
        System.out.println("_____________________________________________");
        System.out.println("-ATRIBUTOS DE LA MOTO");
        System.out.println("_____________________________________________");
        System.out.println("-Marca: "+miMoto.getMarca());
        System.out.println("-Modelo: "+miMoto.getModelo());
        System.out.println("-Cilindraje: "+miMoto.getCilindraje());
        System.out.println("-Estado: "+miMoto.getEstado());
        System.out.println("-Motor: "+miMoto.getMotor());
        System.out.println("-Año: "+miMoto.getAñoF());
        System.out.println("-Pais de Producción: "+miMoto.getPais_de_produccion());
        System.out.println("-Color: "+miMoto.getColor());
        System.out.println("-Precio: $"+miMoto.getPrecio());
                 System.out.println(miMoto.Color);
        System.out.println("_____________________________________________");
                break;
        
             case 3:
                 
        System.out.println("_____________________________________________");
        System.out.println("-ATRIBUTOS DEL MICROBUS");
        System.out.println("_____________________________________________");
        System.out.println("-Marca : "+miMicrobus.Marca);
        System.out.println("-Modelo: "+miMicrobus.Modelo);
        System.out.println("- Motor: "+miMicrobus.Motor);
        System.out.println("-Año: "+miMicrobus.getAño());
        System.out.println("-Numero de asientos: "+miMicrobus.getnAsientos());
        System.out.println("-Numero de pisos: "+miMicrobus.getnPisos());
        System.out.println("-Pais de Produccion: "+miMicrobus.getPais_de_produccion());
        System.out.println("-Color: "+miMicrobus.getColor());
        System.out.println("-Precio: $"+miMicrobus.getPrecio());
        System.out.println("_____________________________________________");
                break;
                
             case 4:
                 
        System.out.println("_____________________________________________");
        System.out.println("-ATRIBUTOS DE LA BICICLETA");
        System.out.println("_____________________________________________");
        System.out.println("-Marca: "+miBicicleta.getMarca());
        System.out.println("-Modelo: "+miBicicleta.getModelo());
        System.out.println("-Tipo: "+miBicicleta.getTipo());
        System.out.println("-Material del Marco: "+miBicicleta.getMaterialMarco());
        System.out.println("-Peso Máximo: "+miBicicleta.getPesoMaximo()+"Kg");
        System.out.println("-País de Producción: "+miBicicleta.getPais_de_produccion());
        System.out.println("-Color: "+miBicicleta.getColor());
        System.out.println("-Precio: $"+miBicicleta.getPrecio());
        System.out.println("_____________________________________________");
                break;
             default:
                 System.out.println("Ingrese un valor dentro del intervalo correspondido (1/2/3/4/5)");
        }
      }
        sc.close();
    }     
    
    //POLIMORFISMO:
    //SOBRECARGA: los metodos que se utilizan especialmente para ejecutar actividades especificas. ejemplo: calcularSalario();
    //SOBRESCRITURA:
    
    
    
    
    
    
  }