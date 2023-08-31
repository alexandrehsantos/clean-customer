package com.bulvee.cleanarch.config;

import com.bulvee.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.bulvee.cleanarch.core.dataprovider.UpdateCustomer;
import com.bulvee.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.bulvee.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase, FindAddressByZipCode findAddressByZipCode, UpdateCustomer updateCustomer){
       return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }
}
