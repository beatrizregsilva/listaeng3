import java.util.Date;

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;
    private boolean disponivel;

    // Métodos getters e setters
    // ...

    public void registrarDevolucao(double quilometragemAtual, boolean danos) {
        // Registrar a devolução do carro, atualizando a quilometragem e a condição
        this.quilometragem = quilometragemAtual;
        this.disponivel = true;

        // Verificar e registrar danos, se houver
        if (danos) {
            // Registrar os danos no carro
        }
    }
}

class Cliente {
    private String nome;
    private int ID;
    private String dadosContato;

    // Métodos getters e setters
    // ...

    public void alugarCarro(Carro carro, Date dataInicio, int duracao, String finalidade, String roteiro, double valorCaucao) {
        // Processo de aluguel do carro pelo cliente
    }

    public void devolverCarro(Carro carro, double quilometragemAtual, boolean danos) {
        // Processo de devolução do carro pelo cliente
        carro.registrarDevolucao(quilometragemAtual, danos);
    }
}

class Empresa {
    private Carro[] frotaDeCarros;
    private Cliente[] clientes;

    // Métodos para gerenciar a frota de carros e os clientes
    // ...
}