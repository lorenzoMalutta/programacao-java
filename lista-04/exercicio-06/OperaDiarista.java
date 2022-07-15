public class OperaDiarista extends Funcionario{
    private Double salarioDia;
    private Integer diasTrabalhados;

    public OperaDiarista(Integer diasTrabalhados, Double salarioDia){
        this.salarioDia = salarioDia;
        this.diasTrabalhados = diasTrabalhados;
    }

    public void setSalarioDia(Double salarioDia){
        this.salarioDia = salarioDia;
    }

    public Double getSalarioDia(){
        return salarioDia;
    }

    public void setDiasTrabalhados(Integer diasTrabalhados){
        this.diasTrabalhados = diasTrabalhados;
    }

    public Integer getDiasTrabalhados(){
        return diasTrabalhados;
    }

    public Double calcularSalario(){
        return salarioDia*diasTrabalhados;
    }
}