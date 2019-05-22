package com.crossfit.youtube;

public class youtubeSOAPImpl implements Youtube {
	
	@Override
	public String changeVideo(String url) throws QueryInvalidURL {
		if(!url.contains("www.youtube.com/watch?")) throw new QueryInvalidURL("Invalid URL: ", url);
		if(url.contains("&")) {
			return url.substring(url.indexOf("v=")+2,url.indexOf("&"));
		} else {
			return url.substring(url.indexOf("v=")+2);
		}
	}
}