//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<VehiculoEmergencia> flotaEmergencia = new ArrayList<>();

    flotaEmergencia.add(new Ambulancia("AMB-304", "Hospital Central", true, 3000, 2));
    flotaEmergencia.add(new CamionBomberos("BOM-102", "Cuartel Norte", true, 12000.0, 32.5));
    flotaEmergencia.add(new PatrullaPolicial("PAT-511", "Comisaría 4ta", true, 2, "Nivel N3 Antibalas reforzado"));

    System.out.println("======================================================================");
    System.out.println("          SISTEMA DE DESPACHO Y MONITOREO DE EMERGENCIAS              ");
    System.out.println("======================================================================\n");


    for (VehiculoEmergencia vehiculo : flotaEmergencia) {
        System.out.println(vehiculo.obtenerDetalles());
        vehiculo.activarSirenas();
        System.out.println("----------------------------------------------------------------------");
    }
}
