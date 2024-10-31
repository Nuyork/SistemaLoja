/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author user
 */
public class Fornecedor {
    private String Name;

    public Fornecedor(String Name) {
        this.Name = Name;
    }    

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return getName();
    }
    
    
    
    
}
