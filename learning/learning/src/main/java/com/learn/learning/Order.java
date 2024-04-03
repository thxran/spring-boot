package com.learn.learning;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    @JsonProperty("c-name")
    private String customerName;
    @JsonProperty("p-name")
    private String productName;
    @JsonProperty("q")
    private int quantity;
    @JsonProperty("p")
    private int price;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName = " + customerName +
                ", productName = " + productName +
                ", quantity = " + quantity +
                ", price = " + "$" + price +
                "}";
    }
}
