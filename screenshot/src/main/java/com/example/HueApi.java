package com.example;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.PUT;
import retrofit.http.Path;

public interface HueApi {

  String HUE_BRIDGE_IP = "http://192.168.1.140/";
  String HUE_USER = "58d8a2b622041b651ca19b6c418d568b";
  String HUE_PATH = "/api/" + HUE_USER + "/";

  @PUT(HUE_PATH + "lights/{light}/state")
  Call<ResponseState> changeLight(@Path("light") int light, @Body State state);
}