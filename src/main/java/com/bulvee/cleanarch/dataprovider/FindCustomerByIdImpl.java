package com.bulvee.cleanarch.dataprovider;

import com.bulvee.cleanarch.core.dataprovider.FindCustomerById;
import com.bulvee.cleanarch.core.domain.Customer;
import com.bulvee.cleanarch.dataprovider.repository.CustomerRespository;
import com.bulvee.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRespository customerRespository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRespository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
