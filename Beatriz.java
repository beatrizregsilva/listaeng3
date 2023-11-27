/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beatriz;

import java.util.Date;

class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
}

class Cliente {
    private String nome;
    private String cnh;

    public Cliente(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }
}

class Locacao {
    private Date dataRetirada;
    private Date dataDevolucao;
    private double valorLocacao;
    private double caucao;
    private String finalidade;
    private String local;
    private double quilometragem;
    private String condCarro;

    public Locacao(Cliente cliente, Carro carro, Date dataRetirada, Date dataDevolucao, double valorLocacao) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.valorLocacao = valorLocacao;
        this.caucao = cliente.getCaucao(); // Assumindo que o cliente tem um método getCaucao()
        this.finalidade = cliente.getFinalidade(); // Assumindo que o cliente tem um método getFinalidade()
        this.local = carro.getLocal(); // Assumindo que o carro tem um método getLocal()
    }

    public void devolucao(Date dataDevolucao, double quilometragem, String condCarro) {
        this.dataDevolucao = dataDevolucao;
        this.quilometragem = quilometragem;
        this.condCarro = condCarro;
    }

    public boolean isDevolvido() {
        // Implemente a lógica para verificar se a locação foi devolvida
        // Retorne true se foi devolvida, false caso contrário
        return true; // Exemplo, substitua pela lógica real
    }

    public double getValorCaucao() {
        // Implemente a lógica para obter o valor do caução
        return caucao; // Exemplo, substitua pela lógica real
    }
}