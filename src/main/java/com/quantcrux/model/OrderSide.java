package com.quantcrux.model;

public enum OrderSide {
    BUY("Buy"),
    SELL("Sell");
    
    private final String displayName;
    
    OrderSide(String displayName) {
        this.displayName = displayName;
    }
    
    public String getDisplayName() {
        return displayName;
    }
}