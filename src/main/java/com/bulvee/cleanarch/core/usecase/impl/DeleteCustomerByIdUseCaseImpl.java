package com.bulvee.cleanarch.core.usecase.impl;

import com.bulvee.cleanarch.core.dataprovider.DeleteCustomerById;
import com.bulvee.cleanarch.core.domain.Customer;
import com.bulvee.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.bulvee.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final DeleteCustomerById deleteCustomerById;
    public DeleteCustomerByIdUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerById deleteCustomerById) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(String id) {
        Customer customer = this.findCustomerByIdUseCase.find(id);
        this.deleteCustomerById.delete( id);
    }
}
