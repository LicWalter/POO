package speedstrom;

public class plantillaCarro {
    
    String marca, pintura, aceleracion, freno;      

    public plantillaCarro() {
    }
  
    
    public plantillaCarro(String marca, String pintura, String aceleracion, String freno) {
        this.marca = marca;
        this.pintura = pintura;
        this.aceleracion = aceleracion;
        this.freno = freno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPintura() {
        return pintura;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }

    public String getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(String aceleracion) {
        this.aceleracion = aceleracion;
    }

    public String getFreno() {
        return freno;
    }

    public void setFreno(String freno) {
        this.freno = freno;
    }
    public void mostrarDatos(){
        System.out.println("=======================");
        System.out.println("Marca: "+getMarca());
        System.out.println("Color: "+getPintura() );
        System.out.println("Aceleración: "+getAceleracion());
        System.out.println("Frenos: "+getFreno());
        System.out.println("=======================");
}
    
    public void nombreCarros(){
        
        System.out.println(getMarca());

    }

    public void metodo1(){

        System.out.println("prueba");
       }
        
}