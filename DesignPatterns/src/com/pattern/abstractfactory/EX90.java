package com.pattern.abstractfactory;

public class EX90 implements Endpoint, VideoEndPoint {

	@Override
	public boolean displayVideo() {
		System.out.println("Video is displayed");
		return false;
	}

	@Override
	public boolean hideVideo() {
		System.out.println("Video is hidden");
		return false;
	}

	@Override
	public boolean connectCall() {
		System.out.println("Call is gettting connnected");
		return true;
	}

	@Override
	public boolean disconnectCall() {
		System.out.println("Call is disconnnected");
		return true;
	}
}
