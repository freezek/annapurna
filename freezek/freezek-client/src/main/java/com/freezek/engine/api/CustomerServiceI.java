package com.freezek.engine.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.freezek.engine.dto.CustomerAddCmd;
import com.freezek.engine.dto.CustomerListByNameQry;
import com.freezek.engine.dto.domainmodel.Customer;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<Customer> listByName(CustomerListByNameQry customerListByNameQry);
}
