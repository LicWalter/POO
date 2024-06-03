package metodos;
public class empleado4 extends plantillaTrabajador {
    private String cargo;

    public empleado4(String cargo, String salario, String cargo, int numEmpleado, String añoMesdIngreso, int añoNacimiento, int telefono, int numSeguridad, String nombre, String apellidos, String email) {
        super(salario, cargo, numEmpleado, añoMesdIngreso, añoNacimiento, telefono, numSeguridad, nombre, apellidos, email);
        this.cargo = cargo;
    }


   
    
    
    public void mostrarDatos(){
        super.mostrarDatos();
    }
}
