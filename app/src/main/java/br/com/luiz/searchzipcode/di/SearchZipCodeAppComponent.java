package br.com.luiz.searchzipcode.di;

import javax.inject.Singleton;

import br.com.luiz.data.di.DataModule;
import br.com.luiz.domain.di.DomainModule;
import br.com.luiz.searchzipcode.MainActivity;
import dagger.Component;

@Singleton
@Component(modules = {
        SearchZipCodeAppModule.class,
        DataModule.class,
        DomainModule.class
})
public interface SearchZipCodeAppComponent {
    void inject(MainActivity mainActivity);
}
