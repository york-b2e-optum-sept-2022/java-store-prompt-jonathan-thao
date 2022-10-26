package net.yorksolutions.javaprompt;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StoreProduct {
    protected int id;
    @JsonProperty
    private String productName;
    @JsonProperty
    private String displayName;
    @JsonProperty
    private Double price;
    @JsonProperty
    private Double salePercent;
    @JsonProperty
    private boolean onSale;

    private double currentPrice;
    public StoreProduct(String productName, String displayName, double price, double salePercent, boolean onSale) {
        this.id = getId();
        this.productName = productName.toLowerCase();
        this.displayName = displayName;
        this.price = price;
        this.salePercent = salePercent;
        this.onSale = onSale;
    }

    public int getId() {

        return id;
    }

    public String getProductName() {

        return productName;
    }

    public String getDisplayName() {

        return displayName;
    }

    public double getPrice() {

        return price;
    }

    public double getSalePercent() {

        return salePercent;
    }

    public boolean isOnSale() {

        return onSale;
    }

}

