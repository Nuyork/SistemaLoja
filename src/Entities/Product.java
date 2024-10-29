/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author user
 */
public class Product {
    private String Name;
    private Integer Amount;
    private Integer Minimum;
    private Float Price;
    private String Code;
    private Supplier Supplier;
    private Category Category;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }

    public Integer getMinimum() {
        return Minimum;
    }

    public void setMinimum(Integer Minimum) {
        this.Minimum = Minimum;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float Price) {
        this.Price = Price;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public Supplier getSupplier() {
        return Supplier;
    }

    public void setSupplier(Supplier Supplier) {
        this.Supplier = Supplier;
    }

    public Category getCategory() {
        return Category;
    }

    public void setCategory(Category Category) {
        this.Category = Category;
    }
    
    
}
