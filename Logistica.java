public abstract class Logistica {

   
    public abstract MediosTransporte crearTransporte(String identificador);

   
    public void planEntrega(String destino, String identificador) {
        MediosTransporte transporte = crearTransporte(identificador);
        transporte.entregar(destino);
    }
}
