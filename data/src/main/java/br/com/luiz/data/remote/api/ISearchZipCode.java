package br.com.luiz.data.remote.api;

import br.com.luiz.domain.models.AddressResponse;
import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
//import io.reactivex.rxjava3.core.Observable;

public interface ISearchZipCode {
    @GET("/{cep}")
    /*Observable*/Single<AddressResponse> getAddressInfo(@Path("cep") String zipCode);
}
