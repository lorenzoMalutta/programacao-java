class Data{
  int dia, mes, ano;
  char separador;

  Data() {
    dia = 1;
    mes = 1;
    ano = 1;
  }

  Data(int ano){
      ano = 2022;
  }

  Data(int ano, int mes, int dia){
    ano = 2022;
    mes = 06;
    dia = 02;
  }

  void formarData(){
    if(this.separador == '/'){
      System.out.printf("%d/%d/%d", dia, mes, ano);  
    }
    if(this.separador == '-'){
      System.out.printf("%d-%d-%d", dia, mes, ano);
    }
  }
}