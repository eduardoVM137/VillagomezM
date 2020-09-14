
public class Fibo {

	public static void main(String[] args) {



		int Num2=0,Num=1;
		int i=0;
		String _strResutado="";
		
		do		
		{
			int Num3=Num+Num2;
			Num=Num2;
			Num2=Num3;
					i++;
			_strResutado+=Num3+"\n";
		}	while(i<10);
		
		
		
		System.out.println(_strResutado);
	

	}
}
