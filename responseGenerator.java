
public class responseGenerator {

    public String getResponse(String input) {

	int rng = (int) (Math.random() * 100);

	if (input.contains("?")) {
	    if (input.contains("Hva")) {
		if (rng >= 75) {
		    return "Masserart med sukker p�";
		}
		if (rng >= 50) {
		    return "Hvorfor lurer du p� det? ";
		}
		if (input.contains("Hva har")) {
		    if (rng >= 25) {
			return "Det er s� mye at du aner ikke!";
		    }
		    if (rng >= 0) {
			return "Det kan v�re mye rart!";
		    }
		}
		if (input.contains("Hva er")) {
		    if (rng >= 0) {
			return "Det lurer jeg ogs� p�!";
		    }
		}
		if (input.contains("Hva synes du")) {
		    String tema = input.substring(input.indexOf("Hva synes du") + "Hva synes du".length(),
			    input.length() - 1);
		    if (rng >= 75) {
			return "Hva jeg mener" + tema + " orker jeg ikke diskutere";
		    }
		    if (rng >= 50) {
			return "Mine meninger" + tema + " kunne st�te noen her";
		    }
		    if (input.contains("Hva synes du om")) {
			if (rng >= 25) {
			    return "Det synes jeg fint lite om";
			}
			if (rng >= 0) {
			    return "Jeg synes det ikke er til � holde ut!";
			}
		    }
		    if (input.contains("Hva synes du at")) {
			if (rng >= 25) {
			    return "Jeg har ikke bestemt meg om det";
			}
			if (rng >= 0) {
			    return "Det har ikke jeg lyst � bestemme";
			}
		    }
		}
	    }
	    if (input.contains("Har du")) {
		if (input.contains("Har du det bra")) {
		    if (rng >= 75) {
			return "Jaa, jeg har det s� braaa!";
		    }
		    if (rng >= 50) {
			return "Sure. Hva ellers";
		    }
		    if (rng >= 25) {
			return "Selvsagt! Hva skulle jeg allers svare?";
		    }
		    if (rng >= 0) {
			return "Nei, jeg f�ler meg grusomt :(";
		    }
		}
		if (rng >= 66) {
		    return "Hva tror du?";
		}
		if (rng >= 33) {
		    return "Selvsagt";
		}
		if (rng >= 0) {
		    return "Selvf�lgelig ikke";
		}
	    }
	    if (input.contains("Hvorfor")) {
		if (rng >= 80) {
		    return "Gudene vet";
		}
		if (rng >= 60) {
		    return "Jeg skulle  til � sp�rre om det samme";
		}
		if (rng >= 40) {
		    return "Verden er full av mysterier";
		}
		if (rng >= 20) {
		    return "Det lurer jeg ogs� p�";
		}
		if (rng >= 0) {
		    return "The million dollar question!";
		}

	    }
	    if (input.contains("N�r")) {
		if (rng >= 75) {
		    return "Jeg vet ikke, og det er krise!";
		}
		if (rng >= 50) {
		    return "Jeg husker ikke, h�per det ikke er krise";
		}
		if (rng >= 25) {
		    return "Det lurer jeg ogs� p�";
		}
		if (rng >= 0) {
		    return "The million dollar question!";
		}
	    }
	}
	if (input.contains("Hei")) {
	    if (rng >= 75) {
		return "Hei p� deg";
	    }
	    if (rng >= 50) {
		return "Halla";
	    }
	    if (rng >= 25) {
		return "Yo";
	    }
	    if (rng >= 0) {
		return "Wazzap";
	    }
	}
	if (input.contains("Jeg har")) {
	    if (rng >= 66) {
		return "Du gjorde hva?";
	    }
	    if (rng >= 33) {
		return "S� fint for deg da";
	    }
	    if (rng >= 0) {
		return "Kondolerer!";
	    }
	}
	if (input.contains("Jeg liker")) {
	    if (rng >= 66) {
		return "Du liker hva?";
	    }
	    if (rng >= 33) {
		return "Ja, det er en av de f�, gode ting her i verden";
	    }
	    if (rng >= 0) {
		return "Er du g��rn!";
	    }
	}
	if (input.contains("d�d")) {
	    if (rng >= 0) {
		return "Ja, er det ikke typisk, alt g�r alltid galt";
	    }
	}
	return "Ingen kommentar";
    }

}
