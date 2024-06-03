
package polimorfismo;

public class main {
    
    public static void main(String[] args) {
        persona persona1 = new persona("Adrian", "Castro", 28);
        persona1.mostrarInfo();
        persona t1 = new trabajador(1000000,"Flor","Palacios", 25);        
        t1.mostrarInfo();

     }
}
