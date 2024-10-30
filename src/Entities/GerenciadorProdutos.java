/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class GerenciadorProdutos {
    private final MenuFormulario Menu;
    
    public GerenciadorProdutos() {
        Menu = new MenuFormulario();
        
        String Opcoes[] = {"A", "B", "C", "D", "F", "G"};
        
        Menu.CriarCampoDeTexto("Nome");
        Menu.CriarCampoDeTexto("Preco");
        Menu.CriarCampoDeTexto("Quantidade");
        Menu.CriarCampoDeTexto("Minimo");
        Menu.CriarCampoDeTexto("Codigo");
        Menu.CriarCampoDeOpcoes("Fornecedores", Opcoes);
    }
    
    public MenuFormulario GetMenu() {
        return Menu;
    }
            
    public void AbrirCriacaoProduto() {
        Integer Opcao = Menu.Mostrar("Criando produto");

        if (Opcao == JOptionPane.YES_OPTION) {
            String Nome = Menu.PegarValorDoCampo("Nome");
            String Codigo = Menu.PegarValorDoCampo("Codigo");

            if (Nome.isBlank()) {
                System.out.println("Nome nao pode ser vazio");
            } 
            
            System.out.println(Nome + " " + Codigo);
        }
        
        
    }
}
