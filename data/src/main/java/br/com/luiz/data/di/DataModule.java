package br.com.luiz.data.di;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Inject;
import javax.inject.Singleton;

import br.com.luiz.data.remote.api.ISearchZipCode;
import br.com.luiz.data.repository.ZipCodeRepositoryImpl;
//import br.com.luiz.domain.models.AddressResponse;
import br.com.luiz.domain.repository.ZipCodeRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
@InstallIn(SingletonComponent.class)
public class DataModule {

    private final String mBaseUrl;

    @Inject
    public DataModule(/*String baseUrl*/) {
        mBaseUrl = "https://cep.awesomeapi.com.br/json/";
    }

    /*TODO: ajustar o projeto para obter o Application aqui*/
    /* @Provides
    @Singleton
    Cache provideOkHttpCache(Application application) {
        int cacheSize = 10 * 1024 * 1024; // 10 MiB
        return new Cache(application.getCacheDir(), cacheSize);
    }*/

    @Provides
    @Singleton
    Gson provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gsonBuilder.create();
    }


    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(/*Cache cache*/) {
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        return client.build();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .baseUrl(mBaseUrl)
                .client(okHttpClient)
                .build();
    }

    @Provides
    @Singleton
    ZipCodeRepository provideZipCodeRepository(ISearchZipCode api) {
        return new ZipCodeRepositoryImpl(api);
    }

    @Provides
    @Singleton
    ISearchZipCode provideISearchZipCode(Retrofit retrofit) {
        return retrofit.create(ISearchZipCode.class);
    }
}

