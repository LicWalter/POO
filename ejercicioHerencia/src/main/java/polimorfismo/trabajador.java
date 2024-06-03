

package polimorfismo;

public class trabajador extends persona {

    private double salario;

    public trabajador(double salario, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.salario = salario;
    }
    
    @Override
    public void mostrarInfo(){         
        super.mostrarInfo();
        System.out.println("Salario: "+salario);
    
    
    
    }
    
    
    
    
}
