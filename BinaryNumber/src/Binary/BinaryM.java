package Binary;

public class BinaryM {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		BinaryNumber a = new BinaryNumber(5);
		//BinaryNumber a1 = new BinaryNumber(-5);
		
		System.out.println(a);
		//System.out.println(a1);
		BinaryNumber b = new BinaryNumber("01011");
		//BinaryNumber b1 = new BinaryNumber("");
		//BinaryNumber c = new BinaryNumber("1001");
		System.out.println(b);
		System.out.println(b.getLength());
		System.out.println(b.getDigit(1));
		//b.shiftR(1);
		//System.out.println(b)
		//System.out.println(c);
		a.clearOverflow();

		System.out.println(a.getLength());

		System.out.println(b.toDecimal());
		System.out.println(b.toString());
		System.out.println("----------");
		BinaryNumber x = new BinaryNumber("10110");
		BinaryNumber y = new BinaryNumber("11100");
		x.add(y);
		System.out.println(x);
		
	}

}
