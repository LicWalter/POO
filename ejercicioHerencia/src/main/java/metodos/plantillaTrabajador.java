package metodos;

    public class plantillaTrabajador{
    
        int numEmpleado, añoNacimiento,telefono,numSeguridad;
        String nombre, apellidos, email, añoMesdIngreso, cargo, salario;

    public plantillaTrabajador(String salario, String cargo, int numEmpleado, String añoMesdIngreso, int añoNacimiento, int telefono, int numSeguridad, String nombre, String apellidos, String email) {
        this.numEmpleado = numEmpleado;
        this.añoMesdIngreso = añoMesdIngreso;
        this.añoNacimiento = añoNacimiento;
        this.telefono = telefono;
        this.numSeguridad = numSeguridad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.cargo = cargo;
        this.salario=salario;
        
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    
    
    public String getCargo(){
        return cargo;
    
    }
    
    public void setCargo(String cargo){
        this.cargo=cargo;
    
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getAñoMesdIngreso() {
        return añoMesdIngreso;
    }

    public void setAñoMesdIngreso(String añoMesdIngreso) {
        this.añoMesdIngreso = añoMesdIngreso;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNumSeguridad() {
        return numSeguridad;
    }

    public void setNumSeguridad(int numSeguridad) {
        this.numSeguridad = numSeguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        System.out.println("Salario: $"+salario);
        System.out.println("=========================================");
        
   
    }  
}