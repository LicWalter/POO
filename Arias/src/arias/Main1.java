 package arias;

public class Main1 {

    public static void main(String[] args) {
        
        oficial empleado = new oficial("Oficial", "Luis", "Arias","1230001", 28);
        empleado.mostrarDatos();
        
        operario empleado1 = new operario ("operario",7,"Rodrigo","rodriguez","12300022",52);
        empleado1.mostrarDatos();
        
        tecnico empleado2 = new tecnico (3, " mantenimiento", "tecnico", "Walter","Estupiñan", "1239402",25 );
        empleado2.mostrarDatos();
     }
}
