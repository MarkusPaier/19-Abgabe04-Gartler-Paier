# Lab Report

```
Abgabe Nr.: 04
```
```
Authoren:
	Student 1: Markus Paier
	Student 2: Ulrike Gartler
```
```
Erstellt am: 07.06.2019
```
```
Repository: https://github.com/MarkusPaier/19-Abgabe04-Gartler-Paier
```
___
## Taskliste

- [x] Übertragen
    - [x] Angabe Taskliste in Markdown Readme
- [x] Einspielen
    - [x] Queue Vorlage aus Repository:&nbsp; https://github.com/michaelulm/software-configuration-management/tree/master/test-automation/Queue
- [x] Taskergebnisse Schritt für Schritt auf Git stellen
	- [x] Führung Taskliste
	- [x] Veröffentlichung in Git mit aktuell durchgeführten Tätigkeiten, z.B.     Testfälle geschriebenso wird auch in der Taskliste diese Aufgabe als erledigt markiert und Testfälle inkl. geänderter Taskliste ins Repository übertragen.
- [x] Korrigieren Sie den Code bzw. Debuggen Sie ihn um die Fehler zu finden
	- [x] Es befinden sich gesamt 3 Fehler im Source Code.
	- [x] Bei Bedarf Optimieren Sie das Queue Beispiel.
	- [x] Ergänzen Sie das Beispiel nach eigenen      Ermessen um es testen zu können.
- [x] Erstellen Sie für Klasse und alle Methoden Kommentare um mittels Javadoc eine API Dokumentation zu erzeugen
	- [x] Integrieren Sie ein Bild (der generierten Dokumentation) in Ihren Report.
- [x] Erstellung JUnit Tests (vollständig testen, mehrere Varianten)
	- [x] Sie werden die „selben“ Testfälle mehrfach erstellen müssen um „mehrere Variationen“ für einen möglichst vollständigen Test zu erreichen. Achten Sie dabei mit unterschiedlichen Daten zu testen.
	- [x] JavaDoc Kommentare erstellen.
	- [x] Integrieren Sie ein Bild (der generierten Dokumentation) in Ihren Report.
- [x] Passen Sie Ihr pom.xml auf das Projekt an, damit Sie das Projekt erstellen aber auch Dokumentation generieren
können.
	- [x] EntwicklerInnen Informationen hinzufügen.
	- [x] Integration Logging Bibliothek log4j mittels Maven Dependencies
- [x] Log4j (Version 2) integrieren und in jeder Methode ins Log schreiben
	- [x] Erstellen Sie einen Statischen Logger der auf die Konsole schreibt.
	- [x] Konfigurieren Sie Logger über ein properties File.
	- [x] Geben Sie eine Info Lognachricht bei Aufruf einer jeden Methode aus.
	- [x] Geben Sie eine Error Lognachricht aus bevor Sie einen Fehler werfen.
	- [x] Ergebnisse (Konsolenausgabe) als Bild in Dokumentation einfließen lassen
- [x] Maven Site Dokumentation erstellen
	- [x] Inklusive Javadoc Code und Javadoc Test Klassen
	- [x] Inklusive Menü mit Verweis auf manuell erstellte Seite
		- [x] Seite erläutert Funktionsweise Queue
	- [x] Geben Sie ein Bild der Maven Site Dokumentation in den Lab Report
		- [x] Der Inhalt der manuell erstellten Seite sollte ersichtlich sein
- [x] Erstellung detaillierter und nachvollziehbarer Markdown Lab Report
	- [x] Übertragung Information aus Labreport Template.
	- [x] Alle Schritte dieser Übung nachvollziehbar erläutern.
	- [x] Übung Github Flavor: Erstellen Sie einen Codeblock im Dokument, welcher 3 Zeilen Python und 3 Zeilen Java SourceCode korrekt darstellt.
	- [x] Korrekturlesen Dokumentation
	- [x] PDF erstellen (zB Dillinger)
- [x] Überprüfung Vollständigkeit der Abgabe
- [ ] Abgabe PDF Version der Abgabe
___
## Vorgehen
1. Taskliste, Queue Vorlage, Repository und Maven Projekt Grundstruktur
	* Zuerst wurde eine Repositiory auf Github eingerichtet.
	* Anschlißend wurde ein Maven Projekt Grundstruktur mit pom.xml und .gitignore file erstellt
	* Außerdem wurde die Vorlage vom Professor übernommen, damit wir ein kornkretes Beispiel für unsere Übung haben.
	* Zusätzlich wurde im Lab Report eine Taskliste erstellt.

2. Den Code korrigieren bzw. debuggen
	* Beim einfügen der Klasse StringQueue wurde ein Fehler vom Compiler angezeigt.
	Fehler: "language level to 6 - @Override in interfacesFile war nicht korrekt"
	Lösung: unter -> Project Structure -> Modules -> Sources -> Language level: Level auf höher oder default setzen
	* Bei der Methode poll() war die If-Bedingung nicht korrekt.
	```java
	if (elements.size() == 0) {
			elements.remove(0);
	}
  ```
	Lösung: statt == muss die Abfrage mit > Zeichen sein, weil sonst würde nur ein Element gelöscht werden, wenn die Größe des Elements 0 ist.
	```java
	if (elements.size() > 0) {
			elements.remove(0);
	}
	```
	* Bei der Methode remove() wird nie die Exception geworfen, weil davor eine Zuweisung stattfindet und daher ist das Element nicht null.
	```java
	@Override
	public String remove() {
		String element = poll();		
		element = "";
		if(element == null)
			throw new NoSuchElementException("there's no element any more");

		return element;
	}
	```
	Lösung: keine Zuweisung.
	```java
	@Override
	public String remove() {
		String element = poll();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");

		return element;
	}
	```
	* Im Konstruktor der StringQueue wurde der Übergabeparameter nicht richtig übergeben.
	```java
	public StringQueue(int maxsize){
		maxSize = maxSize;
	}
	```
	Lösung: richtig übergeben.
	```java
	public StringQueue(int maxSize){
		this.maxSize = maxSize;
	}
	```

