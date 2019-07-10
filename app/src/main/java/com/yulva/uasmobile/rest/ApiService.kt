package com.yulva.uasmobile.rest


import com.yulva.uasmobile.BuildConfig
import com.yulva.uasmobile.model.RootDataModel
import retrofit.http.GET
import rx.Observable

interface ApiService {
    // http://informatika.upgris.ac.id/mobile/data/index.php/api/example/detil_jadwal?key=33c227f799464dac08f60f1b0d5770&npm=16670066
    @GET("detil_jadwal?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getJadwalKuliah(
    ): Observable<RootDataModel>

    @GET("detil_pribadi?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getProfil(
    ): Observable<RootDataModel>

}