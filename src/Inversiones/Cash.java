/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inversiones;

/**
 *
 * @author dlopezav
 */
public class Cash implements Asset {
    public double amount;
    
    public Cash(double amount) {
        this.amount = amount;
    }
    
    @Override
    public double getMarketValue(){
        return amount;
    }
    
    @Override
    public double getProfit(){
        return 0;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
