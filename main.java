import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaGerenciamentoDoacoes {
    private List<Doacao> doacoes;
    private List<Doador> doadores;
    private int proximoIdDoacao;
    private int proximoIdDoador;

    public SistemaGerenciamentoDoacoes() {
        doacoes = new ArrayList<>();
        doadores = new ArrayList<>();
        proximoIdDoacao = 1;
        proximoIdDoador = 1;
    }

    public void adicionarDoacao(String tipo, double quantidade, Date data, Doador doador) {
        Doacao novaDoacao = new Doacao(proximoIdDoacao++, tipo, quantidade, data, doador);
        doacoes.add(novaDoacao);
        System.out.println("Doação adicionada: " + novaDoacao.getDetalhes());
    }

    public double calcularTotalDoacoes() {
        double total = 0;
        for (Doacao doacao : doacoes) {
            total += doacao.getQuantidade();
        }
        return total;
    }

    public void listarDoacoes() {
        for (Doacao doacao : doacoes) {
            System.out.println(doacao.getDetalhes());
        }
    }

    public void adicionarDoador(String nome, String contato) {
        Doador novoDoador = new Doador(proximoIdDoador++, nome, contato);
        doadores.add(novoDoador);
        System.out.println("Doador adicionado: " + novoDoador.getDetalhes());
    }

    public void gerarRelatorio() {
        System.out.println("Relatório de Doações:");
        listarDoacoes();
        System.out.println("Total de Doações: " + calcularTotalDoacoes());
    }
}
