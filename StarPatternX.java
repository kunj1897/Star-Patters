
public class StarPatternX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=5; j++) 
		{
			if(i==j || i+j==5-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
			System.out.println();
		}
	}
}
