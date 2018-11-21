package binary;
import java.math.*;

public class BinaryToDecimalConverter
{

	public static int binaryToDecimal(String binaryString)
	{
		int leftMostPower = 0;
		String binary;
		if (binaryString.length() <= 0)
		{
			return 0;
		}
		else
		{
		
			if (binaryString.startsWith("1"))
			{
				leftMostPower = (int) Math.pow(2,binaryString.length()-1);
				binary = binaryString.substring(1, binaryString.length());
				return leftMostPower + binaryToDecimal(binary);
			}
			else
			{
				binary = binaryString.substring(1, binaryString.length());
				return binaryToDecimal(binary);
			}
			
			
			/**decimal = 0;
			//decimal = decimal + leftMostPower;
		//	leftMostPower = 2^(binaryString.length() - 1);
			
			decimal = binaryToDecimal(binary);**/
				
		}
	}
}
