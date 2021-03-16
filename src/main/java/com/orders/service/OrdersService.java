package com.orders.service;

import com.orders.model.OrderReqPayload;
import com.orders.model.ResponsePayload;

public interface OrdersService {

	ResponsePayload processOrder(OrderReqPayload reqPaylaod);

}
