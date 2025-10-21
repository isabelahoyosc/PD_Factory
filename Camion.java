public class Camion implements MediosTransporte{
      
    private final String placa;

    public Camion(String placa) {
        this.placa = placa;
    }
   
    @Override
    public void entregar(String destino) {
        System.out.println("El camión de placas:"  + placa + ",está entregando por tierra en: " + destino);;
    }
     
    @Override
    public String getIdentificador() {
        return placa;
    }
}
