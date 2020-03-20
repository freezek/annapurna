package com.freezek.engine.dto;

import com.alibaba.cola.dto.Command;
import com.freezek.engine.dto.domainmodel.Customer;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command{

    private Customer customer;

}
