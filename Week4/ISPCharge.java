import javax.swing.JOptionPane;

public class ISPCharge
{
	public static void main ( String[] args )
	{
		double totalChargeForPackageA = 0.0;
		double totalChargeForPackageB = 0.0;
		double totalChargeForPackageC = 19.95;
		int numberOfHoursUsed;
		String packagePurchased;
		boolean invalidPackage = true;
		
		numberOfHoursUsed = Integer.parseInt( 
			JOptionPane.showInputDialog("Enter the numbers of hours you spent online") );
		
		totalChargeForPackageA = 9.95;
		if ( numberOfHoursUsed > 10 )
		{
			totalChargeForPackageA += ( numberOfHoursUsed - 10 ) * 2;
		}

		totalChargeForPackageB = 13.95;
		if ( numberOfHoursUsed > 20 )
		{
			totalChargeForPackageB += ( numberOfHoursUsed - 20 );
		}

		
		while ( invalidPackage )
		{
			packagePurchased = 
				JOptionPane.showInputDialog("Enter the package you purchased: A, B, or C");
			invalidPackage = false;
			
			switch ( packagePurchased )
			{
				case "A" :
				case "a" :
					JOptionPane.showMessageDialog(null, 
						"Your total charge is: $" + totalChargeForPackageA);
					if ( totalChargeForPackageA > totalChargeForPackageB )
					{
						JOptionPane.showMessageDialog(null,"You could have saved: $"
							+ ( totalChargeForPackageA - totalChargeForPackageB )
							+ " if you had purchased Package B");
					}
					if ( totalChargeForPackageA > totalChargeForPackageC )
					{
						JOptionPane.showMessageDialog(null,"You could have saved: $"
							+ ( totalChargeForPackageA - totalChargeForPackageC )
							+ " if you had purchased Package C");
					}
					break;
				case "B" :
				case "b" :
					JOptionPane.showMessageDialog(null, 
						"Your total charge is: $" + totalChargeForPackageB);
					if ( totalChargeForPackageB > totalChargeForPackageC )
					{
						JOptionPane.showMessageDialog(null,"You could have saved: $"
							+ ( totalChargeForPackageB - totalChargeForPackageC )
							+ " if you had purchased Package C");
					}
					break;
				case "C" :
				case "c" :
					JOptionPane.showMessageDialog(null, 
						"Your total charge is: $" + totalChargeForPackageC);
					break;
				default:
					invalidPackage = true;
					JOptionPane.showMessageDialog(null,"You must pick package A, B, or C");
			}
		}
		System.exit(0);
	}
}