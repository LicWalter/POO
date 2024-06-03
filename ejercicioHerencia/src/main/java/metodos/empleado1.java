
package metodos;

public class empleado1 extends plantillaTrabajador {
    
   private String cargo;    

    public empleado1(String cargo, int numEmpleado, String añoMesdIngreso, int añoNacimiento, int telefono, int numSeguridad, String nombre, String apellidos, String email) {
        super(numEmpleado, añoMesdIngreso, añoNacimiento, telefono, numSeguridad, nombre, apellidos, email);
        this.cargo = cargo;
    }

    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void mostrarDatos(){
        super.mostrarDatos();
    

        
        
    }
    
}