package com.sa.clothingstore.service.order.orderStatusStrategy;

import com.sa.clothingstore.model.order.Order;

public interface OrderActionStrategy {
    void updateOrderStatus(Order order);
}
