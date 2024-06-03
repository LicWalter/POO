package speedstrom;

public class carro1 extends plantillaCarro {
    
    private String nPuerta;

    public carro1(String nPuerta) {
        this.nPuerta = nPuerta;
    }

    public carro1(String nPuerta, String marca, String pintura, String aceleracion, String freno) {
        super(marca, pintura, aceleracion, freno);
        this.nPuerta = nPuerta;
    }

    public String getnPuerta() {
        return nPuerta;
    }

    public void setnPuerta(String nPuerta) {
        this.nPuerta = nPuerta;
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
    super.mostrarDatos();

    }
    public void nombreCarros(){
    super.nombreCarros();
    
    }
}