package metodos;

public class empleado2 extends plantillaTrabajador{
    private String cargo;

    public empleado2(String cargo, int numEmpleado, String añoMesdIngreso, int añoNacimiento, int telefono, int numSeguridad, String nombre, String apellidos, String email) {
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
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Numero de Empleado: "+numEmpleado);
        System.out.println("Cargo: "+cargo);
        System.out.println("Numero de Seguridad: "+numSeguridad);
        System.out.println("Fecha de Ingreso: "+añoMesdIngreso);
        System.out.println("Teléfono: "+telefono);
        System.out.println("Email: "+email);
        System.out.println("=========================================");
    
    }
}
