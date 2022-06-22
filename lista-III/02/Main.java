class Main {
  public static void main(String[] args) {
    Proprietario p1 = new Proprietario(188545, "Ronaldo");
    Casa c1 = new Casa(4324, "Sao paulo", 156.445, p1);
    System.out.println(p1.getNome());
  }
}