package br.com.luiz.searchzipcode.ui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import javax.inject.Inject;

import br.com.luiz.searchzipcode.R;
import br.com.luiz.searchzipcode.presentation.SearchZipCodeViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import okhttp3.OkHttpClient;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    OkHttpClient mOkHttpClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        SearchZipCodeViewModel viewModel = new ViewModelProvider(this).get(SearchZipCodeViewModel.class);

        viewModel.searchZipCode("14802157");

        // Exemplo de requisição GET com OkHttp
        // String url = "https://viacep.com.br/ws/14802157/json/";
        // String url = "https://cep.awesomeapi.com.br/json/14802157";
        /*mOkHttpClient.newCall(new okhttp3.Request.Builder().url(url).build()).enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(@NonNull okhttp3.Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(@NonNull okhttp3.Call call, @NonNull okhttp3.Response response) throws IOException {
                System.out.println(response.body().string());
            }
        });*/
    }
}