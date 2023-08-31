package com.bulvee.cleanarch.core.usecase;

import com.bulvee.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
