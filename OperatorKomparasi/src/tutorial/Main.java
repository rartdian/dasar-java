package tutorial;

public class Main {

	public static void main(String[] args) {
		System.out.println("===PERSAMAAN=== \n");
		
		// TODO Auto-generated method stub

		/*
		 * Operator komparasi atau persamaan == akan menghasilkan nilai dalam bentuk boolean
		 * */
		
		int a, b;
		a = 10;
		b = 10;
		
		System.out.printf("%d apakah sama dengan %d? %s \n", a, b, (a == b));

		//ATAU
		int x, y;
		x = 5;
		y = 6;
		boolean z ;
		z = (x == y);
		System.out.println("apakah nilai "+ x +" sama dengan nilai "+ y +"? "+ z);
	
		System.out.println("===PERTIDAKSAMAAN=== \n");
		//NOT EQUAL. JIKA BEDA MAKA TRUE
		
		float p,q;
		
		 p = 1.39f;
		 q = 2.56f;
		 boolean r;
		 r = (p != q);
		//System.out.println("maks nialia float adalah : "+ Float.MAX_VALUE);
		//System.out.println("min nilai float adalah : "+ Float.MIN_VALUE);
		System.out.printf("Apakah nilai p: %f tidak samadengan nilai q: %f ? %s \n", p, q, r);
		
		System.out.println("===KURANG DARI=== \n");
		
		a = 2;
		b = 3;
		boolean hasil;
		hasil = (a < b);
		
		System.out.printf("Apakah nilai a: %d kurang dari nilai %d ? %s \n", a, b, hasil);
		
		System.out.println("===LEBIHDARI DARI=== \n");
		a = 4;
		b = 5;
		hasil = (a > b);
		System.out.printf("Apakah nilai %d lebih dari nilai %d ? %s\n", a, b, hasil);
		
		System.out.println("===KURANG DARI SAMADENGAN=== \n");
		a = 4;
		b = 4;
		hasil = (a<=b);
		System.out.printf("Apakah nilai a = %d <= nilai b = %d ? %s \n",a, b, hasil );
		
		System.out.println("===LEBIHDARI DARI SAMADENGAN=== \n");
		a = 6;
		b = 8;
		hasil = (a >= b);
		System.out.printf("Apakah nilai a : %d >= b: %d ? %s \n", a, b, hasil);
		
		
	
	}

}
