public class LogisticaMaritima extends  Logistica{

     @Override
    public MediosTransporte crearTransporte(String identificador) {
        return new Camion(identificador);
    }
}