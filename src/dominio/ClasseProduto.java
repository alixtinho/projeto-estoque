package dominio;

import java.time.LocalDate;

public class ClasseProduto extends BaseParametro {

    public ClasseProduto(){
        super();
    }

    public ClasseProduto(int codigo, String descricao, LocalDate dataDeInclucao){
        super(codigo, descricao, dataDeInclucao);
    }
}