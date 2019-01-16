package com.kodilla.good.patterns.kodillaExamples.KodillaAllegro;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.orderRetriever();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationServiceEletronicMail(),
                new PaymentServiceInternetBanking(),
                new ProductOrderService(),
                new WarehouseServiceImpl());
        orderProcessor.process(orderRequest);

    }
}
