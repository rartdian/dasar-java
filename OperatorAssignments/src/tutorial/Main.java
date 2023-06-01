package tutorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Operator Assignments
		//int a = 1;
		//jikan mau nambahkan nilai 5 amaka kalau aritmatik a = 1; a = a+5;
		//tanda samadengan adalah assignment untuk melaukakn lebih gampang makaa
		//a += 10; a ditambah sama dengan 10;
		//berlaku semua operator aritmatika
		
		//cara aritmatik
		int a = 10;
		a = a+10;
		System.out.println("=====cara aritmatik====");
		System.out.println("a + 10 = "+ a +"\n");
		
		System.out.println("====cara assignments====");
		System.out.println("penjumlahan \n");
		int x = 10;
		x += 10;
		System.out.println("x = 10, x+= 10 maka x= "+x);
		
		System.out.println("pengurangan \n");
		int y = 10;
		y -= 3;
		System.out.println("nilai y = 10 dikurangi samadengan 3 adalah "+ y +"\n");
	System.out.println("dan juga bisa perkalian * pembagian / modulus %");
	
	//contoh
	int b = 10;
	b*= 5;
	System.out.println("nilai b = 10 dikali samadegnan 5 = "+b+"\n");// b = 10 dikali 5 disimpan var b
	
	int c = 10;
	c/=2;
	
	System.out.println("nilai c = 10, dibagi samadengan 2 = "+c+"\n");
	
	int z = 25;
	z %= 6;
	System.out.println("nilai z = 25 di bagi samadengan 6 maka sisa hasil bagi adlaha="+z+"\n");
	
int nilai = 5;
nilai--;
nilai++;
nilai = nilai - 4;
nilai = nilai + 1;
System.out.println("hasil : "+nilai);
	
	}

}
