class Main {
  public static void main(String[] args) {
    Caixa c1 = new Caixa();
    System.out.println(c1.calcularVolume());

    Caixa c2 = new Caixa(2,2,2);
    System.out.println(c2.calcularVolume());

    Caixa c3 = new Caixa("A caixa é um cubo");
    System.out.println(c3.frase());
  }
}