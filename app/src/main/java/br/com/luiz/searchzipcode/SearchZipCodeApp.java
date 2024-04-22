package br.com.luiz.searchzipcode;

import android.app.Application;

import br.com.luiz.searchzipcode.di.SearchZipCodeAppComponent;
import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class SearchZipCodeApp extends Application {

    private SearchZipCodeAppComponent mSearchZipCodeAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        /*mSearchZipCodeAppComponent = DaggerSearchZipCodeAppComponent.builder()
                .searchZipCodeAppModule(new SearchZipCodeAppModule(this))
                .dataModule(new DataModule("https://viacep.com.br/ws/"))
                .dataModule(new DataModule("https://cep.awesomeapi.com.br/json/"))
                .build();*/
    }

}
