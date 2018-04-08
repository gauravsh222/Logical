package com.pattern.factory;

public class TravelFactory {
	private enum TravelType {
		FLY{
			public Way getWay(){
				return new Flight();
			}
		},
		ROAD{
			public Way getWay(){
				return new Bus();
			}
		},
		Rail{
			public Way getWay(){
				return new Train();
			}
		};
		public abstract Way getWay();
	}
	public static Way getInstance(String way) {
		return TravelType.valueOf(way).getWay();
	}
}
