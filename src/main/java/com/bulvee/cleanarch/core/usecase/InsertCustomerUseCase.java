package com.bulvee.cleanarch.core.usecase;

import com.bulvee.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String cep);

}
