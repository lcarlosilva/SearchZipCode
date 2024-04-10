package br.com.luiz.domain.models;

import com.google.gson.annotations.SerializedName;


/** In this response class we have the attributes that will be returned by two CEP APIs.
 * They are: ViaCep and CepAwesomeApi.
 * */
public class AddressResponse {
    @SerializedName("cep")
    private String cep;

    @SerializedName("address_type")
    private String addressType;

    @SerializedName("address_name")
    private String addressName;

    @SerializedName("address")
    private String address;

    @SerializedName("state")
    private String state;

    @SerializedName("district")
    private String district;

    @SerializedName("lat")
    private String lat;

    @SerializedName("lng")
    private String lng;

    @SerializedName("city")
    private String city;

    @SerializedName("city_ibge")
    private String cityIbge;

    @SerializedName("ddd")
    private String ddd;

    @SerializedName("logradouro")
    private String logradouro;

    @SerializedName("complemento")
    private String complemento;

    @SerializedName("bairro")
    private String bairro;

    @SerializedName("localidade")
    private String localidade;

    @SerializedName("uf")
    private String uf;

    @SerializedName("ibge")
    private String ibge;

    @SerializedName("gia")
    private String gia;

    @SerializedName("siafi")
    private String siafi;

    // getters and setters
}

//VIACEP
/*
"cep": "14802-157",
"logradouro": "Rua Carlos Gomes",
"complemento": "de 4000/4001 ao fim",
"bairro": "Jardim Tangará",
"localidade": "Araraquara",
"uf": "SP",
"ibge": "3503208",
"gia": "1818",
"ddd": "16",
"siafi": "6163"
*/

//CEP.AWESOMEAPI
/*
"cep": "14802157",
"address_type": "Rua",
"address_name": "Carlos Gomes",
"address": "Rua Carlos Gomes",
"state": "SP",
"district": "Jardim Tangará",
"lat": "-21.77248",
"lng": "-48.19119",
"city": "Araraquara",
"city_ibge": "3503208",
"ddd": "16"
*/