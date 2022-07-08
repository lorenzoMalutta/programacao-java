public class Pixel extends Ponto{
   private String cor;

  public Pixel(){
    super();
    cor = "preta";
  }

  public Pixel(Integer x, Integer y){
    super(x, y);
    cor = "preta";
  }

  public Pixel(Integer x, Integer y, String cor){
    super(x, y);
    this.cor = cor;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }
}