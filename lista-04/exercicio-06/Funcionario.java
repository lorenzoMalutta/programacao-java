public abstract class Funcionario{
    private String nome;
    private Integer codigo;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }

    public Integer getCodigo(){
        return codigo;
    }

    public abstract Double calcularSalario();
    
}