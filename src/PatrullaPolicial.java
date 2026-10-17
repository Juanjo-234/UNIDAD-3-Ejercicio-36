public class PatrullaPolicial extends  VehiculoEmergencia{
    private int cantidadEfectivos;
    private String blindaje;
    private String patente;

    public PatrullaPolicial(String patente, String estacionBase, boolean enServicio, int cantidadEfectivos, String blindaje){
        super(patente, estacionBase, enServicio);
        this.cantidadEfectivos = cantidadEfectivos;
        this.blindaje = blindaje;
    }


    @Override
    public void activarSirenas() {
        System.out.println("MOVIL POLICIAL: " + patente + "¡Operativo Táctico en curso! Activando barra de luces estroboscópica.");
    }

    @Override
    public String obtenerDetalles() {
        return "[Patrulla Policial] " + super.obtenerDetalles() +
                " | Efectivos: " + this.cantidadEfectivos +
                " | Blindaje: " + this.blindaje;
    }
}
