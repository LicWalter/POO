package metodos;

public class empleado3 extends plantillaTrabajador {
    private String cargo;

    public empleado3(String cargo, int numEmpleado, String añoMesdIngreso, int añoNacimiento, int telefono, int numSeguridad, String nombre, String apellidos, String email) {
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
