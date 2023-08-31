package com.bulvee.cleanarch.dataprovider;

import com.bulvee.cleanarch.core.dataprovider.InsertCustomer;
import com.bulvee.cleanarch.core.domain.Customer;
import com.bulvee.cleanarch.dataprovider.repository.CustomerRespository;
import com.bulvee.cleanarch.dataprovider.repository.entity.CustomerEntity;
import com.bulvee.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRespository customerRespository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRespository.save(customerEntity);
    }
}
