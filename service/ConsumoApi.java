package br.com.api.api.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

	public String obterDados(String endereco) {
		
		HttpClient client = HttpClient.newHttpClient(); // Client
	    HttpRequest request = HttpRequest.newBuilder() // Create an URI to refer what address to make a request
	            .uri(URI.create(endereco))
	            .build();
	    HttpResponse<String> response = null;
	    try {	// try to receive a response
	        response = client	
	                .send(request, HttpResponse.BodyHandlers.ofString()); // client send request and receive a response
	    } catch (IOException e) {	// An address could be wrong, so these are exception
	        throw new RuntimeException(e);
	    } catch (InterruptedException e) {
	        throw new RuntimeException(e);
	    }

	    String json = response.body();
	    return json;
		
	}
	
}
