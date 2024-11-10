package Controllers;

import Entities.Categoria;
import Entities.Fornecedor;
import Entities.MenuFormulario;
import Persistence.Categorias;
import Persistence.Fornecedores;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        GerenciadorProdutos ControladorProdutos = new GerenciadorProdutos();
        GerenciadorFornecedores ControladorFornecedores = new GerenciadorFornecedores();
        GerenciadorVendas ControladorVendas = new GerenciadorVendas();
        
        Fornecedores.AdicionarFornecedor(new Fornecedor("Generico"));
        Categorias.AdicionarCategoria(new Categoria("Nenhuma"));
        
        String Opcoes[] = {"Adicionar produto", "Editar produto", "Remover produto", "Adicionar fornecedor", "Registrar Venda"};
        
        int UltimaOpcao = 0;
        
        do {
            int Selecao = JOptionPane.showOptionDialog(null, "Escolha uma opcao", "Gerenciador", 0, 0, null, Opcoes, null);

            if (Selecao == 0) {
                ControladorProdutos.AbrirCriacaoProduto();
            }
            else if (Selecao == 1) {
            ControladorProdutos.AbrirEdicaoDeProduto();
            }else if (Selecao == 2) {
                ControladorProdutos.AbrirDeletarProduto();
            }
            else if (Selecao == 3) {
                ControladorFornecedores.AbrirCriacaoDeFornecedor();
            }else if (Selecao == 4) {
                ControladorVendas.AbrirCaixa();
            }

            UltimaOpcao = Selecao;
        }while (UltimaOpcao != -1);
    }
}
