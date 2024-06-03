package speedstrom;
import java.util.Scanner;

// Clase Carro que representa a cada carro en el juego
class Carr {
    private String nombre;
    private int posicion;

    public Carr(String nombre) {
        this.nombre = nombre;
        this.posicion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    // Método para mover el carro hacia adelante
    public void acelerar() {
        posicion += (int) (Math.random() * 6) + 1;  // Movimiento aleatorio entre 1 y 6
        
    }
}

// Clase JuegoCarreras que representa el juego
public class JuegoCarreras {
    private Carr carro1;
    private Carr carro2;
    private int meta;

    public JuegoCarreras(String nombreCarro1, String nombreCarro2, int meta) {
        carro1 = new Carr(nombreCarro1);
        carro2 = new Carr(nombreCarro2);
        this.meta = meta;
    }

    // Método para mostrar el estado actual de la carrera
    public void mostrarEstado() throws InterruptedException {
        
        
        System.out.println(carro1.getNombre() + ": " + carro1.getPosicion());
        System.out.println(carro2.getNombre() + ": " + carro2.getPosicion());
        System.out.println("-----");
        Thread.sleep(800);
    }

    // Método para verificar si hay un ganador
    public boolean hayGanador() {
        return carro1.getPosicion() >= meta || carro2.getPosicion() >= meta;
    }

    // Método para determinar al ganador
    public String obtenerGanador() {
        if (carro1.getPosicion() >= meta && carro2.getPosicion() >= meta) {
            return "Es un empate";
        } else if (carro1.getPosicion() >= meta) {
            return carro1.getNombre() + " ha ganado la carrera";
        } else {
            return carro2.getNombre() + " ha ganado la carrera";
        }
    }

    // Método para ejecutar un turno de la carrera
    public void turno() {
        carro1.acelerar();
        carro2.acelerar();
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Juego de Carreras!");
        System.out.print("Ingresa el nombre del primer carro: ");
        String nombreCarro1 = scanner.nextLine();

        System.out.print("Ingresa el nombre del segundo carro: ");
        String nombreCarro2 = scanner.nextLine();

        System.out.print("Ingresa la distancia de la carrera (meta): ");
        int meta = scanner.nextInt();

        JuegoCarreras juego = new JuegoCarreras(nombreCarro1, nombreCarro2, meta);
        System.out.println("-----");
        System.out.println("Empieza en...");
        System.out.println("-----");
         Thread.sleep(800);
        System.out.println("3");
        System.out.println("-----");
        Thread.sleep(800);
        System.out.println("2");
        System.out.println("-----");
        Thread.sleep(800);
        System.out.println("1");
        System.out.println("-----");
        Thread.sleep(200);
        System.out.println("YA!");
        System.out.println("-----");
        Thread.sleep(800);
        
        while (!juego.hayGanador()) {
            juego.turno();
            
            juego.mostrarEstado();
        }

        System.out.println(juego.obtenerGanador());
    }
}