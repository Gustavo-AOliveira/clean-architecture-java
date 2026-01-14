package com.gustavo.cleanarc.application.usecase;

import com.gustavo.cleanarc.application.gateway.FindAddressByZipCode;
import com.gustavo.cleanarc.domain.model.Customer;

public class CreateCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    public CreateCustomerUseCase(FindAddressByZipCode findAddressByZipCode) {
        this.findAddressByZipCode = findAddressByZipCode;
    }

    public void execute(Customer customer, String zipCode) {
        var address = findAddressByZipCode.execute(zipCode);
        customer.setAddress(address);
    }
}
