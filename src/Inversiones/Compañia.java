/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inversiones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dlopezav
 */
public class Compañia {
    
    private String name;
    private HashMap<Integer, Cliente> clientes;
    private ArrayList<Asset> assets;

    public Compañia(String name) {
        this.name = name;
        this.clientes = new HashMap<>();
        this.assets = new ArrayList<>();
    }
    
    public boolean addClient(int cedula, int edad, String nombre, String apellido, int telefono, String email){
        Cliente cliente= new Cliente(cedula, edad, nombre, apellido, telefono, email);
        clientes.put(cedula,cliente);
        return true;
    }
    
    public boolean addCash(double amount){
        Asset cash = new Cash(amount); 
        assets.add(cash);
        return true;
    }
    
    public boolean addStock(int totalShares, String symbol, double totalCost, double currentPrice){
        Asset stock = new Stock(totalShares, symbol, totalCost, currentPrice);
        assets.add(stock);
        return true;
    }
    
    public double getAllMarketValue(){
        double MarketValue=0;
        for(Cliente e : clientes.values()){
            for(Asset asset : e.getAssets()){
                MarketValue+=asset.getMarketValue();
            }
        }
        return MarketValue;
    }
    
    public double getValueByType(String tipo){
        double valueStock=0;
        double valueMutualFund=0;
        double valueCash=0;
        double valueDividendStock=0;
        for(Cliente e : clientes.values()){
            for(Asset asset : e.getAssets()){
                if(asset instanceof Stock){
                valueStock+=asset.getMarketValue();
                }
                if(asset instanceof MutualFund){
                valueMutualFund+=asset.getMarketValue();
                }
                if(asset instanceof DividendStock){
                valueDividendStock+=asset.getMarketValue();
                }
                if(asset instanceof Cash){
                valueCash+=asset.getMarketValue();
                }
            }
        }
        return 4;
    }
}
