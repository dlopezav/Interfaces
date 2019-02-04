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
public class DividendStock extends Stock {
    protected double dividends;

    public DividendStock(double dividends, int totalShares, String symbol, double totalCost, double currentPrice) {
        super(totalShares, symbol, totalCost, currentPrice);
        this.dividends = dividends;
    }
    
    
    @Override
    public double getMarketValue() {
        return (this.totalShares*this.currentPrice)+dividends;
    }

    @Override
    public double getProfit() {
        return ((totalShares) * (currentPrice)) - (totalCost) ;
    }

    public double getDividends() {
        return dividends;
    }

    public void setDividends(double dividends) {
        this.dividends = dividends;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    
    
}
