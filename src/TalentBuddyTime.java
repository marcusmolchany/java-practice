
public class TalentBuddyTime {
	
	public static void main (String [] args) {
		convert_seconds(34565);
	}
	
    public static void convert_seconds(Integer seconds) {
        
        Integer hours = seconds / 3600;
        seconds = seconds % 3600;
        Integer minutes = seconds / 60;
        seconds = seconds % 60;
        
        String output = convertToString(hours) +
                  ":" + convertToString(minutes) +
                  ":" + convertToString(seconds);
        System.out.println(output);
    }
    
    public static String convertToString(Integer num) {
        if (num < 10) {
            return "0" + num;
        }
        
        return "" + num;
    }
}
