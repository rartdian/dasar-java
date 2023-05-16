package com.tutorial;
import java.lang.StringBuilder;
public class Main {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("hallo");
		CetakData(builder);
		
		//StringBuilder memiliki capacity	

		
		//jika concat membuat memory baru
	}
	
	
	private static void CetakData(StringBuilder dataBuilder) {
		System.out.println("data = "+ dataBuilder);
		System.out.println("panjang = "+dataBuilder.length());
		System.out.println("kapasitas = "+ dataBuilder.capacity());
		
		int addressBuilder = System.identityHashCode(dataBuilder);
		System.out.println("Address = "+Integer.toHexString(addressBuilder));
	}

}
