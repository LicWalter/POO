
package metodos;
public class Main  {



    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("ASISTENCIA DE LA 5ta REUNION ANUAL");
        
        
        
        
        
        
    
        
        
        
         /*empleado1 empleado1 = new empleado1("Contador", 11110, "02 Febrero 2020", 1999, 310245669, 72791002, "Javier", "Diaz Hurtado","javierdiaz@yopmail.com");
        empleado1.mostrarDatos();
         
        empleado2 empleado2 = new empleado2("Jefe de Logística", 11111, "15 Octubre 2015", 1983, 316289334, 72791001, "Jhanny Andrés", "López Gonzáles", "RALopez33@yopmail.com");
        empleado2.mostrarDatos();
        
        empleado3 empleado3 = new empleado3("Jefe de Recursos Humanos", 11112, "17 Abril 2018", 1990, 311097535, 72791003, "Ivan Manuel", "Hernandez Sanchez", "Hernandezbusiness@yopmail.com");
        empleado3.mostrarDatos();
    
        empleado4 empleado4 = new empleado4("Ingeniero Industrial", 11113, "22 Enero 2018", 1989, 312873924, 72791004, "Juan Diego", "Riascos Guevara", "Diego1989J@yopmail.com");
        empleado4.mostrarDatos();    */    
        
        
        
        
        
        
        
        
        /*plantillaTrabajador empleadouno = new plantillaTrabajador ("10,000,000","Administrador", 11113, "22 Enero 2018", 1989, 31209876, 72791001, "Walter", "Estupiñan", "WAKTER030@GMAIL.COM ");
        empleadouno.mostrarDatos();
        
        plantillaTrabajador empleadodos = new plantillaTrabajador("10,000,000","Contador", 11114, "21 Febrero 2013", 1983, 32893003, 72791002, "Gabriel", "Castro", "castro@GMAIL.COM ");
        empleadodos.mostrarDatos(); */
        
       
       
       
       
       
       
       
       
        plantillaTrabajador[] misEmpleados = new plantillaTrabajador[5];
        
        misEmpleados[0] = new plantillaTrabajador("10,000,000","Administrador", 11113, "22 Enero 2018", 1989, 31209876, 72791001, "Walter", "Estupiñan", "WAKTER030@GMAIL.COM ");
        misEmpleados[1] = new plantillaTrabajador("10,000,000","Contador", 11114, "21 Febrero 2013", 1983, 32893003, 72791002, "Gabriel", "Castro", "castro@GMAIL.COM ");
        misEmpleados[2] = new plantillaTrabajador("10,000,000", "Técnico", 11111, "15 Octubre 2015", 1983, 316289334, 72791001, "Jhanny Andrés", "López Gonzáles", "RALopez33@yopmail.com");
        misEmpleados[3] = new plantillaTrabajador("10,000,000", "Ingeniero Industrial", 11113, "22 Enero 2018", 1989, 312873924, 72791004, "Juan Diego", "Riascos Guevara", "Diego1989J@yopmail.com");
        misEmpleados[4] = new plantillaTrabajador("10,000,000", "Ingeniero en Sistemas", 11115, "2 Enero 2010", 1979, 31287474, 72791005,"Juan", "Riascos", "Riascos989J@yopmail.com");
        
        for (int i = 0; i < 5; i++) {
            misEmpleados[i].mostrarDatos();
        }
    
      
       
       
        
       
       
       
       
    }
    
}
