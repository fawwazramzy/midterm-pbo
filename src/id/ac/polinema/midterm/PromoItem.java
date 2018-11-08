/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author iloops
 */
public class PromoItem extends Item {
    private float promo;

    public PromoItem(String nama, float price, int amount,float promo ) {
        super(nama, price, amount);
        this.promo = promo;
    }
    
    public float getTotalPrice(){
        return (price * amount)-(promo * amount);
    }
    public float getPromo(){
        return promo;
    }
    
}
