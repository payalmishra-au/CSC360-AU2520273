Class Notes - CSC360

Date: 08/09/2026



1: Exceptions, Assertions, and Logging

● In Java, an exception is raised when something fails during the execution. We

use to try-catch the blocks handle these errors safely so the application

doesn't crash, while we use throw and throws to trigger or declare them.

● Checked exceptions ( like IOException) which must be either caught or

specified in the method signature. While Unchecked exceptions (like as

NullPointerException) will happen due to logical programming mistakes and

do not require mandatory handling at compile time.

● The assert statement acts as an internal check during testing to verify the

assumptions. Because the assertions are turned off by default and require the

\- ea flag to run, they must never be used like a substitute for standard

exception handling.

● Instead of basic System.out.println statements, logging frameworks (such as

java.util.logging or SLF4J)was track runtime activities with severity levels like

INFO, WARNING, and SEVERE, allowing you to filter details without modifying

source code.

2: Idea of Generic Programming

● Compile-Time Safety is Generics allow classes, interfaces, and methods to

operate on specified types while catching type mismatches at compile time

rather than crashing during executions.

● Avoiding Casts are Prior to generics, collections held raw Object references,

requiring explicit type casting and risking the runtime ClassCastException

errors. Generics eliminate manual casting.

● Type Parameters are Placeholders such as T (Type), E (Element), K (Key),

and V (Value) act as templates, letting you write reusable code for any data

type.

3: Collections

It provides standard data structures to group, organize, and process objects

efficiently.

● List (e.g., ArrayList): Maintains insertion order and permits duplicate values.

● Set (e.g., HashSet): Stores only distinct elements and ignores duplicates.

● Map (e.g., HashMap): Stores associations using unique key-value pairs.

● Core Methods are Frequently used operations include add(), remove(), get(),

contains(), and size().

4: Views

● Live Windows is a collection view is not an independent clone, it is a direct

window into an existing collection. Example like, map.keySet() provides a live

set of keys backed by the map .

● Direct Modification Changes are made to a view immediately affect the

original collection while Removing an element from a keySet() view deletes the

corresponding entry from the underlying the map.

● Performance, The views save memory and processing time because subranges or key sets are accessed without copying underlying data.

5: Events and How Events Connect to Graphics

● Event Handling is User actions (such as button clicks, typing, or moving a

mouse) produce event objects in JavaFX containing information about

interaction.

● Connecting Logic to UI is an EventHandler is attached to a specific UI control.

When a user triggers an action, handler runs and modifies graphic

components on screen.

● Reactive UI is the visual elements remain static until an event listener captures

an action and executes an update.

6: Layouts

● Dynamic Positioning is layout panes arrange and resize child controls

automatically instead of relying on fixed pixel coordinates ().

● Standard Panes are, VBox Arranges items in a vertical column, HBox

Arranges items in a horizontal row, BorderPaneSplits the view into five areas:

Top, Bottom, Left, Right, and Center, GridPane Places controls inside a

configurable grid of rows and columns.

● Responsiveness is Using layout panes ensures that UI elements adjust their

positions proportionally whenever a user resizes window.

7: Slider

● The Slider allows users to select a numeric value smoothly by sliding a knob

which across a bounded track.

● min and max define the valid range, whilevalueProperty () lets you attach a

change listener to track inputs in real time.

● While commonly used for adjusting continuous settings like audio volume,

screen brightness, or scaling factors.

8: Dialogs

● The dialog is a pop-up window used to prompt the user and confirm an

action, or display an alert without opening a full application window.

● While Alert class includes pre-configured setups for confirmations, general

information, warnings, and error messages.

● Most dialogs are modal, meaning a primary window stays blocked until a user

dismisses the dialog.

9: Combining Swing and JavaFX in One UI

● SwingNode is acts as an integration bridge, letting legacy Swing components

sit directly inside the JavaFX scene graph.

● Useful for the migrating large projects step-by-step or preserving complex

custom Swing components.

● While the thread safety, JavaFX runs on the JavaFX Application Thread,

