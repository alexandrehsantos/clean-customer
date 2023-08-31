package com.bulvee.cleanarch.core.dataprovider;

import com.bulvee.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCoe);
}
