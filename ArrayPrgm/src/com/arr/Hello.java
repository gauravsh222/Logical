package com.arr;

public enum Hello {
	JAN(31) {
		@Override
		public void m1() {
			// TODO Auto-generated method stub
			
		}
	}, Feb(28) {
		@Override
		public void m1() {
			// TODO Auto-generated method stub
			
		}
	};
	int i;
	private Hello(int i) {
		this.i=i;
	}
	public abstract void m1();
}
