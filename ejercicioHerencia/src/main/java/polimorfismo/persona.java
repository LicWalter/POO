
package polimorfismo;

public class persona {
    
    private String nombre;
    private String apellido;
    private int edad;

    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("=============");
        System.out.println("Nombre: "+nombre+
        "\n"+"Apellido: "+ apellido+
                "\n"+"Edad: "+edad);
 
    }

} 
