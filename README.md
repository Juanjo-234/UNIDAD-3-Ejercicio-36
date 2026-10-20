Este programa está diseñado para modelar un sistema de coordinación y despacho de vehículos de emergencia aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización mediante la palabra clave super y polimorfismo a través de la sobrescritura de métodos (@Override) para simular la activación de alertas y protocolos específicos según la fuerza operativa.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base VehiculoEmergencia: Concentra los atributos comunes a cualquier unidad de respuesta rápida (patente, estacionBase y enServicio), junto con un constructor centralizado y un método base de estado operativo.

Desarrolla las clases hijas (Ambulancia, CamionBomberos y PatrullaPolicial): Extienden de VehiculoEmergencia incorporando sus atributos particulares y especializados (stock de oxígeno y médicos a bordo para el soporte sanitario; litros de agua y longitud de escala para el combate de incendios; cantidad de efectivos y nivel de blindaje para las fuerzas de seguridad).

Sobrescribe el método de activación de alerta: Cada subclase implementa su propia versión del protocolo de sirenas, balizas y despliegue táctico correspondiente a su fuerza.

Ejecuta la prueba en el main: Crea una lista polimórfica de unidades de emergencia, simula despachos operativos ante distintos incidentes y registra las operaciones detalladas por consola.
