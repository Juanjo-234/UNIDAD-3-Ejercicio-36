public class VehiculoEmergencia {
    private String patente;
    private String estacionBase;
    private boolean enServicio;


    public VehiculoEmergencia(String patente, String estacionBase, boolean enServicio){
        this.patente = patente;
        this.estacionBase = estacionBase;
        this.enServicio = enServicio;
    }

    public void activarSirenas(){
        System.out.println("Vehiculo " + this.patente + ": activado sirenas.");
    }

    public String obtenerDetalles(){
        String estado = this.enServicio? "En servicio " : "Fuera de servicio";
        return "Patente: " + this.patente + " | Base: " + this.estacionBase + " | Estado: " + estado;
    }
}
