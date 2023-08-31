package com.bulvee.cleanarch.dataprovider.repository.mapper;

import com.bulvee.cleanarch.core.domain.Customer;
import com.bulvee.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
    Customer toCustomer(CustomerEntity customerEntity);
}
