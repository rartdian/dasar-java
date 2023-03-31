package operatorAritmatika;

public class tutorial {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		int variableA = 8;
		int variableB = 4;
		int hasil;
hasil = variableA + variableB;
//penjumlahan
System.out.println(variableA + " + " + variableB + " = " + hasil);
//pengurangan
hasil = variableA - variableB;
System.out.printf("%d - %d = %d \n", variableA, variableB, hasil);
//perkalian

hasil = variableA * variableB;
System.out.printf("%d x %d = %d \n", variableA, variableB, hasil);

//pembagian
hasil = variableA / variableB;
System.out.printf("%d / %d = %d \n", variableA, variableB, hasil);

//modulus, sisabagi hasil
hasil = variableA % variableB;
System.out.printf("%d %% %d = %d \n", variableA, variableB, hasil);
	}

}
