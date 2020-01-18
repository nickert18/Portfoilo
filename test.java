import java.util.Scanner;
	public class hihi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Geef je leeftijd in : ");
        int leeftijd = s.nextInt();
        if (leeftijd <= 9) 
            System.out.println("gratis");
        else if (leeftijd <= 20 && leeftijd >= 10) 
            System.out.println("14 euro ");
        else if (leeftijd <= 64 && leeftijd >= 21) 
            System.out.println("26 euro ");
        else if (leeftijd >= 65) 
            System.out.println("10 euro ");
    }
    }