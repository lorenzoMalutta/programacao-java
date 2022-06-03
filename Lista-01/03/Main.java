class Main {
  public static void main(String[] args) {
    Funcionario f1 = new Funcionario();
    f1.valorHora = 10;
    f1.horaTrabalhada = 6.5;
    System.out.println(f1.calcular());
  }
}