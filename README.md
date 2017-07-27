# digital-gates
Solve your Forton physics with just a few key presses and minimal stress!

How to use:
1. Click the green "Clone or download button"
2. Click "Download ZIP" on the bottom right
3. Put the folder somewhere easy to remember
4. Extract the ZIP file. If you have a Mac, your laptop will likely do this for you, unless you disabled it in settings. Otherwise, just right-click on the folder and choose whatever your "extract" option is.
5. Open your command line
6. If you are using a Mac (or Linux, or anything with a Bash shell):

(This assumes you have put the folder in your Downloads directory, if you put it somewhere else, then replace the step where you navigate to the Downloads directory with a step that will navigate you to where you put it. If you don't know how to do that, just put the folder in the Downloads directory and follow these steps.)

a. type in `cd Downloads`

b. type in `cd digital-gates-master`

c. type in `cd src`

d. type in `javac Gates.java`

e. type in `javac Test.java`

f. type in `javac Test2.java`

Congrats! You are done. Now, just type in `java Test` if you want to solve problem 1 on the back, and the program will prompt you for input from there. Type in `java Test2` to solve the second problem on the back.

7. If you are using Windows:

a. All of the commands should be the same. Just make sure you are in your home directory.

b. If you would prefer to use Bash (I used Bash to test/compile this), here are some easy instructions on how to enable a Bash shell on Windows 10. If you do not have Windows 10, this is not available.
  
Troubleshooting:
-If the javac and java commands aren't working, type in `java -version` to see if you have java installed. If you do not have java installed, you can just google "install jdk" and go to the Oracle website to do so.

-Feel free to raise an issue. Please specify your operating system and Java version (also, if you're using a non-default shell (if you don't know what that means, you are not so don't worry about it), tell me that too).

-If you don't have access to your command line (TCAPS...), you can download a bash shell here: https://www.gnu.org/software/bash/ pop it on a flash drive, and add it to your Windows computer.
