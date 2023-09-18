package egovframework.ddan.vo;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LocationVo {
	
	
	@JsonProperty("latitude")
	private String latitude;
	
	@JsonProperty("longitude")
	private String longitude;
	
	@JsonProperty("android_id")
	private String android_id;
	
	@JsonProperty("noise")
	private int noise;
	
	@JsonProperty("rpm")
	private int rpm; 
	
	@JsonProperty("car_num")
	private String car_num;
	
	private String date;
	private String time;
	
}
