class Robo{
  String nome;
  int x;
  int y;

  Robo(String nome, int x, int y){
    nome = "";
    x = 0;
    y = 0;
  }

  int andarDireita(){
    return x++;
  }

  int andarEsquerda(){
    return x--;
  }

  int andarCima(){
    return y++;
  }
  
  int andarBaixo(){
    return y--;
  }

  String posicao(){
    return x+"-"+y;
  }

  String nomeRobo(){
    return nome;
  }
}