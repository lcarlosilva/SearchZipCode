package br.com.luiz.domain.usecase;

import javax.inject.Inject;

import br.com.luiz.domain.models.AddressResponse;
import br.com.luiz.domain.repository.ZipCodeRepository;
import io.reactivex.rxjava3.core.Flowable;

public class SearchZipCodeUseCase {

    private final ZipCodeRepository zipCodeRepository;

    @Inject
    public SearchZipCodeUseCase(ZipCodeRepository zipCodeRepository) {
        this.zipCodeRepository = zipCodeRepository;
    }

    public Flowable<AddressResponse> searchZipCode(String zipCode) {
        return zipCodeRepository.searchZipCode(zipCode);
    }
}
