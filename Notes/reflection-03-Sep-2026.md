Class Notes — CSC360

Date: 03/09/2026

1: Rendering a Binary Tree as ASCII Art

● The tree structure depend on a basic node class which contain the values and

child references.

● None of the rendering logic live inside a node itself since console acts as the

canvas.

● The recursive method carry two extra arguments down the call hierarchy.

● Visual glyphs is used to show whether a branch continues or terminates.

● When descending deeper, the prefix update conditionally based on the child

position.

● A vertical bar are appended only if the current node has remaining siblings.

● Processing the right subtree first allow the output to visually mirror a sideways

tree.

&#x20;node == null node != null

| |

return

&#x20;print: prefix + ( or ) + value

|

+-----------+-----------+

| |

recurse right recurse left

&#x20;prefix + (" " or " ") prefix + (" " or " ")

2: Rendering Directed Connectors Between Shared List Elements

● Two separate list is rendered side by side as vertical columns.

● Each element are assigned fixed coordinates based on its list index.

● Using nested loops cause the lookup operation to take quadratic time.

● Pre-indexing the second list into a hash map reduce the overall complexity

significantly.

● The program check the map to see if an element exist in both collections.

● Trigonometric functions like Math.atan2 calculates the connector line angles.

● Shortening the segment ensure that lines do not overlap the bounding box

centers.

● Handling duplicate values require an explicit policy decided beforehand.

List A List B

+-----------+ +-----------+

&#x20;| itemA\[ 0] | | itemB\[ 0] |

&#x20;| itemA\[ 1] |----- common? --->| itemB\[ 1] |

&#x20;| itemA\[ 2] | | itemB\[ 2] |

+-----------+ +-----------+

|

For each item in A:

lookup value in HashMap(B)

|

&#x20;found? ---- yes ----> get index in B --> draw arrow (A\[ i] -> B\[j])

|

&#x20;no ---- > skip, no arrow

3: JavaFX Splash Screen Implementation Using FXML

● A splash screen are essentially an auxiliary stage displayed before the main

application.

● Removing default window borders make the loader look like an native splash

screen.

● Layout details resides in dedicated markup files with separate controllers.

● Running heavy background tasks on the UI thread cause the interface to

freeze.

● A worker thread handle the initialization routine without blocking user

interactions.

● The progress bar bind directly to the task property during loading.

● Once initialization complete successfully, the primary window is displayed.

● FXML definitions allows charts and axes to be structured declaratively.

&#x20;Application.start()

|

&#x20;Load splash.fxml-> show Splash Stage

|

Create + start background Task

(simulated loading / data fetch)

|

&#x20;progressProperty <-- bound --> ProgressBar

|

&#x20;Task onSucceeded?

|

Yes --+-- No (show error / retry)

|

Close Splash Stage

|

&#x20;Load main.fxml-> show Main Stage

|

Controller (@FXML chart) adds Series

&#x20;(LineChart / PieChart populated)

Class Reflection

Date: 07/09/2026

Reflections

● The prefix string do not act merely as static indentation.

● Each recursion level evaluate whether guide lines must remain visible.

● Calculating arrow vectors rely on the same geometric formulas used

previously.

● Linear scans degrades rapidly when dealing with larger datasets.

● Building an index table remain the most practical solution for quick lookups.

● The splash screen serve as an indicator for asynchronous background work.

● Declaring components via FXML simplify the presentation architecture

significantly.

Q\&A Review

● Q: Why does tree traversals process the right child prior to the left child?

A: Printing the right node first ensure that terminal output reads like a sideways tree.

● Q: Why should nested loops be avoided when comparing two lists?

A: Nested iteration create performance issues because comparisons grows

quadratically.

● Q: How should identical values across both lists be handled?

A: A clear disambiguation rule prevent overlapping arrows from pointing to wrong

targets.

● Q: Why must background tasks handle delays instead of invoking

Thread.sleep()?

A: Pausing the main execution thread halt event processing across the whole

interface.

● Q: How does controllers populate charts defined inside FXML markup?

A: Injected UI references enables the controller to append data series dynamically.

