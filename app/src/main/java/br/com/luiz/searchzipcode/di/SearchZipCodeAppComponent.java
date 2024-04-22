package br.com.luiz.searchzipcode.di;

import javax.inject.Singleton;

import br.com.luiz.searchzipcode.ui.MainActivity;

@Singleton
/*@Component(modules = {
        SearchZipCodeAppModule.class,
        DataModule.class,
        DomainModule.class,
        ViewModelModule.class
})*/
public interface SearchZipCodeAppComponent {
    void inject(MainActivity mainActivity);
}
