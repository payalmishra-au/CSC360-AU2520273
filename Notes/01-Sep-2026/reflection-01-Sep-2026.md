Q1. What did I learn about ASCII Tree?

Ans  At first, I was confused about how we can show a tree without using any    	graphical interface. Then I learned that we can use normal keyboard 	characters to represent a tree. For example, / and \ can be used to 	show the connection between the parent and child nodes.

	I understood that an ASCII tree is mainly a way to show the 	structure of a tree in the console. It made me think about how 	spaces and characters have to be arranged properly to make the tree 	look correct.

Q2. What is the difference between an ASCII tree and a Binary Tree?

Ans	I learned that an ASCII tree is mostly about displaying the tree, 	while a binary tree is an actual data structure where we store nodes 	and their relationships.

	For example, if I see:

  	    10
  	   /  \
  	  5    20

	I now understand that this is just the visual representation. In an 	actual binary tree, the program needs to store 10, 5, and 20 as 	nodes and connect them.

Q3. What did I understand about Composite ProgressBar?

Ans	Before this class, I only knew about a normal progress bar that 	shows the progress of one task. Then I learned that a composite 	progress bar can represent the progress of multiple tasks together.

	For example, if a program is installing something, there can be 	different tasks like downloading, installing, and configuring. Each 	task can have its own progress, while the overall progress can also 	be shown.

	This helped me understand how progress can be divided into smaller 	tasks.

Q4. What was the first thing to think about when creating a Composite 	ProgressBar?

Ans	I learned that before creating the actual UI, we first need to 	decide what tasks we are showing and what progress each task has.

	For example:

	Downloading → 100%
	Installing → 60%
	Configuring → 30%

	After understanding these individual tasks, we can think about how 	to show their overall progress.

Q5. What did I learn about cancelling a Thread?

Ans	I learned that sometimes a program starts a thread for a long-	running task, but the user may want to stop it before it finishes.

	For example, if a file is downloading and the user presses Cancel, 	the program needs some way to tell the thread to stop.

	I learned about interrupt() for this purpose. It does not simply 	forcefully kill the thread. Instead, it gives the thread a signal 	that it should stop, and the thread can handle the cancellation 	safely.

Q6. What was difficult for me?

Ans	The difficult part for me was understanding the difference between 	showing something and actually implementing it. For example, an 	ASCII tree looks simple when we see it on the screen, but arranging 	the spaces and connections correctly in a program requires more 	thinking.

	Similarly, with threads, I initially thought that cancelling a 	thread meant directly killing it. Now I understand that cancellation 	should be handled more carefully.

Q7. What did I take away from this class?

Ans	This class helped me understand that programming is not only about 	writing code. First, I need to understand what I am trying to 	represent, how the parts are connected, and what should happen when 	the user interacts with it. These concepts also made me more 	comfortable with thinking about Java programs step by step.