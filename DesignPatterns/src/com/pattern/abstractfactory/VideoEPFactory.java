package com.pattern.abstractfactory;

public class VideoEPFactory extends AbstractEPFactory {
	public Endpoint getEndpoint(String ep) {
		if("SX10".equals(ep)){
			return new SX10();
		} else if("EX90".equals(ep)) {
			return new EX90();
		} else if("EX80".equals(ep)) {
			return new EX80();
		}
		throw new RuntimeException("Video Device not found");
	}
}
