import java.util.Date;

public class Doacao {
    private int id;
    private String tipo;
    private double quantidade;
    private Date data;
    private Doador doador;

    public Doacao(int id, String tipo, double quantidade, Date data, Doador doador) {
        this.id = id;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.data = data;
        this.doador = doador;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public Date getData() {
        return data;
    }

    public Doador getDoador() {
        return doador;
    }

    public String getDetalhes() {
        return "ID: " + id + ", Tipo: " + tipo + ", Quantidade: " + quantidade + ", Data: " + data + ", Doador: " + (doador != null ? doador.getNome() : "N/A");
    }
}
