# Zookeeper

---

# General Information
This program helps the zookeepers check on their animals and ensure they are
doing well. It processes commands from the zookeepers and
display the animals on a monitor. 

This practical project was built following the instructions of the Java project
of the same name provided by the Hyperskill platform.

The project is divided into four stages:
1. Display a greeting message.
2. Create an animal printer.
3. Add more animals to the animal printer.
4. Let the user end the execution with the word `exit`.

## Project Requirements and Structure

### First Stage
The program should display the following text:
```
I love animals!
Let's check on the animals...
The deer looks fine.
The bat looks happy.
The lion looks healthy.
```

### Second Stage
For the second stage, you will need to develop an animal printer. 
Your program should display the animal identified in the code field.
```
Switching on the camera in the camel habitat...
 ___.-''''-.
/___  @    |
',,,,.     |         _.'''''''._
     '     |        /           \
     |     \    _.-'             \
     |      '.-'                  '-.
     |                               ',
     |                                '',
      ',,-,                           ':;
           ',,| ;,,                 ,' ;;
              ! ; !'',,,',',,,,'!  ;   ;:
             : ;  ! !       ! ! ;  ;   :;
             ; ;   ! !      ! !  ; ;   ;,
            ; ;    ! !     ! !   ; ;
            ; ;    ! !    ! !     ; ;
           ;,,      !,!   !,!     ;,;
           /_I      L_I   L_I     /_I
Look at that! Our little camel is sunbathing!
```
### Third Stage
In this stage the program should:

Ask for the number of the desired habitat using the following phrase: 
`Please enter the number of the habitat you would like to view:`

Use the input number as an index of your habitats to print its content. 
The indexes are: Camel – 0, Lion – 1, Deer – 2 Goose – 3, Bat – 4, Rabbit – 5.

End with the following phrase:
```
---
You've reached the end of the program. To check another habitat, please restart the watcher.
```

### Fourth Stage
In this stage, include an exit opportunity: inputting `exit` should end the program.

When the program is done running, it should print: `See you later!`


