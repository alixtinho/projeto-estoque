package visao;

import java.util.ArrayList;
import dominio.ClasseProduto;
import servico.ClasseProdutoServico;

public class ClasseProdutoVisao {
    
    public ClasseProdutoVisao(){
    }
    
    public void Exibir(){
        ClasseProdutoServico srv = new ClasseProdutoServico();
        ArrayList<ClasseProduto> lista = srv.Navegar();
        System.out.println("================================================");
        for (ClasseProduto cp : lista) {
             this.Imprimir(cp);
        }
    }
    
    private void Imprimir(ClasseProduto cp){
        System.out.println("ClasseProduto:");
        System.out.println("Código: " + cp.getCodigo());
        System.out.println("Descrição: " + cp.getDescricao());
        System.out.println("Data de Inclusão:" + cp.getDataDeInclucao());
        System.out.println("-----------------------------------------------");
    }
}
