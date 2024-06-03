package arias;
public class operario extends plantillaE {
    
    private String cargo;
    private int añosExpe;

    public operario(String cargo, int añosExpe, String nombre, String apellido, String id, int edad) {
        super(nombre, apellido, id, edad);
        this.cargo = cargo;
        this.añosExpe = añosExpe;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAñosExpe() {
        return añosExpe;
    }

    public void setAñosExpe(int añosExpe) {
        this.añosExpe = añosExpe;
    }
    
        public void mostrarDatos(){
        System.out.println("==============================");
        System.out.println("         EMPLEADO 2           ");
        System.out.println("==============================");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Cargo: "+cargo);
        System.out.println("ID: "+id);
        System.out.println("Edad: "+edad);
        System.out.println("==============================");
    
    
    
    }
}
