package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

	//String variable that binds to the value  property of api.weather.realtime.get.uri 
		//in the application.properties
	@Value("${api.weather.realtime.get.uri}")
	private String getRealtimeWeatherRequestURI; 
	
	//this will inject the RestTemplate bean created in AppConfig.java into this service class
	@Autowired
	private RestTemplate restTemplate;
	
	//business method or logic for consuming realtime weather api
	public RealtimeWeather getRealtimeWeather() throws WeatherServiceException {
		//consume realtime weather using getForObject method
		try {
			return restTemplate.getForObject(getRealtimeWeatherRequestURI, RealtimeWeather.class);
		} catch (RestClientResponseException e) {
			//exception message
			String message = "Error calling Get Realtime Weather API: " + e.getMessage();
			e.getStackTrace();
			throw new WeatherServiceException(message);
		}
	}
	
	
}
