package com.bulvee.cleanarch.dataprovider.client.mapper;

import com.bulvee.cleanarch.core.domain.Address;
import com.bulvee.cleanarch.dataprovider.client.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
