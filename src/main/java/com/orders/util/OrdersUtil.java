package com.orders.util;

import org.springframework.stereotype.Component;

import com.orders.model.OrderReqPayload;
import com.orders.model.Orders;
import com.orders.model.ResponsePayload;

@Component
public class OrdersUtil {

	public ResponsePayload getResponse(Orders order, OrderReqPayload request) {
		ResponsePayload resp = new ResponsePayload();
		try {
		if (order.getOrdNum()!=null) {
			resp.setOrdId(order.getOrdNum());
		}
		resp.setStatus("Sucess");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception {}" +e);
		}
		return resp;
	}

}
