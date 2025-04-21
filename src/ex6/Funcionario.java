package ex6;

public class Funcionario extends Pessoa {

    protected int matricula;
    protected double salario;

    public Funcionario(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentoSalario(double porcentagem) {
        salario = salario + salario * (porcentagem / 100);
        return salario;
    }

    public double salarioAnual() {
        return salario * 12;
    }
}