## Expected Result
```
Please enter the number of the habitat you would like to view: > 3

Switching on the camera in the goose habitat...

                                    _
                                ,-"" "".
                              ,'  ____  `.
                            ,'  ,'    `.  `._
   (`.         _..--.._   ,'  ,'        \    \
  (`-.\    .-""        ""'   /          (  d _b
 (`._  `-"" ,._             (            `-(   \
 <_  `     (  <`<            \              `-._\
  <`-       (__< <           :
   (__        (_<_<          ;
    `------------------------------------------
The goose is staring intently at you... Maybe it's time to change the channel?
Please enter the number of the habitat you would like to view: > 1

Switching on the camera in the lion habitat...
                                               ,w.
                                             ,YWMMw  ,M  ,
                        _.---.._   __..---._.'MMMMMw,wMWmW,
                   _.-""        '''           YP"WMMMMMMMMMb,
                .-' __.'                   .'     MMMMW^WMMMM;
    _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
 ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\
,MM:.    .'.-'   .'     ;     `\    ;     `,     MMMMMMMW `"=./`-,
WMMm__,-'.'     /      _.\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
"^MP__.-'    ,-' _.--""   `-,   ;       \  ; ;MMMMMMMMMMW^``; __|
           /   .'            ; ;         )  )`{  \ `"^W^`,   \  :
          /  .'             /  (       .'  /     Ww._     `.  `"
         /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
        (--, )                `,_ / `) \/"")      ^"      `-, -;"\:
The lion is roaring!
Please enter the number of the habitat you would like to view: > exit
See you later!
```

# Personal approach
To provide some context: I developed this project as a first step to
re-learn Java from the basics. Therefore, my approach relies strictly on procedural
programming rather than an Object-Oriented Programming (OOP) design.
While this might not be the most scalable structure, it successfully achieves
my goal of building a solid foundation in Java syntax.

## Explanation of the solution
For this practical project, the platform introduced Java text blocks (multi-line strings). 
This feature uses triple quotes (""") to initialize a multi-line string without 
needing the new line character (`\n`). This was incredible useful for 
formatting and displaying the ASCII art of each animal, as well as printing console 
messages like the greeting, the menu and the final exit message.

The ASCII art for each animal was obtained from the following website: https://emojicombos.com/ 

The following methods are only used to display messages on the console: 
- `void displayWelcomeMessage()`
- `void displayChannelsMenu()`
- `void displayFinalMessage()`

The `void askAnimalToPrint(Scanner sc)` method receives a reference to the scanner from
the main method to capture the user's input. A `do-while` loop was selected because
the program needs to display the menu and receive  user input at least once. 

The first part of the loop checks if the user entered the word `exit` to 
terminate the program. if the user's input is anything other than `exit`, 
it is stored in the `String userChoice` variable, and the program moves to the next step.

The second part of the loop attempts to parse the `userChoice` variable
into an integer to check if a habitat corresponds to that number. A `try-catch` block 
handles the  `NumberFormatException` exception that occurs if `Integer.parseInt()` 
attempts to parse a non-integer data. If the exception is thrown, the loop skips 
the current iteration and prompts the user  for new input. Once a valid integer is obtained,
it is stored in the `camera` variable. The program then checks if this number maps to an
existing habitat. If it cannot be associated with any habitat, the iteration is skipped,
allowing the user to try again. Finally, with a valid value for `camera`, the loop 
proceeds to the third section.

The third part of the loop displays the ASCII art of the selected animal. At this stage, 
the valid index stored in the `camera` variable is used to map to the correct ASCII art. 
The artwork for each animal is defined in the `Animals` class (Animals.java) and stored in 
a final array named `String[] ANIMALS_ASCII_ART`.

## Sample Run
```
I love animals!
Let's check on the animals...
The deer looks fine.
The bat looks happy.
The lion looks healthy.
Please enter the number of the habitat you would like to view:
1. Camel
2. Lion
3. Deer
4. Goose
5. Bat
6. Rabbit
:2
Switching on the camera in the lion habitat...
⠀⠀⠀⠀⠀⠀⢠⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⠞⠛⠛⠒⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣤⡤⠶⠚⠁⠀⠀⠀⠀⠀⠀⠉⠙⠉⠓⠲⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⢠⣿⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠴⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⢈⣿⣧⢹⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⣴⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⣼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⣼⡿⢱⣿⣿⡟⣿⠀⠀⠀⠀⠀⠀⠀⣾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣧⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⢰⣿⢃⣿⣿⣿⣱⡿⠀⠀⠀⠀⠀⠀⢠⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣷⡀⠀⠀⠀⠀⠀⠀
⠀⠀⢸⣿⡾⣽⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⣾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣷⠀⠀⠀⠀⠀⠀
⠀⠀⣿⣿⣿⣿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠀⢀⡤⠖⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡇⠀⠀⠀⠀⠀
⠀⢀⡿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡧⠀⠀⠀⠀⢀⡶⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⠀⠀⠀⠀⠀
⠀⡼⢀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡼⠋⠀⠀⠀⠀⣴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀
⢠⠃⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠋⠀⡀⠀⠀⣀⠴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⠀⠀⠀
⡸⠀⡏⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠁⠀⠀⠓⠖⠊⣁⠀⢀⣠⡄⠀⠀⠀⢀⣠⣤⣤⣤⣤⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⠀⠀⠀⠀⠀
⡇⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⡾⠁⠀⣀⣤⣤⣤⣾⣿⣿⣟⢿⣷⡄⠀⢀⣾⣿⣿⢛⣭⣤⣤⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀
⡇⠀⡇⠀⠀⠀⠀⠀⠀⠀⢰⡇⠀⠈⣟⣛⠿⣿⣿⣿⣿⣿⣦⢻⣷⡀⣾⣿⣿⢣⢋⣾⣿⣿⣿⣿⣷⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡄⠀⠀⢸⡃⠀⠀⠀⠀⠀
⢹⠀⠸⡀⠀⠀⠀⠀⠀⣠⣿⣠⣤⣾⣿⣿⣿⣮⡻⣿⣿⣿⣿⣿⣿⣷⢻⣿⢏⣷⣿⣿⣿⣿⡿⣫⣵⣿⣿⣿⣶⣤⣤⣤⣄⡀⠀⠀⠀⠘⣿⠀⠀⢸⠇⠀⠀⠀⠀⠀
⠀⢣⡀⠈⠒⠤⠤⠖⠊⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣮⡻⣿⣿⣿⣿⣿⣿⣿⣼⣿⢻⣿⣿⢏⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠹⡧⠀⣾⠀⠀⠀⠀⠀⠀
⠀⠀⠑⠦⣀⣀⣀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⢇⣮⢏⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⣿⣸⠇⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⡿⣛⣯⣽⣛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⣾⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⢤⣠⣿⡟⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣮⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣹⣿⣿⣿⣿⣿⣿⣿⣯⣷⣶⣶⣶⣿⣿⣿⣿⣿⠀⠙⢿⡇⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⣿⣿⣿⣽⣿⣟⣿⣿⣿⣿⣿⣟⣿⣿⣿⣿⣿⣿⣿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠙⠦⣀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⢸⢻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣠⣤⡄⠈⠿⠛⠛⢿⣿⣾⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⣀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠈⠳⣶⣦⣀⠀
⠀⠀⠀⠀⣾⢸⣿⣿⣿⣿⣿⣿⣿⣿⣷⠈⢹⢛⣷⠀⠀⠀⠀⠀⠁⠈⠻⣿⣏⣿⡏⣿⣿⣿⠭⠤⢄⠀⣾⠟⠑⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠈⢻⣮⠁
⠀⠀⠀⠀⢻⣾⣿⣿⣿⣿⡿⢛⣥⣶⣿⡄⠈⠀⠀⠀⠊⠉⠉⠀⠠⠄⠀⠀⣹⠙⠃⠉⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⢿⣿⣿⣿⣿⣿⡇⠀⠀⠀⢠⡀⠀⠀⣿⡇
⠀⠀⠀⠀⠀⣿⣿⣿⣿⢟⣴⣿⣿⣿⣿⣿⣦⠀⠀⠄⣀⣀⡀⠀⠀⠀⠈⢳⠈⢦⠐⠀⠀⠀⠀⣠⡜⠀⠀⠻⣿⣿⣿⣿⣷⡙⣿⣿⣿⣿⡇⠀⠀⠀⢸⡷⠀⠀⣿⠇
⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠈⢿⣿⣷⣄⡀⠀⢀⣀⠘⣄⣀⣀⣴⣿⡿⠁⠀⠀⠀⠹⣿⣿⣿⣿⣿⡸⣿⣿⣿⠃⠀⠀⠀⢸⠇⠀⠀⣿⠀
⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⠃⠀⠀⠀⢣⣀⣉⠙⣿⣿⡏⠛⠋⠉⠩⢽⣿⣟⠋⢁⡜⠀⠀⠀⠀⣿⣿⣿⣿⣿⣧⣿⣿⣿⠀⠀⠀⠀⠈⠀⠀⣸⠏⠀
⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⢣⣾⠀⠀⠀⠀⠀⠈⠉⠀⢠⡏⠀⠀⠀⠀⠀⠀⠹⡍⠉⡉⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⣰⠃⠀⠀
⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⢣⣿⣿⣆⠀⠀⠀⠀⠀⠈⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⢹⠀⠸⣄⠀⠀⢀⣾⣷⣻⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⣼⠃⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⡏⣿⣿⣿⣿⣷⣄⠀⠀⡌⠀⠀⠈⠄⣀⠀⠀⠀⠀⠀⣠⡾⠀⠀⠸⡄⣠⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣤⣇⠀⠀⠀⣢⠭⠤⣀⣀⣀⡠⠽⠧⡀⠉⢠⣿⣯⡹⣷⣻⣿⢸⣿⣿⣿⡿⠁⠀⠀⠀⢀⡞⠁⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⡟⢿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⢳⠶⣶⣤⣤⣴⣶⠶⡶⠃⠀⢸⣿⣯⢻⣽⣿⣿⣼⣿⣿⠏⠀⠀⠀⠀⠀⡾⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⢻⡿⣷⢹⣿⣿⣿⣿⢸⣿⣿⣧⡀⠀⠀⠀⠀⠙⢿⣿⡿⠟⠁⠀⠀⣀⣼⣝⢿⣧⣿⣿⣿⢿⡿⠃⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⣧⡠⠚⠁⠙⣇⣻⣿⣿⣿⣼⣿⣿⣿⣿⣦⣀⣀⡀⢀⣀⣠⣦⣀⣠⠔⡊⢹⣿⣿⣧⣻⣿⢿⣿⠼⠁⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⣿⠓⡄⠀⠀⠙⢿⣿⣿⣷⣋⣿⣿⣿⣿⣿⣿⡍⠫⣹⠿⠿⠿⠛⠙⠜⠀⣼⣿⣿⣿⣿⣿⠻⠀⠀⠀⡐⠀⠀⠀⠀⠀⢀⡇⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⢻⢸⠁⠀⠀⠀⠀⠹⢿⣿⣿⡜⣿⣏⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⣠⡿⣟⣿⣿⣿⠋⠀⠀⠀⡸⢡⠀⠀⠀⠀⢠⡞⠁⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⢻⣼⠀⠀⡀⠀⠀⠀⠀⠈⠉⠻⣿⣿⣿⣿⣿⣿⣷⣦⣄⣀⣤⣤⣴⣾⣿⣿⣼⣾⣿⡟⠀⠀⠀⢸⡃⠁⠀⠀⠀⠀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⠀⠀⢹⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣯⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠊⠀⠀⠀⠀⢰⣼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣆⠀⠸⣆⠀⠀⠀⠀⢀⣀⣸⣿⣿⣿⣿⣿⡼⡟⣿⣿⣽⣿⡇⣿⣿⣿⣿⠛⠃⠀⠀⡎⠀⠀⠀⠀⠀⢰⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣦⡀⠹⣧⠀⠀⣀⣀⣉⣙⣻⣿⣿⣿⣿⣷⣽⣿⡿⣿⣿⣷⢹⣿⣧⡇⢠⠴⠲⡄⡇⢀⠔⢆⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡷⡄⢹⡇⠀⠀⠀⠀⠈⣹⣿⣿⡿⠛⠛⠻⢿⣿⣮⣿⣿⣷⣝⢿⢧⣯⠀⢠⡇⣹⢾⠀⢸⠴⠖⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⣹⣿⣤⠖⠛⠻⢶⡿⠋⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣯⣿⡞⠀⠙⣆⣸⠛⠉⠀⠳⠾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠛⣡⡞⠁⠀⠀⠐⠉⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠈⡿⣿⣿⣆⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠀⢸⡟⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠇⠀⢀⡀⠀⠀⠀⠀⡇⠸⡇⠻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡿⠒⢪⣧⢀⣠⢄⠀⣇⠀⡠⡶⢦⠀⢸⡞⠈⠹⡄⠀⠀⢠⡇⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⢀⣾⣾⡏⢃⢸⣇⠸⣶⠁⡇⣼⣄⣸⣧⡀⣼⣷⣦⡴⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣼⠉⠙⠻⡌⢸⣿⡤⠞⢇⡇⡏⠉⠉⠙⣷⠏⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢮⡇⠀⠀⠈⠓⠃⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
Look at that totally friendly kitten! The lion looks perfectly fine, obviously.

Please enter the number of the habitat you would like to view:
1. Camel
2. Lion
3. Deer
4. Goose
5. Bat
6. Rabbit
:4
Switching on the camera in the goose habitat...
⠸⣿⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠔⠒⠒⠒⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠙⠻⣿⣷⣦⣀⠀⠀⠀⢀⣾⣷⠀⠘⠀⠀⠀⠙⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠉⠛⠙⢏⢩⣶⣿⣿⠿⠖⠒⠤⣄⠀⠀⠈⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠋⢅⡈⠐⠠⢀⠀⠈⢆⠀⠀⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠐⠠⢀⠩⠀⢸⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⣿⣹⠆⣿⣉⢀⡟⡄⣰⠉⠂⢸⣏⠁⠀⠀⠀⡌⠀⠀⠸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠛⠀⠀⠓⠒⠘⠉⠛⠘⠒⠃⠘⠒⠂⠀⠀⢰⠁⠀⠀⠀⠑⢤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⢦⢠⡄⡄⢠⣦⠀⣔⠢⠀⠀⠀⠀⡠⠃⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠙⠒⠒⠤⢄⣀⠤⠔⠒⡄
⠀⠀⠀⠸⠏⠳⠃⠟⠺⠆⠬⠽⠀⠀⠀⢰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇
⠀⣄⢀⡀⣠⠀⢠⡀⣠⢠⡀⠀⣠⢀⡀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠀
⠀⡏⢿⡇⣿⣒⠈⣧⡇⢸⣒⡂⣿⢺⡁⠀⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡤⠊⠀⠀
⠀⠀⠈⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⠀⠀⠀⠀
⠀⠀⠀⠀⠀⣼⣳⠀⡟⣼⠀⠀⠀⠀⠀⠀⠀⠈⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠇⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠃⠈⠃⠃⠘⠀⠀⠀⠀⠀⠀⠀⠀⠈⢆⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⢀⠎⠀⠀⠀⠀⠀
⡖⢲⡄⣶⣲⡆⢲⠒⣶⢀⡖⢲⠀⡶⡄⡆⠀⠀⠀⠀⣿⠁⠀⠈⠑⠢⣄⠀⠀⠀⢠⠎⠀⠀⠀⠀⠀⠀
⠳⠼⠃⠿⠀⠀⠸⠀⠿⠈⠣⠞⠀⠇⠹⠇⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠙⣢⡴⠁⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣶⣶⣶⣾⣿⡿⠀⠀⠀⠀⠀⠀⠀⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠛⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⢀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣴⣶⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⠛⠉⠻⠀⠀⠀⠀⠀⠀⠀⠀⠀
Nobody knows how this goose is holding a bat, but it looks healthy.

Please enter the number of the habitat you would like to view:
1. Camel
2. Lion
3. Deer
4. Goose
5. Bat
6. Rabbit
:10020394
Invalid number. Please, try again.
Please enter the number of the habitat you would like to view:
1. Camel
2. Lion
3. Deer
4. Goose
5. Bat
6. Rabbit
:I'm trying to break the program"
Invalid input. Please try again
Please enter the number of the habitat you would like to view:
1. Camel
2. Lion
3. Deer
4. Goose
5. Bat
6. Rabbit
:exit
---
You've reached the end of the program.
To check another habitat, please restart the watcher.
See you later!
```