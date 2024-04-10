package br.com.luiz.data.remote.api;

import br.com.luiz.domain.models.AddressResponse;
import io.reactivex.rxjava3.core.Single;
//import io.reactivex.rxjava3.core.Observable;

public interface ISearchZipCode {
    /*Observable*/Single<AddressResponse> getAddressInfo(String zipCode);
}
