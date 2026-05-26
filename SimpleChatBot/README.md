# Simple Chat Bot

---

# General Information
A simple console chatbot created from scratch that can engage in basic conversation
and perform simple arithmetic. \
This practical project was built following the instructions of the Java project
of the same name provided by the Hyperskill platform.
The project is divided into five stages:
1. Teach your assistant to introduce itself in the console.
2. Introduce the user to the bot.
3. Let the chatbot guess the user's age.
4. Teach the bot to count.
5. Play a simple quiz together.

## Project Requirements and Structure
### First Stage
The bot will display a greeting, its name, and the year it was created. \
The program should print the following lines:
```
Hello! My name is {botName}.
I was created in {birthYear}.
```

### Second Stage
In this stage, you will introduce yourself to the bot so that it can greet you by 
your name.\
Your program should print the following lines:
```
Please, remind me your name.
What a great name you have, {yourName}!
```

### Third Stage
In this stage, you will introduce yourself to the bot. It will greet you by your 
name and then try to guess your age using arithmetic operations. \
Your program should print the following lines:
```
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
Your age is {yourAge}; that's a good time to start programming!
```
The age is calculated using the following formula:
```
age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
```
where `remainder3`, `remainder5`, and `remainder7` are the remainders of 
the division of age by 3, 5, and 7 respectively.

### Fourth Stage
In this stage, you will program the bot to count from 0 to any positive number 
the user enter.
Example:
```
Now I will prove to you that I can count to any number you want.
> 5
0!
1!
2!
3!
4!
5!
```
### Fifth Stage
The bot will give you a test and check your answers.
The line with the test should end with a question mark;
each option starts with a digit followed by the dot (1., 2., 3., 4.)
If a user enters an incorrect answer, the bot will print the following message:
```
Please, try again.
```

Example:
```
Let's test your programming knowledge.
Why do we use methods?
1. To repeat a statement multiple times.
2. To decompose a program into several small subroutines.
3. To determine the execution time of a program.
4. To interrupt the execution of a program.
> 4
Please, try again.
> 2
Congratulations, have a nice day!
```

## Expected Result
```
Hello! My name is Aid.
I was created in 2023.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Enter the remainders of dividing your age by 3, 5 and 7.
> 1
> 2
> 1
Your age is 22: that's a good time to start programming!
Now I will prove to you that I can count to any number you want.
> 3
0!
1!
2!
3!
Let's test your programming knowledge.
Why do we use methods?
1. To repeat a statement multiple times.
2. To decompose a program into several small subroutines.
3. To determine the execution time of a program.
4. To interrupt the execution of a program.
> 4
Please, try again.
> 2
Congratulations, have a nice day!
```
# Personal approach
To provide some context: I am developing this project as a first step to 
re-learn Java from the basics. Therefore, my approach relies strictly on procedural
programming rather than an Object-Oriented Programming (OOP) design. 
While this might not be the most scalable structure, it successfully achieves 
my goal of building a solid foundation in Java syntax.

## Explanation of the solution
The name chosen for the bot is Ryubo, which was assigned to the final variable 
`BOT_NAME`. The name is of Japanese origin and means "Flowing Hat".
\
The bot's birth year is 2026, the year I completed this project. This value
was stored in the final variable `BOT_BIRTHYEAR`.
\
\
The project consists of 5 methods, excluding the main method. Since all of them require
information from the user, a `Scanner` object named `sc` was created in 
the main method. This object is passed by reference to each method and is finally 
closed in the main method to avoid memory leaks.
\
\
The first four stages were completed to match the expected output provided by 
the instructions. The following methods were created to fulfill these tasks:
- `String askName(Scanner sc)` [Second Stage]
- `int guessAge(Scanner sc)` [Third Stage]
- `void countNumbers(Scanner sc)` [Fourth Stage]

These three methods feature a very brief and straightforward logic that can be 
easily understood while reading the code. For this reason, I will not expand
further on their implementation.
\
\
I modified the expected output of the final stage to avoid having a static section 
in the project. The original requirements featured a single question with
a predefined answer, which didn't align with the dynamic nature of the other sections. 
To solve this, I decided to implement a mathematical quiz where the user guesses the
product of the multiplication generated dynamically during runtime.


The multiplication expression, the correct solution and the multiple-choice options
are generate in the `void playQuiz(Scanner sc)`method. They are passed to the 
`void askQuestion(Scanner sc, String expression, int correctAnswer, int[] choices)`
method to display the question (maintaining a structure similar to the instructions)
and validate the user's answer. 

## Sample Run
```
Hello! My name is Ryubo.
I was created in 2026
Ryubo: Please, remind me your name.
: Carlos
Ryubo: What a great name you have, Carlos!
Ryubo: Let me guess your age.
Ryubo: Enter the reminders of dividing your age by 3, 5 and 7.
: 2
: 0
: 6
Ryubo: Your age is 20; that's a good time to start programming!
Ryubo: Now, I will prove to you that I can count to any number you want.
Ryubo: Please enter the target number to count up to.
: 3
0!
1!
2!
3!
Ryubo: Let's test your mathematical skills.
Ryubo: What is the product of (24 * 6) ?:
a. 58
b. 144
c. 99
d. 155
Ryubo: Enter the product of the problem to answer the question.
: 99
Please, try again.
: 144
Ryubo: Congratulation!
Ryubo: See you later, Carlos!.
```
