package br.com.luiz.searchzipcode;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

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

        ((SearchZipCodeApp)getApplication()).getSearchZipCodeAppComponent().inject(this);

        String url = "https://viacep.com.br/ws/14802157/json/";
//        String url = "https://cep.awesomeapi.com.br/json/14802157";
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