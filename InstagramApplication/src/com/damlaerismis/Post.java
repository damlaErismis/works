package com.damlaerismis;

import java.util.ArrayList;

public class Post extends UserManager{

	private String caption;
	private String imageUrl;
	private String username;

	
	public Post(String caption, String imageUrl, String username) {
		super();
		this.caption = caption;
		this.imageUrl = imageUrl;
		this.username = username;
	}
	

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
}
