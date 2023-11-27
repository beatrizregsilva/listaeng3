// Interface para estratégias de ordenação
public interface OrdenacaoStrategy<T extends Comparable<T>> {
    void ordenarLista(T[] array);
}

// Implementação para o algoritmo de ordenação: Bubble Sort
public class BubbleSort<T extends Comparable<T>> implements OrdenacaoStrategy<T> {
    @Override
    public void ordenarLista(T[] array) {
        // Lógica específica para o Bubble Sort
    }
}

// Implementação para o algoritmo de ordenação: Quick Sort
public class QuickSort<T extends Comparable<T>> implements OrdenacaoStrategy<T> {
    @Override
    public void ordenarLista(T[] array) {
        // Lógica específica para o Quick Sort
    }
}

// Implementação para o algoritmo de ordenação: Merge Sort
public class MergeSort<T extends Comparable<T>> implements OrdenacaoStrategy<T> {
    @Override
    public void ordenarLista(T[] array) {
        // Lógica específica para o Merge Sort
    }
}

import java.util.Arrays;

// Classe principal do sistema que aceita diferentes estratégias e ordena listas
public class SistemaOrdenacao<T extends Comparable<T>> {
    private OrdenacaoStrategy<T> estrategiaOrdenacao;

    // Método para configurar a estratégia de ordenação
    public void setEstrategiaOrdenacao(OrdenacaoStrategy<T> estrategiaOrdenacao) {
        this.estrategiaOrdenacao = estrategiaOrdenacao;
    }

    // Método para ordenar a lista com base na estratégia escolhida
    public void ordenarLista(T[] lista) {
        if (estrategiaOrdenacao != null) {
            estrategiaOrdenacao.ordenarLista(lista);
            System.out.println("Lista ordenada: " + Arrays.toString(lista));
        } else {
            System.out.println("Por favor, configure a estratégia de ordenação antes de ordenar a lista.");
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso do sistema com diferentes estratégias de ordenação

        SistemaOrdenacao<Integer> sistema = new SistemaOrdenacao<>();

        // Usuário escolhe Bubble Sort para ordenar lista de inteiros
        sistema.setEstrategiaOrdenacao(new BubbleSort<>());
        sistema.ordenarLista(new Integer[]{5, 3, 8, 1, 2});

        // Usuário escolhe Quick Sort para ordenar lista de strings
        sistema.setEstrategiaOrdenacao(new QuickSort<>());
        sistema.ordenarLista(new String[]{"banana", "maçã", "laranja", "abacaxi"});

        // Usuário escolhe Merge Sort para ordenar lista de objetos customizados
        sistema.setEstrategiaOrdenacao(new MergeSort<>());
        // Suponhamos que tenhamos uma classe "ObjetoCustomizado" com um atributo numérico
        ObjetoCustomizado[] objetos = {
            new ObjetoCustomizado(3),
            new ObjetoCustomizado(1),
            new ObjetoCustomizado(5)
        };
        sistema.ordenarLista(objetos);
    }
}

public class ObjetoCustomizado implements Comparable<ObjetoCustomizado> {
    private int valorNumerico;

    public ObjetoCustomizado(int valorNumerico) {
        this.valorNumerico = valorNumerico;
    }

    @Override
    public int compareTo(ObjetoCustomizado outro) {
        return Integer.compare(this.valorNumerico, outro.valorNumerico);
    }

    @Override
    public String toString() {
        return "ObjetoCustomizado{" +
                "valorNumerico=" + valorNumerico +
                '}';
    }
}