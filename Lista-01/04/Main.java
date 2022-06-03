class Main {
  public static void main(String[] args) {
    Robo r1 = new Robo("",0,0);
    r1.nome = "Robo";
    r1.andarCima();
    r1.andarDireita();
    System.out.println(r1.nomeRobo()+": "+r1.posicao());
  }
}