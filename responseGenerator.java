
public class responseGenerator {

    public String getResponse(String input) {

	int rng = (int) (Math.random() * 10);
	System.out.println(rng);

	if (input.contains("?")) {
	    if (input.contains("Hva")) {
		if (rng >= 7) {
		    return "Masserart med sukker p�";
		} else if (rng >= 5) {
		    return "Hvorfor lurer du p� det? ";
		} else if (input.contains("Hva har")) {
		    if (rng >= 25) {
			return "Det er s� mye at du aner ikke!";
		    } else if (rng >= 0) {
			return "Det kan v�re mye rart!";
		    }
		} else if (input.contains("Hva er")) {
		    if (rng >= 0) {
			return "Det lurer jeg ogs� p�!";
		    }
		} else if (input.contains("Hva synes du")) {
		    String tema = input.substring(input.indexOf("Hva synes du") + "Hva synes du".length(),
			    input.length() - 1);
		    if (rng >= 75) {
			return "Hva jeg mener" + tema + " orker jeg ikke diskutere";
		    } else if (rng >= 50) {
			return "Mine meninger" + tema + " kunne st�te noen her";
		    } else if (input.contains("Hva synes du om")) {
			if (rng >= 25) {
			    return "Det synes jeg fint lite om";
			} else if (rng >= 0) {
			    return "Jeg synes det ikke er til � holde ut!";
			}
		    } else if (input.contains("Hva synes du at")) {
			if (rng >= 25) {
			    return "Jeg har ikke bestemt meg om det";
			} else if (rng >= 0) {
			    return "Det har ikke jeg lyst � bestemme";
			}
		    }
		}
	    } else if (input.contains("Har du")) {
		if (input.contains("Har du det bra")) {

		    if (rng >= 75) {
			return "Jaa, jeg har det s� braaa!";
		    } else if (rng >= 50) {
			return "Sure. Hva ellers";
		    } else if (rng >= 25) {
			return "Selvsagt! Hva skulle jeg allers svare?";
		    } else if (rng >= 0) {
			return "Nei, jeg f�ler meg grusomt :(";
		    }
		} else if (rng >= 66) {
		    return "Hva tror du?";
		} else if (rng >= 33) {
		    return "Selvsagt";
		} else if (rng >= 0) {
		    return "Selvf�lgelig ikke";
		}
	    } else if (input.contains("Hvorfor")) {
		if (rng >= 80) {
		    return "Gudene vet";
		} else if (rng >= 60) {
		    return "Jeg skulle  til � sp�rre om det samme";
		} else if (rng >= 40) {
		    return "Verden er full av mysterier";
		} else if (rng >= 20) {
		    return "Det lurer jeg ogs� p�";
		} else if (rng >= 0) {
		    return "The million dollar question!";
		}

	    } else if (input.contains("N�r")) {
		if (rng >= 75) {
		    return "Jeg vet ikke, og det er krise!";
		} else if (rng >= 50) {
		    return "Jeg husker ikke, h�per det ikke er krise";
		} else if (rng >= 25) {
		    return "Det lurer jeg ogs� p�";
		} else if (rng >= 0) {
		    return "The million dollar question!";
		}
	    }
	} else if (input.contains("Hei")) {
	    if (rng >= 75) {
		return "Hei p� deg";
	    } else if (rng >= 50) {
		return "Halla";
	    } else if (rng >= 25) {
		return "Yo";
	    } else if (rng >= 0) {
		return "Wazzap";
	    }
	} else if (input.contains("Jeg har")) {
	    if (rng >= 66) {
		return "Du gjorde hva?";
	    } else if (rng >= 33) {
		return "S� fint for deg da";
	    } else if (rng >= 0) {
		return "Kondolerer!";
	    }
	} else if (input.contains("Jeg liker")) {
	    if (rng >= 66) {
		return "Du liker hva?";
	    } else if (rng >= 33) {
		return "Ja, det er en av de f�, gode ting her i verden";
	    } else if (rng >= 0) {
		return "Er du g��rn!";
	    }
	} else if (input.contains("d�d")) {
	    if (rng >= 0) {
		return "Ja, er det ikke typisk, alt g�r alltid galt";
	    }
	}
	return "Ingen kommentar";
    }

}
