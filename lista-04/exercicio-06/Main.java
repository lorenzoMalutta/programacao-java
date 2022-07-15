class Main {
  public static void main(String[] args) {    
    Funcionario[] f = new Funcionario[2];
    
    f[0] = new Gerente(3000);
    f[1] = new OperaDiarista(21, 60);

    System.out.println(""+f[0].calcularSalario());

  }
}