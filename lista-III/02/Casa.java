public class Casa{
  private Integer matricula;
  private String endereco;
  private Double valor;
  private Proprietario proprietario;

  Casa(){
    matricula = 0;
    endereco = "";
    valor = 0.00;
    proprietario = new Proprietario();
  }

  Casa(Integer matricula, String endereco, Double valor, Proprietario proprietario){
    this.matricula = matricula;
    this.endereco = endereco;
    this.valor = valor;
    this.proprietario = proprietario;
  }
}