package br.com.luiz.domain.repository;

import br.com.luiz.domain.models.AddressResponse;
import io.reactivex.rxjava3.core.Flowable;

public interface ZipCodeRepository {
    Flowable<AddressResponse> searchZipCode(String zipCode);
}