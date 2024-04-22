package br.com.luiz.searchzipcode.presentation;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import br.com.luiz.domain.usecase.SearchZipCodeUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

@HiltViewModel
public class SearchZipCodeViewModel extends ViewModel {

    private final SearchZipCodeUseCase searchZipCodeUseCase;

    @Inject
    public SearchZipCodeViewModel(SearchZipCodeUseCase searchZipCodeUseCase) {
        this.searchZipCodeUseCase = searchZipCodeUseCase;
    }

    public void searchZipCode(String zipCode) {
        searchZipCodeUseCase.searchZipCode(zipCode)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        data -> {
                            System.out.println(data.getAddress());
                        },
                        error -> {
                            System.out.println(error);
                        },
                        () -> {
                            System.out.println("Completed");
                        }
                );
    }
}
