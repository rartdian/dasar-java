package tutorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unary adalah operasi yg dilakukan hanya satu variabel saja
		int nilai = 1;
		System.out.printf("unary minus: dari %d, menjadi %d \n", nilai, -nilai);
		System.out.printf("unary plus: dari %d menjadi %d \n", nilai, +nilai);
		
		//unary decrement and increment
		int nilaiA = 10;
		nilaiA++;
		System.out.printf("Unary 10 increment menjadi : %d\n", nilaiA);
		int nilaiB = 10;
		nilaiB--;
		System.out.printf("Unary 10 decrement menjadi : %d\n", nilaiB);
		
		//prefix dan postfix
		//prefix sebelum, nilai tambah dulu sebelum ditampilkan, akan diekseskusi sebelum ditampilkan.
		int a = 10;
		System.out.printf("Unary prefix a=10, ++a = %d\n", ++a);
		//post fix, sesudah
		//nilai ditampilkan dulu lalu dijumlah kemudian
		int b = 10;
		System.out.printf("Unary postfix b=10, b++ = %d \n", b++);
		//contoh coba kita tampilkan postfix yang sudah di jumlahkan b++
		System.out.printf("Unary postfix, nilai setelah di postfix dari nilai atas b = %d\n", b);
		
		//Unary Boolean dengan ! untuk negasi
		boolean rio = true;
		System.out.println("nilai boolean rio = "+ rio);
		System.out.println("nilai boolean !rio = "+ !rio);
	}

}
