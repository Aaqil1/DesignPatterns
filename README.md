# GoF Design Patterns in Plain Java

Interview-ready, minimal implementations of all 23 Gang of Four design patterns using only core Java. Each pattern has its own package with:
- A short, realistic problem statement
- Interfaces/abstract types and concrete implementations
- `Main` class demonstrating runtime behavior
- README summarizing intent, usage guidance, UML-style text outline, and interview-ready talking points

Requirements:
- Java 17 (configurable in `pom.xml`)
- Build with `mvn clean package`

Run any pattern demo via:
```
mvn -DskipTests compile exec:java -Dexec.mainClass="com.example.designpatterns.<path>.Main"
```
Replace `<path>` with the package path (e.g., `creational.singleton.Main`).

