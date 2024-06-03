package poo;

public class cliente {
    public String nombre;
    public String apellido;
    public String email;
    public String telefono;

    public String getNombre() {
        return "hola "+nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
 
    public String mostrarInfo(){
    
        return "Confirmar los datos ingresados: Nombre"
                + ":"+nombre+"/ Apellido: "+apellido
                + "/ Email: "+email+ "/ Telefono: "+telefono;
    
    
    }
    
    
    public String nombreCompleto(){
        
        
        
        return 
                nombre + " " + apellido;
    
    }

    } 
