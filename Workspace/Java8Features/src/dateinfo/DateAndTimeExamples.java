package dateinfo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
//import java.time.temporal.Temporal;
import java.util.TimeZone;

public class DateAndTimeExamples {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		String timesZone[]= TimeZone.getAvailableIDs();
//		for(String s:timesZone) {
//			System.out.println(s);
//		}
		LocalDateTime ld2 = LocalDateTime.now(ZoneId.of("America/Guatemala"));
		System.out.println(ld2);
		System.out.println(ldt.getHour()+" : "+ld2.getMinute());
		
	}

}
