/*
 * Criar um m�todo que retorna true ou false se
 * um dado n�mero inteiro positivo � ou n�o
 * um n�mero primo!
 */

public class Calc {
	public boolean testaNumeroPrimo (int i) {
	int count = 0;
	if (i <= 0)
		return false;
	if (i == 1 || i == 2)
		return true;
	for (int n=1; n<i; n++)
	{
		if (i % n == 0)
			count++;
		if (count == 2)
			return false;
	}
	return true;
	}

}
