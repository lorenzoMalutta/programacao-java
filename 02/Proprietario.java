public class Proprietario{
  private Integer cpf;
  private String nome;

  Proprietario(){
    cpf = 0;
    nome = "";
  }

  Proprietario(Integer cpf, String nome){
    this.cpf = cpf;
    this.nome = nome;
  }
  
  public Integer getCpf(){
    return cpf;
  }

  public void setCpf(Integer cpf){
    this.cpf = cpf;  
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }
}