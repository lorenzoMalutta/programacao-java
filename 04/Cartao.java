public class Cartao{
  private Integer unidade;
  
  Cartao(){
    unidade = 0;
  }

    Cartao(Integer unidade){
    this.unidade = unidade;
  }

  public Integer getUnidade(){
    return unidade;
  }

  public void setUnidade(Integer unidade){
    this.unidade = unidade;
  }

  public Integer comprarCafe(Integer unidade){
    return this.unidade--;
  }

  public Integer recarregar(Integer unidade){
    return unidade++;
  }
}