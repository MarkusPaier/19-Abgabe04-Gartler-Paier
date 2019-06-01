# Taskliste

- [x] Übertragen Angabe Taskliste in Markdown Readme
- [x] Einspielen Queue Vorlage aus Repository:&nbsp; https://github.com/michaelulm/software-configuration-management/tree/master/test-automation/Queue
- [ ] Taskergebnisse Schritt für Schritt auf Git stellen
	- Führung Taskliste
	-  Veröffentlichung in Git mit aktuell durchgeführten Tätigkeiten, z.B.     Testfälle geschriebenso wird auch in der Taskliste diese Aufgabe als erledigt markiert und Testfälle inkl. geänderter Taskliste ins Repository übertragen.
- [x] Korrigieren Sie den Codebzw. Debuggen Sie ihn um die Fehler zu finden
	-  Es befinden sich gesamt 3 Fehler im Source Code.
	-  Bei Bedarf Optimieren Sie das Queue Beispiel.
	-  Ergänzen Sie das Beispiel nach eigenen      Ermessen um es testen zu können.
	
	**Lösungen:**
	    **1. Fehler:** language level to 6 - @Override in interfacesFile war nicht korrekt 
	    Lösung: -> Project Structure -> Modules -> Sources -> Language level: set lecel higher or default
	    **2. Fehler:** poll() war nicht korrekt. IF-Bedingung war falsch gesetzt. 
	    Lösung: > statt == zeichen. Dadurch kommt man in den Block und das Element gelöscht.
	    **3. Fehler:** die Exception wird nie geworfen, weil davor eine Zuweisung stattfindet und daher ist das Element nicht null;
	    Lösung: keine Zuweisung;
	    
- [ ] Erstellen Sie für Klasse und alle Methoden Kommentare um mittels Javadoc eine API Dokumentation zu erzeugen
	-  IntegrierenSie ein Bild (der generierten Dokumentation) in Ihren Report.
- [ ] Erstellung JUnit Tests (vollständig testen, mehrere Varianten)
	-  Sie werden die „selben“ Testfälle mehrfach erstellen müssen um „mehrere Variationen“ für einen möglichst vollständigen Test zu erreichen. Achten Sie dabei mit unterschiedlichen Daten zu testen.
	-  JavaDoc Kommentare erstellen.
	-  Integrieren Sie ein Bild (der generierten Dokumentation) in Ihren Report.
- [ ] Passen Sie Ihr pom.xml auf das Projekt an, damit Sie das Projekt erstellenaber auch Dokumentation generieren 
**können.** 
	-  EntwicklerInnen Informationen hinzufügen.
	-  Integration Logging Bibliothek log4j mittels Maven Dependencies
- [ ] Log4j (Version 2) integrieren und in jeder Methode ins Log schreiben
	-  Siehe aktualisiertes Stack Beispiel.
	-  Erstellen Sie einen Statischen Logger der auf die Konsole schreibt.
	-  Konfigurieren Sie Logger über ein properties File.
	-  Geben Sie eine Info Lognachricht bei Aufrufeiner jeden Methode aus.
	-  Geben Sie eine Error Lognachricht aus bevor Sie einen Fehler werfen.
	-  Ergebnisse (Konsolenausgabe) als Bild in Dokumentationeinfließen lassen
- [ ] Maven Site Dokumentation erstellen
	-  Inklusive Javadoc Code und Javadoc Test Klassen
	-  Inklusive Menü mit Verweis auf manuell erstellte Seite
		-  Seite erläutert Funktionsweise Queue
	-  Geben Sie ein Bild der Maven Site Dokumentation in den Lab Report
		-  Der Inhalt der manuell erstellten Seite sollte ersichtlich sein
- [ ] Erstellung detaillierter und nachvollziehbarer Markdown Lab Report
	-  Übertragung Information aus Labreport Template.
	-  Alle Schritte dieser Übung nachvollziehbar erläutern.
	-  Übung Github Flavor: Erstellen Sie einen Codeblock im Dokument, welcher 3 Zeilen Pytho nund 3 Zeilen JavaSourceCode korrekt darstellt.
	-  Korrekturlesen Dokumentation
	-   PDF erstellen (zB Dillinger) 
- [ ] Überprüfung Vollständigkeit der Abgabe
- [ ]  Abgabe PDF Version der Abgabe
