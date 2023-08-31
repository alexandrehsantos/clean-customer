package com.bulvee.cleanarch.config;

import com.bulvee.cleanarch.core.dataprovider.SendCpfForValidation;
import com.bulvee.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.bulvee.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.bulvee.cleanarch.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCode, InsertCustomerImpl insertCustomer, SendCpfForValidation sendCpfForValidation) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }

}
