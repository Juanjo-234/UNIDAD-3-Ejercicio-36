public class CamionBomberos extends VehiculoEmergencia{
    private double capacidadAguaLitros;
    private double longitudEscalaMetros;
    private String patente;

    public CamionBomberos(String patente, String estacionBase, boolean enServicio, double capacidadAguaLitros, double longitudEscalaMetros){
    super(patente, estacionBase, enServicio);
    this.capacidadAguaLitros = capacidadAguaLitros;
    this.longitudEscalaMetros = longitudEscalaMetros;
}

    @Override
    public void activarSirenas() {
        System.out.println("CAMIÓN DE BOMBEROS: " + patente + "Alarma de incendio activada. Activando sirenas y dirigiendose a la zona del incidente.\"");
    }

    @Override
    public String obtenerDetalles() {
        return "[Camión de Bomberos] " + super.obtenerDetalles() +
                " | Agua: " + this.capacidadAguaLitros + " L" +
                " | Escala: " + this.longitudEscalaMetros + " m";
    }
}
