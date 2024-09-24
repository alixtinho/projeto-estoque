package dominio;

import java.time.LocalDate;

public abstract class BaseParametro {
    protected int codigo;
    protected String descricao;
    protected LocalDate dataDeInclucao;
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataDeInclucao() {
        return dataDeInclucao;
    }
    public void setDataDeInclucao(LocalDate dataDeInclucao) {
        this.dataDeInclucao = dataDeInclucao;
    }
    public BaseParametro(){
    }
    public BaseParametro(int codigo, String descricao, LocalDate dataDeInclucao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataDeInclucao = dataDeInclucao;
    }
}