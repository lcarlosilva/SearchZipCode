package br.com.luiz.data.repository;

import javax.inject.Inject;
import javax.inject.Singleton;

import br.com.luiz.data.remote.api.ISearchZipCode;
import br.com.luiz.domain.models.AddressResponse;
import br.com.luiz.domain.repository.ZipCodeRepository;
import io.reactivex.rxjava3.core.Flowable;
import okhttp3.OkHttpClient;


@Singleton
public class ZipCodeRepositoryImpl implements ZipCodeRepository {

//    private final OkHttpClient okHttpClient;
    private final ISearchZipCode api;

    @Inject
    public ZipCodeRepositoryImpl(ISearchZipCode api) {
//        this.okHttpClient = okHttpClient;
        this.api = api;
    }

    public Flowable<AddressResponse> searchZipCode(String zipCode) {
        return api.getAddressInfo(zipCode)
                .toFlowable()
                .doOnError(response -> {
                    if (response == null) {
                        throw new Exception("Zip code not found");
                    }
                });
    }
}