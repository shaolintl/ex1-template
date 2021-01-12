# Exercise 1 - LFSR Encryption

## Introduction

In this exercise you will use multi-dimensional arrays in order to
program an LFSR-based encryption for text.

For more info - https://en.wikipedia.org/wiki/Linear-feedback_shift_register

## instructions

### Obtaining the initial code

1. Fork the github repository to your account.
2. On Che, create a new Java Gradle workspace.
3. On the navigation bar, go to workspaces, then click on the active workspace and select projects.
4. Delete the existing project and add a new one using your forked github repository.
5. Open a Terminal (Ctrl+` and choose gradle).
6. Change to the ex1-template directory via `cd ex1-template`.
7. Test the everthing is working by writing `gradle run`. You should see "Hello".
8. Run `gradle build` to execute tests, All 15 tests should fail.

### Programming LFSR encoding

* Your task is to complete all definitions in `Exercise1.java` by replacing the lines `throw new java.lang.UnsupportedOperationException();` with concrete code. We will learn later in the course the meaning of this line.
* You should continuously debug your code. For example, by using the main method and running the program `gradle run`.
* You should also check that the tests for a specific method pass by running `gradle build`.
* If you want to compile the code without running the tests, you can use `gradle build -x test`.
* You should always closely document your code.
* When the program is ready, you should zip it using `gradle pack` and submit it on Teams.

### Using the version sontrol system Git

* Che does not persist your changes! The moment the session is over or you close the browser, all your changes are deleted.
* The way to persist your changes is by using Git.
* Every several minutes, you should commit the changes you have done using the `source control: git` button on the left. You should add all the files you want to add to the commit, add an instructive commit message in the specific place and then click `ctrl + enter`.
* Back on the terminal, you should then execute `git push`, which will prompt you for your username and password on github.
* If you want to avoid having to enter username and password each time in a specific session, you can keep this information on your Che instance by typing `git config --global credential.helper store`. Note though that you do not want to persist the stored information to github, since it contains your password. The stored information will be therefore deleted at the end of the session and you will need to type the above line again in your next session. There are better ways of handling the password which depends on encryption algorithms. If you are interested, I can help you set them up.
* The next time you open Che, it will start from the last pushed version.
* You can use Github in order to browse the different versions, or by typing `git log`.
