package br.com.luiz.searchzipcode.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SearchZipCodeAppModule {

    Application mApplication;

    public SearchZipCodeAppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }
}
