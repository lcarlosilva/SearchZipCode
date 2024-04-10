package br.com.luiz.domain.usecase;

import javax.inject.Inject;

import br.com.luiz.domain.models.AddressResponse;
import br.com.luiz.domain.repository.ZipCodeRepository;

public class SearchZipCodeUseCase {

    private final ZipCodeRepository zipCodeRepository;

    @Inject
    public SearchZipCodeUseCase(ZipCodeRepository zipCodeRepository) {
        this.zipCodeRepository = zipCodeRepository;
    }

    public AddressResponse searchZipCode(String zipCode) {
        AddressResponse addressResponse = zipCodeRepository.searchZipCode(zipCode);
        return addressResponse;
    }
}
