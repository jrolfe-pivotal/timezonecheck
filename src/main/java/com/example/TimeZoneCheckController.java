package com.example;

import java.util.Calendar;
import java.util.TimeZone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeZoneCheckController {

	@RequestMapping("/")
	public String getActiveTimeZone() {
		return Calendar.getInstance().getTimeZone().getID();
	}
	
	@RequestMapping("/set")
	public void setActiveTimeZone(@RequestParam(value = "timezone", required = true) String tz) {
		TimeZone.setDefault(TimeZone.getTimeZone(tz));
	}
}
