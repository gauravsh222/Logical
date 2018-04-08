package com.pattern.abstractfactory;

public abstract class AbstractEPFactory {
	public static AbstractEPFactory getEndPointFactory(String factory){
		if("Audio".equalsIgnoreCase(factory)) {
			return new AudioEPFactory();
		} else if("Video".equalsIgnoreCase(factory)) {
			return new VideoEPFactory();
		}
		throw new RuntimeException("No Factory Found");
	}
	
	public abstract Endpoint getEndpoint(String ep);
}
