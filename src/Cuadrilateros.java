public class Cuadrilateros extends FigurasGeometricas{
    Double largo;
    Double ancho;
    public Cuadrilateros(Double largo, Double ancho) {}
    public Cuadrilateros() {}
    public Double area(){
        return largo * ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }
}
