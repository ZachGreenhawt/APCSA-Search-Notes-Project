# APCSA-Search-Notes-Project
This project was completed first semester of my APCSA class

**Overview**
This project is a simple Java program that searches for a given word or phrase across multiple text files, and reports where each occurence appears. I wrote this as an early personal project while learning Java in APCSA.

The program reads text files into memory, does a case insesitive search, and prints the index of each match.

**How it works**
This program reads the contents of a text file into a String, Converts both the file contents and the search term to lowercase, searches for all occurences of the term using indexOf, and then reports which file the term was found ing and the index of each occurence. 

Currently, the program searches three files named: [fileRoot]1.txt, [fileRoot]2.txt, and [fileRoot]3.txt

**What I learned**
I learned how to read files using Scanner, how to work with StringBuilder, case insesitive searching using toLowerCase(), Using loops to find multiple occurences of a substring, and basic error handling with try/catch

**Limitations and things to improve**
The number of files is hard coded, the program loads entire files into memory, results are printed to the console instead of being returned or stored, no handling for punctuation or word boundaries. 

**Why this project is on here**
This repository represents an early step in my learning process. I'm using GitHub to track my growth as a programmer, including small projects and experiments like this one. 
