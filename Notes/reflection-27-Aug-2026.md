Class Notes - CSC360

Date: 27/08/2026



AU Id: AU2520082



1: What a "Build" Actually Produces

javac turns .java files into .class bytecode — just an intermediate step, not the final output.



A .jar bundles many .class files (+ resources + an optional manifest). The manifest's Main-Class is what makes a jar directly runnable.



Our project uses javafx-maven-plugin for packaging, since JavaFX isn't bundled with the JDK anymore after Java 11.



Only the source code + pom.xml really matter — .class/.jar are just regenerable output.



2: Keeping pom.xml Precise

No explicit UTF-8 encoding → javac falls back to the OS default charset, so the same file can compile fine on one machine and look broken on another.



source/target alone don't stop linking against newer JDK APIs — maven.compiler.release fixes that by locking the full API surface too.



Our pom.xml pins release to 17 to match the JavaFX 17.0.6 dependency, even though the lab JDK is 21.



3: Dependencies — Declared, Resolved, Scoped

Each dependency = groupId + artifactId + version (same idea as the project's own identity).



Maven auto-resolves transitive dependencies — version conflicts can come from something never listed directly.



JUnit is marked scope=test — available for building/running tests, excluded from the final jar.



Resolved dependencies are cached in \~/.m2/repository, so later builds are faster.



4: Testing as a Build Gate

A unit test isolates one method/class. @Test marks a test case; @BeforeEach/@AfterEach handle setup/teardown.



Assertions (assertEquals, assertThrows, etc.) decide pass/fail — the test running isn't enough on its own.



maven-surefire-plugin runs the tests during the build; a failed assertion stops the build.



5: Why This Needs to Be Automated

CI = auto compile + test on every push, to catch breakage early.



Continuous Delivery = every passing build is packaged and release-ready, but a person still triggers release.



Continuous Deployment = passing builds go live automatically, no manual step.



All of it depends on the build being fully reproducible from source — which is why compiled files never go into Git.



6: Character Sets and Encoding

A character set is a collection of characters that a computer can represent.



There are many character sets because different systems and languages needed different characters.



ASCII mainly supports English characters, while \*\*Unicode\*\* supports characters from many languages.



UTF-8 is a popular encoding used to represent Unicode characters.



Using UTF-8 helps text display correctly across different systems.



Class Reflection

Date: 27/08/26



Topics Covered:



What a build actually produces (source → .class → .jar)



Encoding and compiler version precision in pom.xml



Dependency declaration, transitive resolution, and scoping



Unit testing as a build gate, not a separate habit



Why CI/CD depends on total build reproducibility



Reflections:



Build output: .class and .jar aren't really "artifacts" — just deterministic byproducts of source + pom.xml.



pom.xml precision: UTF-8 encoding and compiler release both exist to remove hidden assumptions about "whatever this machine has."



Dependency scoping: A dependency can be present during build but deliberately absent from what ships — scope=test made that concrete.



Testing as a gate: The build stops on a failed assertion — testing is baked into whether the build succeeds, not a separate QA step.



CI/CD: Each layer (CI → Delivery → Deployment) is really about how much of the release a human still checks manually.



Key Terms:



.class vs .jar · Main-Class manifest · javafx-maven-plugin · project.build.sourceEncoding · maven.compiler.release · scope=test · transitive dependency · \~/.m2/repository · maven-surefire-plugin



Q\&A Discussed:



Q: If JUnit is downloaded either way, what does scope=test actually change?

A: It's available during compiling/running tests but excluded from the final packaged jar.



Q: What's the practical difference between source/target and release in compiler settings?

A: source/target only restrict syntax and bytecode format but still allow linking against newer installed-JDK APIs; release restricts the full API surface too.



Q: Why can't CI just reuse a previously built jar instead of rebuilding from source each time?

A: The whole point of CI is verifying the build is reproducible from source — reusing an old artifact would defeat that purpose.

