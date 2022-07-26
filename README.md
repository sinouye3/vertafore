# Vertafore Take Home 

This mini project has 3 seperate classes in it that each serve a distinct function.

## Class 1

This class houses a function which takes in an array and scrambles the values then returns the array.
If the array is empty, it will throw an illegalargumentexception.

The function is an implementation of the fisher-yates shuffle algo. An alternative method would be to
use the built in shuffle method in the Collections class.

## Class 2

This class takes in a word and abbreviates it in the following manner:

first letter + (# of removed letters) + last letter

EX: hello -> h3o

The requirements for this function is that the string contain at least two characters, otherwise, an illegalargumentexception is thrown.
This function makes use of StringBuilder to create an empty string appending the first char. The length of the middle characters is calculated by finding the overall length and subtracting the first and last char
It then appends them together and converts it back to a string and returns.

## Class 3

This class takes in a list (string) of words and performs the abbreviate function on each of them. It then looks to see if the abbreviated values are unique. It then returns true/false along with the original word.
