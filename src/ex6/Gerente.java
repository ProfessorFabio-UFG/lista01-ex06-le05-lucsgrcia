package ex6;

public class Gerente extends Funcionario {

    private double bonificacao;
    private String tipo;

    private enum Tipos {
        PF, PJ;
    }

    public Gerente(String nome, int matricula) {
        super(nome, matricula);
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
        salario += bonificacao;
    }

    public void tipoGerente(String tipo) {
        if (tipo.equals("PF")) {
            this.tipo = Tipos.PF.toString();
        } else if (tipo.equals("PJ")) {
            this.tipo = Tipos.PJ.toString();
        }
    }

    @Override
    public String toString() {
        return "Gerente " + nome +
                "\nTelefone: " + telefone +
                "\nMatricula: " + matricula +
                "\nSalario: R$ " + String.format("%.2f", salario) +
                "\nTipo: " + tipo +
                "\nBonificacao: R$ " + String.format("%.2f", bonificacao);
    }
}
