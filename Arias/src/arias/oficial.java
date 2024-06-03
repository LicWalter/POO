package arias;

public class oficial extends plantillaE{
    private String cargo;

    public oficial(String cargo, String nombre, String apellido, String id, int edad) {
        super(nombre, apellido, id, edad);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    public void mostrarDatos(){
        System.out.println("==============================");
        System.out.println("         EMPLEADO 1           ");
        System.out.println("==============================");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Cargo: "+cargo);
        System.out.println("ID: "+id);
        System.out.println("Edad: "+edad);
        System.out.println("==============================");
    
    
    
    }
    
}
