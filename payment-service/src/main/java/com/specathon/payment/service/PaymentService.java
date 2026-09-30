package com.specathon.payment.service;
import com.specathon.order.client.OrderClient; import org.springframework.stereotype.Service;
@Service public class PaymentService { private final OrderClient orderClient; public PaymentService(OrderClient orderClient){this.orderClient=orderClient;} public String createPayment(Long orderId){ return "Order URL: "+orderClient.getOrderUrl(orderId); } }