package com.kodilla.good.patterns.kodillaExamples.KodillaAllegro;

public class OrderDto {
    public OrderRequest orderRequest;
    public boolean isPayed;
    public boolean ordered;

    public OrderDto(OrderRequest orderRequest, boolean isPayed, boolean ordered) {
        this.orderRequest = orderRequest;
        this.isPayed = isPayed;
        this.ordered = ordered;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public boolean isOrdered() {
        return ordered;
    }
}
