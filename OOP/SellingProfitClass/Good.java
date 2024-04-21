/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.SellingProfitClass;


class Good {
    private String id, name;
    private int buyprice, sellprice;

    public Good(int id, String name, int buyprice, int sellprice) {
        this.id = "MH" + String.format("%05d", id);
        this.name = name;
        this.buyprice = buyprice;
        this.sellprice = sellprice;
    }

    public String getId() {
        return id;
    }
    
    public int profit(){
        return this.sellprice - this.buyprice;
    }
    
    public String toString(){
        return this.id + " " + this.name + " " + this.sellprice + " " + this.buyprice + " " + this.profit();
    }  
    
}
