//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Logistica zonaTransporteUno = new LogisticaTerrestre();
        zonaTransporteUno.planEntrega("Medellín", "STP-456");

        Logistica zonaTransporteDos = new LogisticaMaritima();
        zonaTransporteDos.planEntrega("Miami", "IMO-9321002");

    }
}

