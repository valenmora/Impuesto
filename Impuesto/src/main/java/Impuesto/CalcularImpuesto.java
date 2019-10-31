package Impuesto;

public class CalcularImpuesto {

	private static double resultadoIVA;
	private static double resultadoBruto;
	
	public CalcularImpuesto(){ }
	
	public static void CalculoImpuesto(int ivaUno, int ivaDos, int brutoUno, int brutoDos) {
		
		try
		{
			if(brutoDos != 0 && brutoUno != 0 && ivaDos != 0 && ivaUno != 0)
			{ 
				resultadoIVA = ((ivaDos * ivaUno)/100 + ivaUno) ;
				resultadoBruto = ((brutoDos * brutoUno)/100 + brutoUno);
				
			}
			else
			{
				System.out.println("Error. Complete todos los campos.... ");
			}
		} 
		catch (Exception e)
		{
			System.out.println("ERROR..... ");
		}
	}

	public static double getResultadoIVA() {
		return resultadoIVA;
	}

	public static void setResultadoIVA(double resultadoIVA) {
		CalcularImpuesto.resultadoIVA = resultadoIVA;
	}

	public static double getResultadoBruto() {
		return resultadoBruto;
	}

	public static void setResultadoBruto(double resultadoBruto) {
		CalcularImpuesto.resultadoBruto = resultadoBruto;
	}	
}
