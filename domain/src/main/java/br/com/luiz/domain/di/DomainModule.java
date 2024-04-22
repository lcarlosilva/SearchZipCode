package br.com.luiz.domain.di;


import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class DomainModule {
    /*@Provides
    public SearchZipCodeUseCase provideSearchZipCodeUseCase(ZipCodeRepository repository) {
        return new SearchZipCodeUseCase(repository);
    }*/
}