package ex6;

public class CaixaBanco extends Funcionario {

    private int horario;

    public CaixaBanco(String nome, int matricula) {
        super(nome, matricula);
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Caixa do Banco" +
                "\nNome: " + nome +
                "\nTelefone: " + telefone +
                "\nMatricula: " + matricula +
                "\nSalario: R$ " + String.format("%.2f", salario) +
                "\nHorario: " + horario + "h";
    }
}