# java-fundamentals

## basics\Main methods.

### pluralize
Takes a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.
- args
    - String word: word to modify
    - int count: the number to check.
- returns string.
### flipNHeads
Flips a coin until a heads is returned n number of times. letting you know the result of each flip and how long it took. 
- args
    - n int: amount of heads in arow you want.
- returns void.
### clock
Constantly prints out the current time to the console once each second until killed with crtl+c.
- args
- returns void.

## basiclibrary\basiclibrary methods.

### int[] roll(int n)
return an array of intes betweek 1 and 6 with n legth
- args
    - int n: amount of dice you would like to have rolled.
- returns int[]: The array of dice.

### boolean ContainsDuplicates(int[] arr)
Checks an array of intagers for duplicate values
- args
    - int[] arr: the array to check for duplicate values in
- returns bool: true if there are duplicates.

### float average(float[] arr)
Finds the average of an array of floats
- args
    - float[] arr: array to find the average of.
- returns float: the found average.

### float arrayAverage(float[][] arr) 
- args 
    - float[][] arr: the array or arrays of floats you would like averaged out. 
- returns float: the found average. 

### String tally(List<String> votes) 
Take a list of strings and returns the string that is repeated the most within the array. 
- args 
    - List<String> votes: the array string that represent votes. 
- returns String: The same sting is returned as is consoled. 

### String weatherData(int[][] weeks) 
- args 
    - int[][] weks: the array of arrays of ints that represent days temperatures. 
- returns String: The same sting is returned as is consoled. 

## linter\App methods. 

### String readFile(String filePath) 
Analyzes a .js file to identify to find what lines are missing a ; 
- args 
    - String filePath: path to .js file that you would like to have linted. 
- returns: The same sting is returned as is consoled. 