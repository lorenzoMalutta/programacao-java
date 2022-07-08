public class Circulo{
  private Double raio;
  private Integer ponto;
  private Double centro;
  
  public Circulo(){
    raio = 1.00;
    centro = 0.0;
  }

  public Circulo(Double raio){
    this.raio = raio;
  }

  public Double getRaio() {
    return raio;
  }

  public void setRaio(Double raio) {
    this.raio = raio;
  }

  public Double getCentro() {
    return centro;
  }

  public void setCentro(Double centro) {
    this.centro = centro;
  }

  public Integer getPonto() {
    return ponto;
  }

  public void setPonto(Integer ponto) {
    this.ponto = ponto;
  }
 
}