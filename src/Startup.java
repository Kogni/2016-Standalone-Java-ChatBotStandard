
public class Startup {

    static objectSentenceTemplate[] sentenceTemplates;

    public static void main(String[] args) {

	sentenceTemplates = new objectSentenceTemplate[5];
	sentenceTemplates[0] = new objectSentenceTemplate("Hei", "Hei på deg");
	sentenceTemplates[1] = new objectSentenceTemplate("Hva", "Masserart med sukker på");
	sentenceTemplates[2] = new objectSentenceTemplate("Har du", "Jepp");
	sentenceTemplates[3] = new objectSentenceTemplate("Jeg har", "Så bra!");
	sentenceTemplates[4] = new objectSentenceTemplate("død", "Uffameg!");

	lesLinje("Hei, NyBot");
	lesLinje("Har du det bra?");
	lesLinje("Hva har du gjort idag?");
	lesLinje("Jeg har vært en tur i byen og handlet");
	lesLinje("Min bestemor er død");
	lesLinje("Når betalte du NRK-lisensen?");
    }

    private static void lesLinje(String textInput) { // motta tekst
	System.out.println("Du sier: " + textInput);
	System.out.println("NyBot sier: " + lagRespons(textInput));
    }

    private static String lagRespons(String textInput) { // generer svar
	for (int X = 0; X < sentenceTemplates.length; X++) {
	    if (textInput.toLowerCase().contains(sentenceTemplates[X].trigger.toLowerCase())) {
		return sentenceTemplates[X].respons;
	    }
	}
	return "Så fint vær vi har idag!";
    }

}
