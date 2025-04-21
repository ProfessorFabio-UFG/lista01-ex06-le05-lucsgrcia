package ex6;

public class Cadastro {
    public static void main(String[] args) {

        CaixaBanco cb = new CaixaBanco("Claudia", 2004);
        cb.setTelefone("9137-9821");
        cb.setSalario(3000);
        cb.setHorario(10);
        cb.aumentoSalario(10);
        System.out.println(cb);
        System.out.println("Salario Anual: R$ " + String.format("%.2f", cb.salarioAnual()));
        System.out.println();

        Gerente gerente = new Gerente("Lucio", 3875);
        gerente.setTelefone("9812-5533");
        gerente.setSalario(6000);
        gerente.tipoGerente("PJ");
        gerente.setBonificacao(500);
        gerente.aumentoSalario(23);
        System.out.println(gerente);
        System.out.println("Salario Anual: R$ " + String.format("%.2f", gerente.salarioAnual()));
        System.out.println();

        Cliente c1 = new Cliente("Maria de Souza", "8171-9832", 32, "652.187.128-81");
        Cliente c2 = new Cliente("José Ricardo", "8534-9988", 55, "893.109.182-12");
        Cliente c3 = new Cliente("Carlos Eduardo", "9711-3822", 26, "024.644.349-42");

        c2.desativar(c2);

        System.out.println(c1);
        System.out.println();

        System.out.println(c2);
        System.out.println();

        System.out.println(c3);
        System.out.println();
    }
}
