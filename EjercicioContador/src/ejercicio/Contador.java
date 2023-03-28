package ejercicio;

public class Contador 
{
	//------Atributos--------
	private int contador;
	private int maximo;
	//------GETTERS--------
	public int getContador() 
	{
		return contador;
	}
	public int getMaximo() 
	{
		return maximo;
	}
	public Contador(int contador,int maximo) 
	{
		this.contador=contador;
		this.maximo=maximo;
	}
	
	
	 public void resetearContador() 
	 {
		 this.contador=0;
	 }
	 public void incrementarContador(int max) 
	 {
		 this.maximo=max;
		 if(this.contador==this.maximo)
			 resetearContador();
		 
		 this.contador++;
		 System.out.println("CONTADOR= "+this.contador);
	 }
}
