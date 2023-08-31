package com.bulvee.cleanarch.config;

import com.bulvee.cleanarch.core.dataprovider.FindCustomerById;
import com.bulvee.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.bulvee.cleanarch.dataprovider.repository.CustomerRespository;
import com.bulvee.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(FindCustomerById findCustomerById){
        return new FindCustomerByIdUseCaseImpl (findCustomerById);
    }
}
