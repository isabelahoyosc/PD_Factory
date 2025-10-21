public class Barco implements MediosTransporte{
  
      private final String matricula;

    public Barco(String matricula) {
        this.matricula = matricula;
    }
  
    @Override
    public void entregar(String destino) {
        System.out.println("El barco con matricula: "  + matricula + ",está entregando por mar en: " + destino);
    }

    @Override
    public String getIdentificador() {
        return matricula;
    }

}

