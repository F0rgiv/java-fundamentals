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

# Inheritance

## Inheritance.Restaurant
    String name | name of the restaurant
    int price | the price between 1 and 4 of the restaurant.
    Set<Review> reviews | a set of reviews for the restaurant.

### Inheritance.Restaurant.getPrice
- args
- returns String: returns $, $$, $$$ or $$$$ depending on the price of the restaurant.

### Inheritance.Restaurant.getRating
- args
- returns String: returns a float between 0 and 5 with the restaurant rating.

### Inheritance.Restaurant.getRating
- args
- returns String: returns a String in the format of "name: %s, stars: %.1f, price: %s(%d)" i.e. "name: nummies, stars: 0.0, price: $$$$(4)".

## Inheritance.Review
    String body | The actual review body it's self.
    String author | the name of the author of this review.
    float rating | a 1 to 5 star rating for the restaurant 0-5
    Restaurant restaurant | the restaurant that this review is about. 

    Upon creation of this review it will be added into the related restaurants set of reviews.