class Caixa{
  double largura, altura, comprimento;
  String nome;

  Caixa(){
    largura = 0;
    altura = 0;
    comprimento = 0;
  }

  Caixa(double x, double y, double z){
    largura = x;
    altura = y;
    comprimento = z;
  }

  Caixa(String x){
    nome = x;
  }
  
  double calcularVolume(){
    return largura*altura*comprimento;
  }

  String frase(){
    return nome;
  }
}