package dominio;

import java.time.LocalDate;

public class Produto extends BaseParametro {
    private int codigoSubclasse;
    private Double valor;

    public int getCodigoSubclasse() {
        return codigoSubclasse;
    }
    public void setCodigoSubclasse(int codigoSubclasse) {
        this.codigoSubclasse = codigoSubclasse;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Produto() {
        super();
    }
    public Produto(int codigo, String descricao, LocalDate dataInclusao, int codigoSubclasse, Double valor) {
        super(codigo, descricao, dataInclusao);
        this.codigoSubclasse = codigoSubclasse;
        this.valor = valor;
    }

}