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
        MenuProdutos ControladorProdutos = new MenuProdutos();
        MenuFornecedores ControladorFornecedores = new MenuFornecedores();
        MenuVendas ControladorVendas = new MenuVendas();
        
        Fornecedores.AdicionarFornecedor(new Fornecedor("Generico"));
        Categorias.AdicionarCategoria(new Categoria("Nenhuma"));
        
        String Opcoes[] = {"Adicionar produto", "Editar produto", "Remover produto", "Adicionar fornecedor", "Adicionar categoria", "Registrar Venda"};
        
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
            }
            else if (Selecao == 4) {
                ControladorProdutos.AbrirCriacaoCategoria();
            }
            else if (Selecao == 5) {
                ControladorVendas.AbrirCaixa();
            }

            UltimaOpcao = Selecao;
        }while (UltimaOpcao != -1);
    }
}
