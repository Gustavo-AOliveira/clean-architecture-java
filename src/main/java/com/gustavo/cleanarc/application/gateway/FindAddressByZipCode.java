package com.gustavo.cleanarc.application.gateway;

import com.gustavo.cleanarc.domain.model.Address;

public interface FindAddressByZipCode {

    Address execute(String zipCode);
}
