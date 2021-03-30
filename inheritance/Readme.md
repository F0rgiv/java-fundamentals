# Inheritance

## run tests with

`/gradlew test`

## Inheritance.Place implements ReviewAble
    String name | name of the restaurant
    int price | the price between 1 and 4 of the restaurant.
    Set<Review> reviews | a set of reviews for the restaurant.

### Inheritance.Place.getPrice
- args
- returns String: returns $, $$, $$$ or $$$$ depending on the price of the restaurant.

### Inheritance.Place.getRating
- args
- returns String: returns a float between 0 and 5 with the restaurant rating.

### Inheritance.Place.toString
- args
- returns String: returns a String in the format of "name: %s, stars: %.1f, price: %s(%d)" i.e. "name: nummies, stars: 4.7, price: $$$$(4)".

## Inheritance.Restaurant extends place

## Inheritance.Shop extends place
    String description | description of the restaurant

### Inheritance.Shop.toString
- args
- returns String: returns a String representing the shop like "name: Fancy Pants, stars: 0.0, price: $$$(3), description: A place with lot's of nice pants".

## Inheritance.Theater extends place
    Lsit<String> movies | A list of moviews currently showing at the theater.

### Inheritance.Theater.toString
- args
- returns String: returns a String representing the shop like "name: Fancy Pants, stars: 0.0, price: $$$(3), description: A place with lot's of nice pants".

### Inheritance.Theater.addMovie
- args
  * String movie | the movie you would like to add the list of movies being shown.
- returns void:

### Inheritance.Theater.removeMovie
- args
    * String movie | the movie you would like to from form the list of movies being shown.
- returns void:

## Inheritance.Review
    String body | The actual review body it's self.
    String author | The name of the author of this review.
    float rating | A 1 to 5 star rating for the restaurant 0-5
    Restaurant restaurant | The restaurant that this review is about. 
    String movie | An optional cvariable when reviewing a theater to specify the movie that you saw while there.

Upon creation of this review it will be added into the related restaurants set of reviews.