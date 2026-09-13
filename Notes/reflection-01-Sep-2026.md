 Class Notes - CSC360
Date: 01/09/2026
Java Building & Maven Settings
● Why use release instead of source/target? Setting source and target in
Maven only check your code grammar. It can still accidental use newer Java
features from your computer. Using maven.compiler.release lock down the
entire Java toolset so it always match.
● Our setup: We uses Java 17 in our pom.xml to match JavaFX 17, even if the
lab computer have Java 21installed.
● UTF-8 Encoding: Always sets project.build.sourceEncoding to UTF-8. This
stop text and characters from breaking when different person open the
project on different computers.
2. How Dependencies Work
● What is a dependency? It are just a package label made of three parts:
groupId + artifactId+ version.
● Transitive Dependencies: When your project use a library, Maven
automatically download its dependencies too. This are great, but it can
sometimes causes hidden version clashes.
● Scoping (scope=test): Items like JUnit is marked as scope=test. This means
they helps you run and build tests, but they is automatically removed from the
final .jar file you ship to users.
● Local Cache: Maven save everything it downloads in ~/.m2/repository so
your next builds runs much faster.
3. Testing as a Build Gate
● Unit Tests: Test just one small piece of code like a single method or class.
● The Build Gate: Testing aren't optional or separate—it stop bad code. If a
single test fail, Maven's surefire plugin stop the build completely.
● Assertions: Commands like assertEquals or assertThrows checks if your
code work. Just running the test aren't enough; the assertion decide if it pass
or fail.
4. W hy Automation and CI/CD Matter
● CI (Continuous Integration): Automatically compile and test your code every
single time you push/save changes, catching bug early.
● Continuous Delivery: Every passing build am ready to be released, but a
human still have to click the final button to launch it.
● Continuous Deployment: Every passing build go live to users automatically
with zero human steps.
● Why no compiled files in Git? You should never saves .class or .jar files in
Git. The computer must always builds everything fresh from the raw source code
to proves the build am 100% reproducible.
5. Character Sets & Encoding
● What is a character set? A list of letters and symbol that a computer knows
how to shows.
● ASCII vs. Unicode: ASCII am old and mostly for English. Unicode have letters
and symbols for almost every language in the world.
● UTF-8: A popular tool that help computers reads Unicode correctly so text
never look like weird random symbols.