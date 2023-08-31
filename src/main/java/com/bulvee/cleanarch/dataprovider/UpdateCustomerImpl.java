package com.bulvee.cleanarch.dataprovider;

import com.bulvee.cleanarch.core.dataprovider.UpdateCustomer;
import com.bulvee.cleanarch.core.domain.Customer;
import com.bulvee.cleanarch.dataprovider.repository.CustomerRespository;
import com.bulvee.cleanarch.dataprovider.repository.entity.CustomerEntity;
import com.bulvee.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Autowired
    private CustomerRespository customerRespository;

    @Override
    public void update(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRespository.save(customerEntity);
    }
}
