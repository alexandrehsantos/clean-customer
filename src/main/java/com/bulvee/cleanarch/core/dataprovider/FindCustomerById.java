package com.bulvee.cleanarch.core.dataprovider;

import com.bulvee.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);
}
