package com.kodilla.good.patterns.kodillaExamples.KodillaAllegro;

public class OrderProcessor {

    private InformationService informationService;
    private PaymentService paymentService;
    private OrderService orderService;
    private WarehouseService warehouseService;

    public OrderProcessor(final InformationService informationService,
                          final PaymentService paymentService,
                          final OrderService orderService,
                          final WarehouseService warehouseService) {
        this.informationService = informationService;
        this.paymentService = paymentService;
        this.orderService = orderService;
        this.warehouseService = warehouseService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getBasket());
        boolean isPayed = false;
        if (isOrdered) {
            isPayed = paymentService.process(orderRequest.getBasket());
        }

        if (isPayed && isOrdered) {
            informationService.sendInformationSuccessfullPayment(orderRequest.getUser());
            warehouseService.sendToUser(orderRequest.getUser(), orderRequest.getBasket());
        } else if (isOrdered) {
            informationService.sendInformationUnsuccessfullPayment(orderRequest.getUser());
        }
        return new OrderDto(orderRequest, isPayed, isOrdered);

    }
}
