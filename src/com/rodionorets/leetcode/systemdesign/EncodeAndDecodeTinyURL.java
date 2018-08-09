package com.rodionorets.leetcode.systemdesign;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class EncodeAndDecodeTinyURL {

    public static class Codec {
        private static final String TINY_URL_DOMAIN = "http://tinyurl.com/";

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            return TINY_URL_DOMAIN + encodePath(getPath(longUrl));
        }

        private String encodePath(String localPath) {
            return "";
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return decodePath(getPath(shortUrl));
        }

        private String decodePath(String localPath) {
            return "";
        }

        private String getPath(String url) {
            String path = null;
            try {
                path = new URI(url).getPath();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
            return path;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
