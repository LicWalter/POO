
package arias;

public class tecnico extends plantillaE{

    private int añosExpe;
    private String especializacion;
    private String cargo;

    public tecnico(int añosExpe, String especializacion, String cargo, String nombre, String apellido, String id, int edad) {
        super(nombre, apellido, id, edad);
        this.añosExpe = añosExpe;
        this.especializacion = especializacion;
        this.cargo = cargo;
    }

    public int getAñosExpe() {
        return añosExpe;
    }

    public void setAñosExpe(int añosExpe) {
        this.añosExpe = añosExpe;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
            public void mostrarDatos(){
        System.out.println("==============================");
        System.out.println("         EMPLEADO 3           ");
        System.out.println("==============================");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Cargo: "+cargo);
        System.out.println("ID: "+id);
        System.out.println("Edad: "+edad);
        System.out.println("años de experiencia:"+ añosExpe);
        System.out.println("especializacion"+especializacion);
        System.out.println("==============================");
    
    
    
    }
    
        
    }


    
    
    
