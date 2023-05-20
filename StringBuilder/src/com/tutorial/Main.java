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
		
		//insert, menambahkan kata pada kalimat di memory yg sama sesuai kapasitas panjang memory
		builder.insert(11, " kelurahan"); //menambahkan pada index alphabet ke 11
		CetakData(builder); //
		
		
		//delete string di alamat yg sama
		builder.delete(12, 22);
		CetakData(builder);
		
		//merubah Alphabet pada index tertentu
		builder.setCharAt(0, 'H');
		builder.setCharAt(6, 'W');
		CetakData(builder);
		
//		replace
		builder.replace(12, 18, "podosugih");
		System.out.println(builder+"\n");
		
		
		//casting menjadi String
		String kalimat = builder.toString();
		System.out.println(kalimat);
		int addresString = System.identityHashCode(kalimat);
		System.out.println("address "+Integer.toHexString(addresString)); //selanjutnya bisa melakukan equality dsb ?
	}
	
	
	private static void CetakData(StringBuilder dataBuilder) {
		System.out.println("data = "+ dataBuilder);
		System.out.println("panjang = "+dataBuilder.length());
		System.out.println("kapasitas = "+ dataBuilder.capacity());
		
		int addressBuilder = System.identityHashCode(dataBuilder);
		System.out.println("Address = "+Integer.toHexString(addressBuilder)+"\n");
	}

}
