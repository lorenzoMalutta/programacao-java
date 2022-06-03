class Lambda{
  boolean acesa;

  Lambda(){
    acesa = false;
  }
  
  void acender(){
    acesa = true;
  }
  
  void apagador(){
    acesa = false;
  }

  String mostrarEstado(){
    if(acesa == false){
      return ("acesa");
    }
    else{
      return ("Apagada");
    }
  }
}