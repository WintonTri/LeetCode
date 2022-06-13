package inprogress;

import java.util.HashMap;

// Attempt 1 Completed -> 06/12/2022
public class Question535 {

    // Key = encoded value / shortUrl
    // Value = decoded value / longUrl
    public HashMap<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String encoded = longUrl.hashCode() + ""; // "" to turn string type
        map.put(encoded,longUrl);
        return encoded;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.getOrDefault(shortUrl, "");
    }

}
