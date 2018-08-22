
public class Projeto1 {
	public static void main (String[] args) {
	System.out.println("1243");	
	Calc c = new Calc();
	People p = new People(10, "Maria", 123.45f);
	System.out.println(p);
	int x = 123;
	if(c.testaNumeroPrimo(x) == true)
		System.out.println("É primo!");
	else
		System.out.println("Não é primo!");
	}
}
