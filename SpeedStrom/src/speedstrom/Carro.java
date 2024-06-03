package speedstrom;
public class Carro {
    private String nombre;
    private int posicion;

    public Carro(String nombre) {
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
 class gameCarreras {
    private Carro carro1;
    private Carro carro2;
    private int meta;

    public gameCarreras(String nombreCarro1, String nombreCarro2, int meta) {
        carro1 = new Carro(nombreCarro1);
        carro2 = new Carro(nombreCarro2);
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
}    