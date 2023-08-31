package com.bulvee.cleanarch.core.usecase.impl;

import com.bulvee.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.bulvee.cleanarch.core.dataprovider.UpdateCustomer;
import com.bulvee.cleanarch.core.domain.Customer;
import com.bulvee.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.bulvee.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAddressByZipCode findAddressByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, FindAddressByZipCode findAddressByZipCode, UpdateCustomer updateCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        var customerToUpdate = findCustomerByIdUseCase.find(customer.getId());
        var address = findAddressByZipCode.find(zipCode);
        customerToUpdate.setAdress(address);
        updateCustomer.update(customerToUpdate);
    }
}
