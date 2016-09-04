
public class Startup {

    static responseGenerator sentenceTemplates;

    public static void main(String[] args) {

	sentenceTemplates = new responseGenerator();

	lesLinje("Hei, NyBot");
	lesLinje("Har du det bra?");
	lesLinje("Hva har du gjort idag?");
	lesLinje("Jeg har vært en tur i byen og handlet");
	lesLinje("Min bestemor er død");
	lesLinje("Når betalte du NRK-lisensen?");
	lesLinje("Hva synes du om MDG?");
	lesLinje("Hva har du på deg?");
	lesLinje("Hvorfor er du så rar?");
	lesLinje("Jeg liker katter");
    }

    private static void lesLinje(String textInput) { // motta tekst
	System.out.println("Du sier: " + textInput);
	System.out.println("NyBot sier: " + lagRespons(textInput));
    }

    private static String lagRespons(String textInput) { // generer svar
	return sentenceTemplates.getResponse(textInput);
    }

}
