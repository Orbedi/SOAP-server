package com.crossfit.youtube;

public class youtubeSOAPImpl implements Youtube {
	
	@Override
	public String changeVideo(String url) {
		if(!url.contains("www.youtube.com/watch?")) return "";
		if(url.contains("&")) {
			return url.substring(url.indexOf("v=")+2,url.indexOf("&"));
		} else {
			return url.substring(url.indexOf("v=")+2);
		}
	}
}
