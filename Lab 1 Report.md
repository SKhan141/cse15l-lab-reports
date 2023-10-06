# Sohaib Khan's Lab 1 Report

## cd (Change Directory)
1. If cd is in the root directory, then cd with no arguments does nothing. But if it's in a directory, then it goes back one directory (i.e. the directory it is located in). 
Below is my image of cd with no directory. Performing cd in the root directory is highlighted in blue, and performing cd in a directory is highlighted in yellow.

    <img width="432" alt="CD_noarg" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/4cf64bf5-b408-4393-99d5-7db144e32d2b">

    After further testing, I noticed that cd goes back to the root directory. In the previous summary, I thought it was one directory because I had only gone one directory in. But after going in
    multiple directories, cd (with no arguments) always takes me back to the root. Thus, cd **with no arguments** will always take me back to the root directory. Image below

    <img width="360" alt="CD_noarg2" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/604d5431-32d6-47ab-808e-5e84bbb2380e">

2. When you put the path to a directory, it goes to that directory, but only if it's inside your current directory. So, for example, if I am in the root folder and I try to get into messages,
it will not work, as the only directory cd sees in the root folder is lecture1 (in the 2nd image), but if I put cd lecture1/messages rather than just cd messages, it will go into messages
(highlighted yellow).

    Furthermore, you cannot go backwards with cd as well. Lets say I go cd lecture1/messages, then I try to do
cd lecture1, it will give me a no such file or directory error (highlighted in blue). Thus, you can only go forward with cd, one directory at a time.

    <img width="438" alt="cd_dir" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/4f811525-ab3e-416a-9607-36cb28b2d70c">


     <img width="419" alt="cd_dir2" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/4f037d64-3365-4f46-89dc-5f855807078b">


     <img width="256" alt="cd_dir3" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/f8718719-4f61-4b98-8421-f44d3344135b">  
    

     When you put the path to a file, you get a "Not directory error." Frin this we can conlude that cd is only used to go in or out of directories.


    <img width="504" alt="cd_file" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/41e964c6-1218-4fa7-a5ef-32eb1d6a8746">

## ls (List)
1. When you do ls with no arguments, it shows the contents of the directory you are currently in.

<img width="376" alt="ls_noarg" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/60398c4a-cf27-4bab-9e7e-9747cf90caad">

2. When you ls a directory, it displays all the files and directories in the specified directory. *Files are in normal font, directories are bold and blue.*

<img width="423" alt="ls_directory" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/88e629eb-419e-4bb2-9a7a-2979c69bab8b">

3. When you ls a file, it just displays the file path of that file from the current directory.

<img width="465" alt="ls_file" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/c457284a-4aa2-4e6b-935d-2d4469a11d35">

## cat (Concatenate)
1. When you cat with no arguments, it goes into the next line where you type in anything, and whatever you type in, it displays that again. Basically a textbox. (Highlighted in Blue)
2. When you cat into a directory, cat displays the specified directory and states it's a directory. (Higlighted in Yellow)
3. When you cat into a file, cat displays the content in that specified file. (Highlighted in Red)


<img width="449" alt="cat" src="https://github.com/SKhan141/cse15l-lab-reports/assets/105250752/42dfee35-e291-4db8-93fe-e1a7d48e66dc">




