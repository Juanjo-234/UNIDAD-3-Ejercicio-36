public class Ambulancia extends  VehiculoEmergencia{
    private int stockOxigenoLitros;
    private int medicosABordo;
    private String patente;

    public Ambulancia(String patente, String estacionBase, boolean enServicio, int stockOxigenoLitros, int medicosABordo){
        super(patente, estacionBase, enServicio);
        this.stockOxigenoLitros = stockOxigenoLitros;
        this.medicosABordo = medicosABordo;
    }


    @Override
    public void activarSirenas() {
        System.out.println("AMBULANCIA: " + patente + "¡Código Rojo sanitario! Activando sirena bitono de emergencia médica, luces intermitentes blancas y despejando carril de urgencias para traslado crítico.\"");
    }

    @Override
    public String obtenerDetalles() {
        return "[Ambulancia] " + super.obtenerDetalles() +
                " | Oxígeno: " + this.stockOxigenoLitros + " L" +
                " | Médicos a bordo: " + this.medicosABordo;
    }
}
