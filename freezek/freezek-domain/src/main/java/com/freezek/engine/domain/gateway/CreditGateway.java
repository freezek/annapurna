package com.freezek.engine.domain.gateway;

import com.freezek.engine.domain.customer.Customer;
import com.freezek.engine.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
