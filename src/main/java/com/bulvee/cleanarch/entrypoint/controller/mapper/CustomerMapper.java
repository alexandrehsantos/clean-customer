package com.bulvee.cleanarch.entrypoint.controller.mapper;

import com.bulvee.cleanarch.core.domain.Customer;
import com.bulvee.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.bulvee.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "adress", ignore = true)
    @Mapping(target = "validCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
