## Laboration 1 - 1dv610
Under en veckas tid har jag arbetat med olika idéer för att bli varm i kläderna med Java. Jag började bland annat på ett mindre spel, Checkpoint Twentyfour, som är löst baserat på Papers, Please! av Lucas Pope. Jag insåg dock att projektet skulle bli för stort för den här laborationen och valde därför att gå tillbaka till min första idé: att skriva ut användarens namn med ASCII-art.

Jag tycker att idén fungerade bra eftersom jag fick öva på bland annat arrayer, loopar, metoder och strängar.

Flödet i applikationen är:

1. Användaren skriver in sitt namn.
2. Namnet kombineras med ett fördefinierat välkomstmeddelande.
3. Meddelandet sparas i en array.
4. Applikationen går igenom varje tecken och hämtar dess ASCII-representation.
5. Varje bokstav består av flera rader som sedan kombineras och skrivs ut i terminalen.

En av de större utmaningarna var att få rätt avstånd mellan bokstäverna eftersom de har olika bredder. Jag använde AI som stöd för att hitta en bra lösning på detta och har sedan gått igenom och kommenterat de delar av koden som är mer komplexa för att tydliggöra hur de fungerar.
