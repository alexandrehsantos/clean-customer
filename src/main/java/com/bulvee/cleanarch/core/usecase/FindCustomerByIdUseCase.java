package com.bulvee.cleanarch.core.usecase;

import com.bulvee.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
