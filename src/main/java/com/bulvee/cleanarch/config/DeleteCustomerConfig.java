package com.bulvee.cleanarch.config;

import com.bulvee.cleanarch.core.dataprovider.DeleteCustomerById;
import com.bulvee.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.bulvee.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerById deleteCustomerById) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }
}
