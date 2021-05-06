import java.time.LocalDate;
import java.time.Period;

public class AgeCal {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1987, 3, 21);
	    int years = Period.between(birthDate, today).getYears();
	    System.out.println(today);
	    System.out.println(birthDate);
	    System.out.println(years);

	}

}
