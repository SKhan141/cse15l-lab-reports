# Sohaib Khan's Lab 1 Report

## cd (Change Directory)
1. When cd is ran in the root directory with no arguments. Nothing changes, we stay in the same directory and no error is occurred. When cd with no arguments is ran in another directory, it always goes back to the root directory, no matter where you do it from. The pictures below display this: In our first picture, we did cd with no arguments in two directories. The highlighted in yellow represents us doing cd in the lecture1 directory, which is actually in the root directory. After we cd, we get back to the root directory represented by just a ~. When we do cd in the root directory itself (highlighted in blue), nothing happens. We stay in the same directory and no errors occur. In the second picture we are in the directory, messages, which is lecture 1, thus two directories ahead of the root. When we cd from there, it also goes back to the root directory, again represented by the ~, the “tilda”.

    <img width="432" alt="CD_noarg" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/4cf64bf5-b408-4393-99d5-7db144e32d2b">

    <img width="360" alt="CD_noarg2" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/604d5431-32d6-47ab-808e-5e84bbb2380e">

2. When you cd with a path to a directory, it goes to that directory, but only if it is inside your current directory (unless you put/?). For example. If I am in the root folder and I try to directly get into messages, it will not work as the only directory that cd sees in the root folder is lecture 1, as shown in the 2nd image, highlighted in yellow. We end up getting a “No such file or directory” error. But, if I put cd lecture1/messages rather than just cd messages, it will go into messages (highlighted in yellow in the first image). Furthermore, you cannot go backwards with cd as well. Let’s say I go cd lecture1/messages, then I try to do cd lecture1, it will give me a no such file or directory error (highlighted in blue). If you want to go backwards, you can do “cd ..” or if you want to go back to root, you can simply do cd with no arguments. In the first picture, for the yellow part, we are currently in the root directory, we then cd into messages via cd lecture1/messages and thus we are able to get into messages. Now, while we are in the messages directory, if we try to do cd lecture1, we get an error saying no such file or directory. In the second picture, we are back in the root directory, and we try to cd directly into messages, it will not work as it doesn’t see messages in its own directory, thus it will give us an error, “No such file or directory”. In the third picture, we are in the root folder and simply cd lecture1. Voila, we are in the lecture 1. Now, if you are in any directory, you can access any other directory, if you put the absolute for that directory, so it must start witha "/". Such is shown in the 4th picture.

	Now, in any directory if you put “/“ before…..it can go correct?


    <img width="438" alt="cd_dir" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/4f811525-ab3e-416a-9607-36cb28b2d70c">


     <img width="419" alt="cd_dir2" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/4f037d64-3365-4f46-89dc-5f855807078b">


     <img width="256" alt="cd_dir3" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/f8718719-4f61-4b98-8421-f44d3344135b"> 

     ![cd_abs_path](Abs_path_cd.png)
   
    

4. When you put the path to a file, you get a "Not directory error." Frin this we can conlude that cd is only used to go in or out of directories.

   <img width="504" alt="cd_file" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/41e964c6-1218-4fa7-a5ef-32eb1d6a8746">

## ls (List)
1. When you do ls with no arguments, it shows the contents of the directory you are currently in.

   <img width="376" alt="ls_noarg" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/60398c4a-cf27-4bab-9e7e-9747cf90caad">

2.  When you ls a directory, it displays all the files and directories in the specified directory. *Files are in normal font, directories are bold and blue.*

    <img width="423" alt="ls_directory" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/88e629eb-419e-4bb2-9a7a-2979c69bab8b">

3.  When you ls a file, it just displays the file path of that file from the current directory.

    <img width="465" alt="ls_file" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/c457284a-4aa2-4e6b-935d-2d4469a11d35">

## cat (Concatenate)
1. When you cat with no arguments, it goes into the next line where you type in anything, and whatever you type in, it displays that again. Basically a textbox. (Highlighted in Blue)
2. When you cat into a directory, cat displays the specified directory and states it's a directory. (Higlighted in Yellow)
3. When you cat into a file, cat displays the content in that specified file. (Highlighted in Red)


<img width="449" alt="cat" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/42dfee35-e291-4db8-93fe-e1a7d48e66dc">




