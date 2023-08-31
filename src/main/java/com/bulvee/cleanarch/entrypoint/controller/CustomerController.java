package com.bulvee.cleanarch.entrypoint.controller;

import com.bulvee.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.bulvee.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.bulvee.cleanarch.core.usecase.InsertCustomerUseCase;
import com.bulvee.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.bulvee.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.bulvee.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.bulvee.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;
    @Autowired (required=false)
    private CustomerMapper customerMapper;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;
    @Autowired
    private DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var zipCode = customerRequest.getZipCode();
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer, zipCode);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id, @Valid CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUseCase.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id) {
        deleteCustomerByIdUseCase.delete(id );
        return ResponseEntity.noContent().build();
    }

}
