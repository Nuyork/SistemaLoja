/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Entities.MenuFormulario;

/**
 *
 * @author user 
 */
public class Estoque {
    private final MenuFormulario Menu;
    
    public Estoque() {
        Menu = new MenuFormulario();
        
        String Opcoes[] = {"A", "B", "C", "D", "F", "G"};
        
        Menu.CriarCampoDeTexto("Nome");
        Menu.CriarCampoDeTexto("Preco");
        Menu.CriarCampoDeTexto("Quantidade");
        Menu.CriarCampoDeTexto("Minimo");
        Menu.CriarCampoDeTexto("Codigo");
        Menu.CriarCampoDeOpcoes("Fornecedores", Opcoes);
   }

    public MenuFormulario getMenu() {
        return Menu;
    }
    
    
    /*public void Mostrar() {
        String Opcoes[] = {"Adicionar produto", "Remover produto"};
        
        JOptionPane.showConfirmDialog(null, this.Menu);
        
        int Selecionado = 0;
        //int Selected = JOptionPane.showOptionDialog(null, "Choose an option", "Product Manager", 0, 0, null, Options, this);
        
        if (Selecionado == 0) {
            Produto NovoProduto = new Produto();
     
            
            
        }
    }*/
}
