package br.com.luiz.domain.di;


import br.com.luiz.domain.repository.ZipCodeRepository;
import br.com.luiz.domain.usecase.SearchZipCodeUseCase;
import dagger.Module;
import dagger.Provides;

@Module
public class DomainModule {
    @Provides
    public SearchZipCodeUseCase provideSearchZipCodeUseCase(ZipCodeRepository repository) {
        return new SearchZipCodeUseCase(repository);
    }
}