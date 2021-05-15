
public class CheckedId {

	public static String Checked(Customer customer) {

		int totalX = 0;
		int totalY = 0;

		int value[] = new int[11];
		String tc = customer.getNationalityId();

		for (int count = 0; count < 11; count++) {
			
			value[count] = Integer.parseUnsignedInt(String.valueOf(tc.charAt(count)));
			if (count % 2 == 0 || count == 0) {
				totalX =totalX +value[count];
			} else {
				totalY =totalY +value[count];
			}
		}
		int calculate = (((totalX*7)+(totalY*9))%10);
		int manuelTotal=(((value[0]+value[2]+value[4]+value[6]+value[8]+value[10])*7)+
				((value[1]+value[3]+value[5]+value[7])*9)%10);
		return (totalX+"-"+totalY +"="+ calculate+"manuelTotal "+manuelTotal);

	}
}
