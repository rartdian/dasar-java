package com.tutorial;
import java.lang.StringBuilder;
public class Main {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("hallo");
		CetakData(builder);
		
		//StringBuilder memiliki capacity	

		
		//jika concat membuat memory baru jika append tidak
		//operasi string untuk menambahkan kata atau kalimat tidak menambah di memory dengan append
		builder.append(" warga medono");
		
		CetakData(builder);
		
	
	}
	
	
	private static void CetakData(StringBuilder dataBuilder) {
		System.out.println("data = "+ dataBuilder);
		System.out.println("panjang = "+dataBuilder.length());
		System.out.println("kapasitas = "+ dataBuilder.capacity());
		
		int addressBuilder = System.identityHashCode(dataBuilder);
		System.out.println("Address = "+Integer.toHexString(addressBuilder)+"\n");
	}

}
