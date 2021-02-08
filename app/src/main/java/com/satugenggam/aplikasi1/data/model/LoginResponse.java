package com.satugenggam.aplikasi1.data.model;

import com.google.gson.annotations.SerializedName;

public class LoginResponse{

	@SerializedName("access_token")
	private String accessToken;

	@SerializedName("token_type")
	private String tokenType;

	@SerializedName("expires_in")
	private int expiresIn;

	@SerializedName("user")
	private UserLoginResponse userLoginResponse;

	public String getAccessToken(){
		return accessToken;
	}

	public String getTokenType(){
		return tokenType;
	}

	public int getExpiresIn(){
		return expiresIn;
	}

	public UserLoginResponse getUserLoginResponse(){
		return userLoginResponse;
	}
}