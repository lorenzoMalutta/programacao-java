public class Gerente extends Funcionario{
    private Double salarioMensal;
    
    public Gerente(Double salarioMensal){
        this.salarioMensal = salarioMensal;
    }

    public Double calcularSalario(){
        return salarioMensal*1.1;
    }


}