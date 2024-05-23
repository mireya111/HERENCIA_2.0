public class FigurasGeometricas {
    String nombre;
    int nLados;
    public FigurasGeometricas(){}
    public FigurasGeometricas(String nombre, int nLados) {}
    public FigurasGeometricas (int nLados){}
    public FigurasGeometricas (String nombre){}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }
    //Ejemplo cambio
}
