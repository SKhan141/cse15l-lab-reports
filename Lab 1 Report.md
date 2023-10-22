# Sohaib Khan's Lab 1 Report

## cd (Change Directory)
1. When cd is ran in the root directory with no arguments. Nothing changes, we stay in the same directory and no error is occurred. When cd with no arguments is ran in another directory, it always goes back to the root directory, no matter where you do it from. The pictures below display this: In our first picture, we did cd with no arguments in two directories. The highlighted in yellow represents us doing cd in the lecture1 directory, which is actually in the root directory. After we cd, we get back to the root directory represented by just a ~. When we do cd in the root directory itself (highlighted in blue), nothing happens. We stay in the same directory and no errors occur. In the second picture we are in the directory, messages, which is lecture 1, thus two directories ahead of the root. When we cd from there, it also goes back to the root directory, again represented by the ~, the “tilda”.

    <img width="432" alt="CD_noarg" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/4cf64bf5-b408-4393-99d5-7db144e32d2b">

    <img width="360" alt="CD_noarg2" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/604d5431-32d6-47ab-808e-5e84bbb2380e">

2. When you cd with a path to a directory, it goes to that directory, but only if it is inside your current directory (unless you put/?). For example. If I am in the root folder and I try to directly get into messages, it will not work as the only directory that cd sees in the root folder is lecture 1, as shown in the 2nd image, highlighted in yellow. We end up getting a “No such file or directory” error. But, if I put cd lecture1/messages rather than just cd messages, it will go into messages (highlighted in yellow in the first image). Furthermore, you cannot go backwards with cd as well. Let’s say I go cd lecture1/messages, then I try to do cd lecture1, it will give me a no such file or directory error (highlighted in blue). If you want to go backwards, you can do “cd ..” or if you want to go back to root, you can simply do cd with no arguments. In the first picture, for the yellow part, we are currently in the root directory, we then cd into messages via cd lecture1/messages and thus we are able to get into messages. Now, while we are in the messages directory, if we try to do cd lecture1, we get an error saying no such file or directory. In the second picture, we are back in the root directory, and we try to cd directly into messages, it will not work as it doesn’t see messages in its own directory, thus it will give us an error, “No such file or directory”. In the third picture, we are in the root folder and simply cd lecture1. Voila, we are in the lecture 1. Now, if you are in any directory, you can access any other directory, if you put the absolute for that directory, so it must start witha "/". Such is shown in the 4th picture. We tried two things, one time while we were in the lecture1 directory, and one time in the messages directory. We tried going in a directory such as home by doing "cd home" in those directories, or "cd home/lecture1". We can't do that because it's trying to look for that path in it's own directory. But if you put a "/" in front of those arguments, that completely changes as the "/" signifies we are looking for directory from the root/home directory. 

	Now, in any directory if you put “/“ before…..it can go correct?


    <img width="438" alt="cd_dir" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/4f811525-ab3e-416a-9607-36cb28b2d70c">


     <img width="419" alt="cd_dir2" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/4f037d64-3365-4f46-89dc-5f855807078b">


     <img width="256" alt="cd_dir3" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/f8718719-4f61-4b98-8421-f44d3344135b"> 

     ![cd_abs_path](Abs_path_cd.png)
   
    

4. When you put the path to a file, you get a "Not directory error." Frin this we can conlude that cd is only used to go in or out of directories.

   <img width="504" alt="cd_file" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/41e964c6-1218-4fa7-a5ef-32eb1d6a8746">

## ls (List)
1. When you ls with no arguments, it shows the contents of the directory you are currently in. In the images below, for the first line, we ls in the root directory (highlighted in yellow). The root directory only has lecture1 in it, thus it shows that. Because lecture1 is another directory itself, it is bold and blue. A couple lines down we ls while we are in the lecture1 directory. That displays other files and directories that are in lecture1. Files displayed in a directory are in normal font, while directories displayed are bold and blue.
   
   <img width="376" alt="ls_noarg" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/60398c4a-cf27-4bab-9e7e-9747cf90caad">

2. When you ls a directory, it displays all the files and directories in the specified directory. In the image below, I am in the root directory, and I did “ls lecture 1”. It displays all the contents in the lecture1 directory just as I did ls with no arguments while I was in the lecture1 directory itself, just as I did in the previous question.

    <img width="423" alt="ls_directory" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/88e629eb-419e-4bb2-9a7a-2979c69bab8b">

3. When you ls a file, it just displays the file path of that file from the current directory. In the image below, we are in the root directory and we put the file path for lecture1/README in ls. It just displayed the file path of what I typed in. 

    <img width="465" alt="ls_file" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/c457284a-4aa2-4e6b-935d-2d4469a11d35">

## cat (Concatenate)

<img width="449" alt="cat" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/42dfee35-e291-4db8-93fe-e1a7d48e66dc">

1. When you cat with no arguments, it goes in the next line where you can type in anything. Whatever you type in, it displays that again, very similar to the functionality of a text box. In the image above, we have highlighted in blue what happens when you cat with no arguments. We are currently in the root directory. If I type in “hello” for example or “bob”, then it just displays that again in the next line.

2. When you cat into a directory, cat displays the specified directory and gives an error saying, “insert directory here: Is a directory”. In the image, we have highlighted in yellow where it does this exact functionality. In the first two lines we are in the root directory. When we type in "cat lecture1", it throws that error for the lecture1 directory. We also cat from the root directory, to lecture1/messages, where messages is a directory in lecture1. We get the same error but with lecture1/messages. i.e. "lecture1: Is a directory" and "lecture1/messages: Is a directory".

3. When you cat into a file, cat displays the contents in the specified file as shown in the image above, highlighted in red. Here, we are in the root directory, but when we cat all the way into the file, en-us.txt, which is a file in the messages directory, we get the contents of that file, "Hello World!". No error because en-us.txt is a file, not a directory. 

