package com.bulvee.cleanarch.dataprovider;

import com.bulvee.cleanarch.core.dataprovider.DeleteCustomerById;
import com.bulvee.cleanarch.dataprovider.repository.CustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {

    @Autowired
    private CustomerRespository customerRespository;

    @Override
    public void delete(String id) {
        customerRespository.deleteById(id);
    }
}
