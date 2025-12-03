package com.example.ecom.notification.listener;

import com.example.ecom.common.event.OrderCreatedEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationListener {

    @RabbitListener(queues = "order.created.notification")
    public void handleOrderCreated(OrderCreatedEvent event) {
        System.out.println("Sending notification for order: " + event.getOrderId());
        // Mock sending email
    }
}
