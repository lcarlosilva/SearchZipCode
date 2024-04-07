package br.com.luiz.data.remote.api;


import br.com.luiz.data.remote.models.AddressResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ViaCep {
    @GET("{cep}/json/")
    Call<AddressResponse> getAddressInfo(@Path("cep") String cep);
}
