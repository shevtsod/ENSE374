# ENSE 374
My solutions to labs in ENSE 374 - Software Project Management.  
> **Note:** This lab was completed on Nov. 16, 2016  

## Overview
> **Lab 1** - Introduction to Java  
> **Lab 2** - Introduction to Java in an IDE (Eclipse)  
> **Lab 3** - Introduction to Version Control (Git)  
> **Lab 4 and Lab 5** - Animal Habitat Simulation Project

## Compilation
### Eclipse IDE for Java Neon.1
To compile, go to
> File -> New -> Java Project

Name the project, set the `Location` of the project or keep the default, and navigate to the directory of the project in the system explorer.  

Move the folder of one of the labs from this repository and merge it with the `src/ `
directory where you created the project.  

The project files should now be visible in the IDE's `Package Editor`. If not, press `F5` with the `Package Editor` highlighted to refresh the directories.  

Press `Ctrl + F11` to build and run, or `F11` to build and debug.  

You may receive a window to choose how to run the application. Select `Java Application`.  

### IntelliJ IDEA 2016.2
To compile, go to  
> File -> New -> Project

Make sure that `Java` is selected in the list on the left side of the window.
Click `Next`, `Next`, name the project, and `Finish`.  

Move the folder of one of the labs from this repository and merge it with the `src\ `
directory where you created the project.  

Then, open the `Project` tab on the left, and expand the root folder.

Expand the file containing `main()`. In the editor window, click the green play button beside it. There, you can choose to either run or debug the program.

### NetBeans IDE 8.2
To compile, go to
> File -> New Project  

Click `Next`, name the project, choose a directory for the project, and click
`Finish`.

Right click on the default package that was created with the same name you
have given the project and `Delete` it.

Move the folder of one of the labs from this repository and merge it with the `src/ `
directory where you created the project. This will automatically update the
project files in the IDE. Press `F6` to run or `Ctrl + F5` to debug.

## Details
### Lab 1 - Introduction to Java
Using a text editor, a class `SavingsAccount` was created to hold a bank savings account with monthly compounding interest. It was tested using a class `Bank` and saved as Phase 1. In Phase 2, another implementation of `SavingsAccount` with bi-weekly compounding interest was tested using the same Bank class.

### Lab 2 - Introduction to Java in an IDE (Eclipse)
Using any Java IDE (Eclipse), a class `Employee` was created to hold information for an employee to be tested in a class `Interface`. Instances of `Employee` were placed in an array and populated with data from a file containing randomly generated entries `RandomData.csv` (generated using [generatedata.com](http://www.generatedata.com/))

### Lab 3 - Introduction to Version Control (Git)
Introduction to version control using command-line `Git`, the Windows shell interface [TortoiseGit](https://tortoisegit.org/), and `GitHub`. Classes `ListElement` and `LinkedList` were created in Phase 1 to implement a single linked list to become familiar with revision control on `GitHub`. In Phase 2, a branch `doubleLinkedList` was created to modify the linked list and implement a double linked list.

### Lab 4 and Lab 5 - Animal Habitat Simulation Project
See repository [ENSE374LabProject](https://github.com/shevtsod/ENSE374LabProject).
