package com.pattern.abstractfactory;

public class Test {
	public static void main(String[] args) {
		AbstractEPFactory factory = AbstractEPFactory.getEndPointFactory("Audio");
		Endpoint ep = factory.getEndpoint("IP1");
		ep.connectCall();
		ep.disconnectCall();
	}
}
