package ex6;

public class Cliente extends Pessoa {

    private int idade;
    private String cpf;
    private char statusAtual;
    private char[] status = {'A', 'I'};

    public Cliente(String nome, String telefone, int idade, String cpf) {
        super(nome, telefone);
        this.idade = idade;
        this.cpf = cpf;
        this.statusAtual = status[0];
    }

    public boolean desativar(Cliente cliente) {
        if (cliente.statusAtual == status[0]) {
            cliente.statusAtual = status[1];
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (statusAtual == 'A') {
            builder.append(nome + " - Tel:" + telefone + " - idade: " + idade + " anos - cpf: " + cpf + " - ativo");
        } else {
            builder.append(nome + " - Tel:" + telefone + " - idade: " + idade + " anos - cpf: " + cpf + " - inativo");
        }
        return builder.toString();
    }
}
