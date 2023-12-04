# Lab Report 4

## Skip Step 1-3

## Step 4: Log into ieng6

1. Type ssh along with your associated account, cs15lfa23aq@ieng6.ucsd.edu
2. Then Press Enter
3. Type in password if needed (and press enter again if applicable)

![ssh_login](log_into_ssh.png)

    ssh cs15lfa23aq@ieng6.ucsd.edu 
    Keys Pressed: <enter>
    Password (if prompted): *******
    Keys Pressed: <enter>



## Step 5: Clone your fork of the repository from your Github account (using the SSH URL)

![ssh_link](ssh_link.png)

We want to use the SSH link as highlighted in the image above because we will not be able to push our changes to our repository if we use the standard HTTPS link.

1. Type: git clone git@github.com:SKhan141/cse15L_lab7_fork.git.
2. Press Enter
3. Then cd into the github directory. Type: cd cse15L_lab7_fork

![git clone](git_clone.png)

In the image above highlighted in yellow, we git cloned using our SSH link, and then after our clone, we cd into the "cse15L_lab_fork" directory from the home directory highlighted in red.

    git clone git@github.com:SKhan141/cse15L_lab7_fork.git
    Keys Pressed: <enter>
    cd cse15L_lab7_fork

## Step 6: Run the tests, demonstrating that they fail

1. Type in bash test.sh
2. There should be a failure as we see in the image below

![fail_tests](failing_tests.png)

    bash test.sh
    Keys Pressed: <enter>



## Step 7: Edit the code file to fix the failing test

1. Type in vim ListExamples.java ![vim_list](vim_List.png)
2. We are currently at the left most of the first line on the "i" of "import java.util.ArrayList; (highlighted in red in the image below).
3. We want to change index1 to index2 at line 44 (highlighted in yellow in the image below) ![in_vim](in_vim_index_1.png)
4. Then, what we do is we type "/index1" as we can see at the bottom left of the image above highlighted in blue.
5. Then press enter, now we are at the first occurrence of index1. Press "n" to go to the next occurence.
6. We do this until we reach our desired "index1" which is 9 times in this file, i.e. we press "n" 9 times. (highlighted in the image below). ![desired_index](at_desired_index1.png)
7. Now that we are at our desired index1, we press "c" + "w" which will delete the word and take us into insert mode. (as shown in the image below, deleted part in yellow, and **INSERT** in blue) ![del_index_1](deleted_index1.png)
8. Now type in "index2" (as shown in the image below, highlighted in yellow)![index2](index2.png)
9. Press Escape to turn into normal mode
10. Type ":wq" to save and exit.
11. Changes should now be saved

        vim ListExamples.java
        Keys Pressed:<enter>
        /index1
        Keys Pressed:<enter>
        Keys Pressed:<n><n><n><n><n><n><n><n><n><c><w>
        index2
        Keys Pressed:<esc><:><w><q><enter>
    
        

## Step 8: Run the tests demonstrating they they now succeed

1. Now that you are back in the bash, type "bash test.sh" again or press the up button a couple times to use the same "bash test.sh" command you used earlier.
2. Your tests should now pass with no issues! (as shown in image below) ![pass_tests](succeed_tests.png)

       Keys Pressed:<up><up>
       bash test.sh
       Keys Pressed:<enter>

## Step 9: Commit and push the resulting change to your Github account

1. Type "git add ListExamples.java" (Highlighted in yellow in the image below). "git add" stages a file to be part of the next commit.
2. Check to see if the file is ready to be committed via "git status" (highlighted in blue in the image below).
3. Now that it's added to the stage, type "git commit -m 'index1 to index2 edit for Lab Report 4'" (highlighted in red in the image below). "git commit" creates a commit locally for all added/staged files. The -m allows us to type the commit message in the command line.
4. Now type "git push" (highlighted in purple in the image below) ![git_stuff](git_stuff.png) "git push" copies all the new commits to the repository. 
5. Now you have successfully made changes to the file, ListExamples.java and we have successfully pushed them to the main branch of the repository.

       git add ListExamples.java
       git status
       git commit -m "index1 to index2 edit for Lab Report 4"
       git push


       

