package com.mycompany;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RealtimeWeather {

	private String location;
	
	//for temperature value range
//	@Range(min = -50, max = 50, message = "Temperature must be in the range of -50 to 50 Celsius degree")
	private int temperature;
	
//	@Range(min = 0, max = 100, message = "Humidity must be in the range of 0 to 100 percentage")
	private int humidity;
	
//	@Range(min = 0, max = 100, message = "Percipitation must be in the range of 0 to 100 percentage")
	private int precipitation;
	
	@JsonProperty("wind_speed")
//	@Range(min = 0, max = 200, message = "Wind speed must be in the range of 0 to 200 km/h")
	private int windSpeed; 
	
//	@Column(length = 50)
//	@NotBlank(message = "Status must not be empty")
//	@Length(min = 3, max = 50, message = "Status must be in between 3 - 50 characters")
	private String status;
	
	@JsonProperty("last_updated")
//	@JsonIgnore //as per the api document last updated time should not be included in the requestbody when updating realtimeweather data
	private Date lastUpdated;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(int precipitation) {
		this.precipitation = precipitation;
	}

	public int getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		return "RealtimeWeather [location=" + location + ", temperature=" + temperature + ", humidity="
				+ humidity + ", precipitation=" + precipitation + ", windSpeed=" + windSpeed + ", status=" + status
				+ ", lastUpdated=" + lastUpdated + "]";
	}
	
	
}
