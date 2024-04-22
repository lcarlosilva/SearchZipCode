package br.com.luiz.searchzipcode.di;

import br.com.luiz.data.di.DataModule;
import br.com.luiz.domain.di.DomainModule;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module(includes = {DataModule.class, DomainModule.class})
@InstallIn(SingletonComponent.class)
public class SearchZipCodeAppModule { }
