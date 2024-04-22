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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityIbge() {
        return cityIbge;
    }

    public void setCityIbge(String cityIbge) {
        this.cityIbge = cityIbge;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

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