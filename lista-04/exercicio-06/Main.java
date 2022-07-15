class Main {
  public static void main(String[] args) {    
    Funcionario[] f = new Funcionario[2];
    f[0] = new Gerente(300.000);
    f[1] = new OperaDiarista(21, 60.000);

    f[0].setCodigo(0);
    f[0].setNome("cleber");

    f[1].setCodigo(1);
    f[1].setNome("filé");

    System.out.println(""+f[0].calcularSalario());
    System.out.println(""+f[1].calcularSalario());
    
  }
}