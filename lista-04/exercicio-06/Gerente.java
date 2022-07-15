public class Gerente{
    private Double salarioMensal;
    
    public Gerente(Double salarioMensal){
        this.salarioMensal = salarioMensal;
    }

    public Double calcularSalario(){
        return salarioMensal*1.1;
    }


}