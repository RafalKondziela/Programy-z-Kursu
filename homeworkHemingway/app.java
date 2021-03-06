package homeworkHemingway;

public class app {

	public static void main(String[] args) {
		
		String text = "ERNEST HEMINGWAY STARY CZŁOWIEK I MORZE Był starym człowiekiem, który łowił ryby w Golfstromie pływając samotnie łodzią i oto już od osiemdziesięciu czterech dni nie schwytał ani jednej. Przez pierwsze czterdzieści dni pływał z nim pewien chłopiec. Ale po czterdziestu jałowych dniach rodzice oświadczyli mu, że stary jest teraz bezwzględnie i ostatecznie salao, co jest najgorszą formą określenia „pechowy” i chłopiec na ich rozkaz popłynął inną łodzią, która w pierwszym tygodniu złowiła trzy dobre ryby. Smuciło go to, że stary co dzień wraca z pustą łodzią, więc zawsze przychodził i pomagał mu odnosić zwoje linek albo osęk i harpun i żagiel owinięty dokoła masztu. Żagiel był wylatany workami od mąki, a zwinięty wyglądał jak sztandar nieodmiennej klęski. Stary był suchy i chudy, na karku miał głębokie bruzdy. Brunatne plamy po niezłośliwym raku skóry, występującym wskutek odblasku słońca na morzach tropikalnych, widniały na jego policzkach. Plamy te biegły po obu stronach twarzy, a ręce miał poorane głębokimi szramami od wyciągania linką ciężkich ryb. Ale żadna z tych szram nie była świeża. Były one tak stare jak erozje na bezrybnej pustyni. Wszystko w nim było stare prócz oczu, które miały tę samą barwę co morze i były wesołe i niezłomne. - Santiago - powiedział do niego chłopiec, kiedy wspinali się na stromy brzeg od miejsca, gdzie stała łódź wciągnięta na piasek. - Mógłbym znów z tobą popłynąć";
		
		
		
		int counter = finder.countWords(text);
		int countStary = finder.countSpecifiedWord(text, "stary");
		int countMorze = finder.countSpecifiedWord(text, "morze");
		int countLastLetters = finder.countLastTwoLetters(text, "ce");
		
		System.out.println("Tekst ma " + counter + " słów");
		System.out.println("Słowo 'stary' podawia się w tekście " + countStary + " razy");
		System.out.println("Słowo 'morze' podawia się w tekście " + countMorze + " razy");
		System.out.println("Słowa kończące się na 'ec' wystepują w tekście " + countLastLetters + " razy");
	}

	

}
