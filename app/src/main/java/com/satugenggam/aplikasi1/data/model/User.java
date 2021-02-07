package com.satugenggam.aplikasi1.data.model;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("email_verified_at")
	private Object emailVerifiedAt;

	@SerializedName("current_team_id")
	private Object currentTeamId;

	@SerializedName("avatar")
	private String avatar;

	@SerializedName("toko_id")
	private String tokoId;

	@SerializedName("active_status")
	private String activeStatus;

	@SerializedName("dark_mode")
	private String darkMode;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("provider")
	private Object provider;

	@SerializedName("two_factor_recovery_codes")
	private Object twoFactorRecoveryCodes;

	@SerializedName("name")
	private String name;

	@SerializedName("provider_id")
	private Object providerId;

	@SerializedName("id")
	private int id;

	@SerializedName("profile_photo_path")
	private Object profilePhotoPath;

	@SerializedName("two_factor_secret")
	private Object twoFactorSecret;

	@SerializedName("tipe")
	private String tipe;

	@SerializedName("email")
	private String email;

	@SerializedName("messenger_color")
	private String messengerColor;

	public String getCreatedAt(){
		return createdAt;
	}

	public Object getEmailVerifiedAt(){
		return emailVerifiedAt;
	}

	public Object getCurrentTeamId(){
		return currentTeamId;
	}

	public String getAvatar(){
		return avatar;
	}

	public String getTokoId(){
		return tokoId;
	}

	public String getActiveStatus(){
		return activeStatus;
	}

	public String getDarkMode(){
		return darkMode;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public Object getProvider(){
		return provider;
	}

	public Object getTwoFactorRecoveryCodes(){
		return twoFactorRecoveryCodes;
	}

	public String getName(){
		return name;
	}

	public Object getProviderId(){
		return providerId;
	}

	public int getId(){
		return id;
	}

	public Object getProfilePhotoPath(){
		return profilePhotoPath;
	}

	public Object getTwoFactorSecret(){
		return twoFactorSecret;
	}

	public String getTipe(){
		return tipe;
	}

	public String getEmail(){
		return email;
	}

	public String getMessengerColor(){
		return messengerColor;
	}
}