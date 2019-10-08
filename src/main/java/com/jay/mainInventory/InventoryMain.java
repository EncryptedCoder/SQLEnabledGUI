
package com.jay.mainInventory;

public class InventoryMain {
    
    private Integer itemKey;
    private String itemName;
    private Double itemPrice;
    private Integer itemQuantity;
    
    public InventoryMain(Integer key, String item, Double price, Integer quantity){
        
        this.itemKey = key;
        this.itemName = item;
        this.itemPrice = price;
        this.itemQuantity = quantity; 
        
    }
    
    public Integer getIdNumber() {
        return itemKey;
    }
    public void setIdNumber(Integer idNumber) {
        this.itemKey = idNumber;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public Double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public Integer getItemQuantity() {
        return itemQuantity;
    }
    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    
}
