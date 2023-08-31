package com.bulvee.cleanarch.entrypoint.consumer.mapper;

import com.bulvee.cleanarch.core.domain.Customer;
import com.bulvee.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
