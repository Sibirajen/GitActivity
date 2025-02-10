package com.sibirajen.gitAcitvity;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Hello world!
 *
 */
public class GitHubActivity 
{
    public static void main( String[] args) throws URISyntaxException, IOException, InterruptedException{
    	if(args.length != 1) {
    		System.out.println("Usage: java GitHubActivity <username>");
    		return;
    	}
    	
    	URI url = new URI("https://api.github.com/users/" + args[0] + "/events");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        		.uri(url)
        		.GET()
        		.build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        
        Gson gson = new Gson();
        TypeToken<List<Event>> eventType = new TypeToken<>() {};
        List<Event> events = gson.fromJson(response.body(), eventType);
        
        HashMap<String,Integer> map = new HashMap<>();
        for(Event event: events) {
        	map.put(event.getType(),map.getOrDefault(event.getType(), 0)+1);
        }
        System.out.println(map);
    }
}
