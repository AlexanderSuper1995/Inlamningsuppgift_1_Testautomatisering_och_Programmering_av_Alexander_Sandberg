Inlämningsuppgift 1
Testautomatisering och Programmering
 Skapa ett program utifrån Krav som står på nästa
slide
 Lämna in en textfil där länken till ditt publika github-
repo finns tillgängligt
Krav:
 Skriv ett program som gör om morsekod till engelska
och engelska till morsekod
 Skriv programmet med minst en logikklass samt en
klass som läser in text och skriver ut text (med en
main-metod)
Använd den internationella morsekoden (se slide 4)
 Utveckla programmet i TDD och skriv minst 3 JUnit-
testfall
Skapa minst två felhanteringar i systemet som fångar
två saker som användaren kan göra som går utanför
det vanliga användandet av systemet
Tips:
 In- och utmatningsalternativ är valfritt (Du kan alltså
använda Scanner för att läsa in text och
System.out.println för att skriva ut text)
 Korta och långa signaler kan representeras med t.ex.
stjärna (*) och bindestreck (-)
 F = **-*
 **** * *--- = HEJ
Representationen av morsekoden kan sparas i vilken
datastruktur du vill, men HashMap brukar vara
enklast
 Metoden split i klassen String kan vara bra att
använda för att dela upp de inlästa tecknen