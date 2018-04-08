package com.pattern.abstractfactory;

public class AudioEPFactory extends AbstractEPFactory {
	public Endpoint getEndpoint(String ep) {
		if("IP1".equals(ep)){
			IP1 ip = new IP1();
			return ip;
		} else if("IP2".equals(ep)) {
			return new IP2();
		} else if("IP3".equals(ep)) {
			return new IP3();
		}
		throw new RuntimeException("Audio Device not found");
	}
}
