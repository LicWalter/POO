package practica;
import java.time.LocalTime;
    public class reloj_digital {
        public static void main(String[] args) throws InterruptedException {
            
        for(int hora = 00; hora < 24; hora++){
        for(int minutos = 00; minutos < 60; minutos++){
        for(int segundos = 00; segundos < 60; segundos++){

        LocalTime tiempo = LocalTime.of(hora, minutos, segundos);
        
            System.out.println(tiempo);
            
            //ralentiza la velocidad de ejecucion del algoritmo
            Thread.sleep(1000);
  }       
 }
}
}
    }
