package com.freezek.engine.domain.gateway;

import com.freezek.engine.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
