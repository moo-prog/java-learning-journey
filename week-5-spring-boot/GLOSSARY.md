# Deutsches Programmier-Glossar: Grundlagen & Spring Boot

Dieses Glossar fasst die wichtigsten Konzepte, Entwurfsmuster und Werkzeuge für die moderne Java- und Spring-Boot-Entwicklung auf Deutsch zusammen – jeweils mit einfachen Erklärungen und praktischen Beispielen.

---

## Teil 1: Kernkonzepte (Dependency Injection & Spring)

### 1. Inversion of Control (IoC)
* **Einfach gesagt:** Ein Prinzip, bei dem nicht mehr deine Klasse die Kontrolle über das Erstellen von Objekten hat, sondern das Framework (wie Spring).
* **Beispiel:** Du schreibst nicht mehr `Chef kocht = new Chef();`, sondern sagst dem Framework: „Ich brauche einen Koch“, und das Framework bringt ihn dir.

### 2. Dependency Injection (DI)
* **Einfach gesagt:** Die konkrete Umsetzung von IoC. Statt dass eine Klasse ihre Werkzeuge selbst baut (`new`), werden sie von außen hineingereicht.
* **Beispiel:**
  ```java
  // Falsch (ohne DI):
  Car car = new Car(); // Das Auto baut seinen Motor selbst mit new Engine()

  // Richtig (mit DI):
  Car car = new Car(engine); // Der Motor wird von außen übergeben (injiziert)
  ```

### 3. Bean
* **Einfach gesagt:** Ein ganz normales Objekt, dessen Erstellung und Verwaltung komplett von Spring übernommen wird.
* **Beispiel:**
  ```java
  @Service // Das macht diese Klasse zu einer Bean, die Spring verwaltet
  public class GreetingService {
      public String sayHello() {
          return "Hallo!";
      }
  }
  ```

### 4. Container (IoC Container)
* **Einfach gesagt:** Die Zentrale oder der Speicher des Frameworks, das alle Beans verwaltet, sie zusammenbaut und bei Bedarf bereitstellt.
* **Beispiel:** Der Spring `ApplicationContext` im Hintergrund, der beim Start deiner App alle `@Service` und `@RestController` einsammelt und bereithält.

### 5. Constructor Injection
* **Einfach gesagt:** Die sicherste Methode, um Abhängigkeiten über den Konstruktor beim Erstellen des Objekts zu übergeben.
* **Beispiel:**
  ```java
  @RestController
  public class QuoteController {
      private final QuoteService quoteService;

      // Hier werden die Abhängigkeiten über den Konstruktor injiziert
      public QuoteController(QuoteService quoteService) {
          this.quoteService = quoteService;
      }
  }
  ```

---

## Teil 2: Allgemeine Web- & Projekt-Grundlagen

### 1. Server
* **Einfach gesagt:** Ein Computer oder ein Softwareprogramm, das auf eingehende Netzwerk-Anfragen wartet und Daten oder Dienste an Clients bereitstellt.

### 2. Request (Anfrage)
* **Einfach gesagt:** Eine Nachricht, die von einem Client (z. B. einem Browser oder HTTP-Client) an einen Server gesendet wird, um Daten, eine Seite oder eine bestimmte Aktion anzufordern.

### 3. Response (Antwort)
* **Einfach gesagt:** Die Nachricht, die der Server an den Client zurücksendet; sie enthält den Statuscode sowie die angeforderten Daten (oder Fehlerinformationen).

### 4. Framework
* **Einfach gesagt:** Ein strukturiertes Fundament oder eine Sammlung vorgefertigter Werkzeuge und Bibliotheken, das eine standardisierte Grundlage bietet, um Anwendungen schneller zu entwickeln.

### 5. Spring Boot
* **Einfach gesagt:** Ein Open-Source-Framework auf Java-Basis, mit dem man schnell eigenständige, produktionsreife REST-APIs und Mikroservices mit minimalem Konfigurationsaufwand erstellen kann.

### 6. Maven
* **Einfach gesagt:** Ein Build-Automatisierungs- und Projektmanagement-Tool für Java, das den Aufbau, die Paketierung und das Abhängigkeitsmanagement (über die `pom.xml`) des Projekts verwaltet.

### 7. Dependency (Abhängigkeit)
* **Einfach gesagt:** Eine externe Bibliothek oder ein Paket, auf das deine Anwendung angewiesen ist, um ordnungsgemäß zu funktionieren (z. B. Spring Web zum Erstellen von REST-Endpunkten).