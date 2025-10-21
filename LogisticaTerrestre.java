public class LogisticaTerrestre extends Logistica {

     @Override
    public MediosTransporte crearTransporte(String identificador) {
        return new Barco(identificador);
    }
}