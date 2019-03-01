package com.gzeinnumer.uploadimageretrofit.server;


import com.gzeinnumer.uploadimageretrofit.model.ResponseApiModel;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiServices {

    @Multipart
    @POST("uploadimage.php")
    Call<ResponseApiModel> uploadImage (@Part MultipartBody.Part image);



}