while Swing operations must execute on the Event Dispatch Thread (via

SwingUtilities.invokeLater)

10: Master-Detail Layout

● The design pattern where a primary list (the "Master") sits on one side,

selecting any item displays its complete information in an adjacent pane (the

"Detail").

● The usually implemented using the BorderPane, placing a ListView in the left

region and a form or display panel in a center.

● Selection changes trigger an event listener that extracts data from a chosen

item and updates a detail view.

11: Styling a Single Geometric Object

● The JavaFX shape classes (Circle, Rectangle, etc.) can be styled directly

through the methods like setFill() and setStroke(), or via CSS styling strings

using a setStyle("-fx-fill: ...").

● The Input controls like sliders and color pickers that can be bound directly to a

geometric properties so changes reflect instantly on the screen.

12: JavaFX with Browser (WebView) Support

● The WebView works alongside WebEngine to embed the WebKit-based web

browser directly inside the JavaFX application.

● The Java code can interact with a webpage's DOM by running JavaScript

through webEngine.executeScript().

● This forms a two-way interface: which JavaFX can update webpage content

dynamically, and web scripts can call exposed the Java methods.

Class Reflection

Date: 08/09/26

The Topics Covered are:

● Exceptions, assertions, and logging mechanisms

● Generic programming and Java collections

● Collection views and direct reference behaviour

● JavaFX event handling, layout panes, sliders, and dialog boxes

● Swing-JavaFX interoperability, Master-Detail design, shape styling, and

embedded WebView

Personal Takeaways:

● Exceptions vs. Assertions: Here, Assertions are simply development sanity

checks that get ignored in production by default. While Proper exception

handling with try-catch is mandatory for the production runtime errors.

● Generics with Collections: Collections rely on generics for type safety,

without them, collections would simply hold raw Object references, leading to

the runtime casting errors.

● Views: The Methods like keySet() do not return a duplicate copy of data.

While they return a live viewport directly tied to the source map, so

modifications alter the original structure.

● Event-Driven Flow: When user interfaces do not change on their own then

the Every visual update relies on a listener responding to the specific user

action.

● Practical Implementations: Both Master-Detail interfaces and shape-styling

tools follow a same core concept: listen for input events and immediately

update a bound UI node.

● Web Integration: Starting with the WebEngine.executeScript() is a most

straightforward way to manipulate web content from Java before

implementing two-way bridges.

● Important Concepts:

● Checked/Unchecked Exceptions · - ea flag · Type Parameters (T, E, K, V) ·

List/Set/Map · Collection Views ( keySet, subList) · EventHandler · Layout

Managers (VBox, BorderPane, GridPane) · Slider.valueProperty() · Alert ·

SwingNode · Master-Detail Structure · - fx- CSS Properties · WebView /

WebEngine.executeScript()

● Review Questions \& Answers

● Q: W hy are assertions turned off by default in Java?

Answer: The Assertions are designed for debugging during the development.

Keeping them enabled in the production creates unnecessary performance

overhead for conditions which should already be verified.

● Q: W hat led to the adoption of generics in Java collections?

Answer: The Earlier collection libraries stored everything as Object, meaning

invalid data types went unnoticed until a ClassCastException occurred at a

runtime. Then the Generics detect these mismatches early during the

compilation.

● Q: What should you keep in mind when working with collection views like

keySet ()?

Answer: A view is not an independent copy. If you delete a key from a

keySet(), the that corresponding key-value pair is deleted from the original

map as well.

● Q: Why must thread handling be managed carefully when mixing Swing

and JavaFX?

● Answer: The Swing updates on the Event Dispatch Thread (EDT) while the

JavaFX uses the JavaFX Application Thread and the Accessing components

across the wrong thread causes synchronization the issues and the

unpredictable UI errors.

● Q: Which communication approach is easier to set up first when using

WebView?

● Answer: Running of JavaScript from Java via webEngine.executeScript() is

much simpler, as two-way communication requires registering a custom Java

bridge object inside the browser the context first.

