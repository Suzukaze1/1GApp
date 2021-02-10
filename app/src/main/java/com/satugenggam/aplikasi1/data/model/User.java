package com.satugenggam.aplikasi1.data.model;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name")
	private String name;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("email")
	private String email;

	@SerializedName("toko_id")
	private String tokoId;

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getName(){
		return name;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public int getId(){
		return id;
	}

	public String getEmail(){
		return email;
	}

	public String getTokoId(){
		return tokoId;
	}
}