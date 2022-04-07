# CODE REVIEWER

### SECTION A: Java Task

Points to note.
* Line 1 the class declaration or class name must start with capital letter, this is more conventional way to go about it. (eg. Students, Recursion, Test)
* Line 18 when declaring a function we must use camel casing. Meaning, the join the words and first letter is small letter while subsequent words take capital letter. (eg. camelCasing, reverseString, getUser)

#### Correctness
* Reverse function is correct in the approach, but you return a wrong function (reverseString) instead of the same function you declared (reverse_string).
* Fibb function is incorrect the maxNumber is already declared in scope as parameter, new variable should be assigned to maxNumber
* We needed to ensure that generic T is type safe i.e users should not pass a string or double (unless requirements change)
* When using generics, we need to use getters to retrieve values inside the generic objects.
For loop was incorrect, when we print values, in order to ensure that we print the first 10 we needed to subtract 1 because our indexing start from 1, meaning that we are skip 0 hence the subraction.
#### Efficiency
* The reverse function is in linear approach in terms of effective ness same as the Fibb function
#### Style
* Reverse function has a simplest approach I would not change anything.
* Fibb function Current implemntation is sequential and easy to understand. We only need to remember two value (previous and next) and therefore in 
terms of space this implementation is acceptable. Also, there is no redundancy when calculation values.
#### Documentation
* There are other implentation of this function e.g the one on the java file (although I'm not printing the values). However,
these implementation have their pros and cons. For example, the implmentation shown on the java file,
there's a lot of redundanncy when we calculate these values recursivley. This transalte to more time taken as compared to the previous implementation.
Because we are recalculation most of the values that also means that we use more space with this implementation.
* There are other implemntation such as Dynamic Programming which addresses the space issue i.e we only need to calcuclate a value once and store it.
When the need arise to calculate the same value we just go to memory and retrieve that value

* #### Java file: Testing.java


### SECTION B: Projects

##### This is a link towards my backend project using NodeJs, Express and MongoDB (Atlas):
* https://github.com/Mnangwe/Capstone-Project

### SECTION C: Code Challenge
* ##### I chose Python the name of the project is Say Number, the name of the file is main.py