3. JavaDoc generieren
	* Zuerst wurde bei allem Methoden und Classen eine JavaDoc Dokumentation hinzugefügt.
	Anschlißend wurden die JavaDoc Files generiert.
	![JavaDoc](/src/site/resources/javadoc_1.JPG)

	![JavaDoc](/src/site/resources/javadoc_2.JPG)

4. JUint Tests erstellen
	* Für die Tests wurde noch eine weitere Klasse "IntQueue" entwickelt.
	Für jede Methode und Klasse wurden Tests geschrieben, damit der produktiver Code zu 100% abgedeckt wird. Außerdem wurde zu jeder TestMethode ein JavaDoc Dukumentation erstellt.
	![JUint with JavaDoc](/src/site/resources/junit_javadoc.JPG)

5. pom.xml file anpassen
	* Developer Informationen hinzugefügt
	* plugins wurden hinzugefügt
		* maven-compiler-plugin
		* maven-site-plugin
		* maven-project-info-reports-plugin
		* maven-javadoc-plugin
		* maven-site-plugin
		* maven-project-info-reports-plugin
	* dependencies wurden hinzugefügt
		* junit
		* log4j-api
		* log4j-core
	* reporting wurde hinzugefügt
		* maven-javadoc-plugin
		* maven-surefire-report-plugin

6. Log4j integrieren und in jeder Methode ins Log schreiben
	* Zuerst wurde für jeder Klasse ein Statischer Logger erstellt
	* Außerdem wurde ein Logger properties File erstellt, um die Konfigurationen zu definieren.
	* Bei jder Methode wurde ein Info Lognachricht implementiert.
	* Bevor ein Fehler geworfen wird, wurde eine Error Lognachricht hinzugefügt.
	![Log4J int1](/src/site/resources/log4j_int_1.JPG)
	![Log4J int2](/src/site/resources/log4j_int_2.JPG)
	![Log4J string1](/src/site/resources/log4j_string_1.JPG)
	![Log4J string2](/src/site/resources/log4j_string_2.JPG)

7. Maven Site Dokumentation erstellen
	* Es wurde eine Maven Site erstellt mit site.xml
	* Außerdem wurden zwei Markdown Seiten erstellt (about.md und report.md)
	* Diese beiden Seiten wurden in der Maven Site hinzugefügt
	![Maven Site1](/src/site/resources/maven_site_1.JPG)
	![Maven Site2](/src/site/resources/maven_site_2.JPG)

8. Ein Markdown Lab Report erstellen
	* Es wurde ein report.md File erstellt
	* Alle Informationen und Scritte wurden auf dem Lab Report übertragen
	* Github Flavor Erstellen
		<br/><br/>**Python Code**
		```python
		# Python program for implementation of Selection
		# Sort
		import sys
		A = [64, 25, 12, 22, 11]

		# Traverse through all array elements
		for i in range(len(A)):

		    # Find the minimum element in remaining  
		    # unsorted array
		    min_idx = i
		    for j in range(i+1, len(A)):
		        if A[min_idx] > A[j]:
		            min_idx = j

		    # Swap the found minimum element with  
		    # the first element         
		    A[i], A[min_idx] = A[min_idx], A[i]

		# Driver code to test above
		print ("Sorted array")
		for i in range(len(A)):
		    print("%d" %A[i]),  
		```

		**Java Code**
		```java
		// Java program for implementation of Selection Sort
		class SelectionSort
		{
		    void sort(int arr[])
		    {
		        int n = arr.length;

		        // One by one move boundary of unsorted subarray
		        for (int i = 0; i < n-1; i++)
		        {
		            // Find the minimum element in unsorted array
		            int min_idx = i;
		            for (int j = i+1; j < n; j++)
		                if (arr[j] < arr[min_idx])
		                    min_idx = j;

		            // Swap the found minimum element with the first
		            // element
		            int temp = arr[min_idx];
		            arr[min_idx] = arr[i];
		            arr[i] = temp;
		        }
		    }

		    // Prints the array
		    void printArray(int arr[])
		    {
		        int n = arr.length;
		        for (int i=0; i<n; ++i)
		            System.out.print(arr[i]+" ");
		        System.out.println();
		    }

		    // Driver code to test above
		    public static void main(String args[])
		    {
		        SelectionSort ob = new SelectionSort();
		        int arr[] = {64,25,12,22,11};
		        ob.sort(arr);
		        System.out.println("Sorted array");
		        ob.printArray(arr);
		    }
		}
		```

9. Auf Vollständigkeit prüfen
	* Es wurde geschaut, dass alle Tasks vollständig abgearbeitet wurden.

10. Aus einem Markdown eine PDF generieren
	
___
## LINKS / LITERATUR

* Folien und Übungsunterlagen von DI (FH) Michael Ulm
* <http://assemble.io/docs/Cheatsheet-Markdown.html>
* <https://maven.apache.org/>
* <https://maven.apache.org/guides/mini/guide-site.html>
* <https://maven.apache.org/plugins/maven-site-plugin/usage.html>
* <https://docs.microsoft.com/en-us/contribute/how-to-write-use-markdown>
* <https://www.geeksforgeeks.org/python-program-for-selection-sort/>
* <https://www.geeksforgeeks.org/selection-sort/>
