package br.com.luiz.domain.repository;

import br.com.luiz.domain.models.AddressResponse;

public interface ZipCodeRepository {
    AddressResponse searchZipCode(String zipCode);
}