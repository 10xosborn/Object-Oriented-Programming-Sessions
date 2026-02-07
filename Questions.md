# Question 1: Basic Bank Account

Create a BankAccount class with private fields for accountNumber, balance, and accountHolderName. Provide public getter methods for all fields, but only allow the balance to be modified through deposit(double amount) and withdraw(double amount) methods. The withdraw method should prevent the balance from going negative.
Question 2: Student Grade Validator
Create a Student class with private fields: name, age, and grade. The grade should only accept values between 0 and 100. Use a setter method that validates the grade before setting it. If an invalid grade is provided, keep the existing grade and print an error message.
Question 3: Password Protected User
Create a User class with private fields: username and password. The password should never be retrievable directly (no getter for password). Instead, provide a verifyPassword(String inputPassword) method that returns true if the input matches the stored password, and false otherwise.
Question 4: Read-Only Employee ID
Create an Employee class where the employeeId is set only once during object creation (through the constructor) and can never be changed afterward. Include private fields for name and salary that can be modified through setters, but employeeId should only have a getter.
Question 5: Temperature Converter
Create a Temperature class that stores temperature in Celsius privately. Provide methods: setCelsius(double temp), getCelsius(), getFahrenheit(), and getKelvin(). The Fahrenheit and Kelvin values should be calculated on-the-fly from the Celsius value, not stored separately.
Question 6: Circle with Validation
Create a Circle class with a private field radius. The setter for radius should only accept positive values. Include methods getArea() and getCircumference() that calculate and return these values based on the radius. Don't store area or circumference as fields.
Question 7: Date with Validation
Create a Date class with private fields: day, month, and year. Implement setters that validate: day is between 1-31, month is between 1-12, and year is positive. If invalid values are provided, don't update the field and print an appropriate error message.
Question 8: Counter with Limits
Create a Counter class with a private count field that starts at 0. Provide methods: increment(), decrement(), reset(), and getCount(). The counter should not go below 0 or above 100. When limits are reached, print a message and don't change the count.
Question 9: Product with Discount
Create a Product class with private fields: name, price, and discountPercentage. The discount percentage should only accept values between 0 and 100. Provide a getFinalPrice() method that calculates and returns the price after applying the discount. Don't store the final price as a field.
Question 10: Rectangle Immutability
Create a Rectangle class where length and width are set through the constructor and cannot be changed afterward (no setters). Provide only getter methods for length and width, plus methods getArea() and getPerimeter(). Once a Rectangle object is created, its dimensions should never change.

Question 11: Simple Car Class
Create a Car class with private fields: brand, model, and speed (starting at 0). Provide getter methods for all fields. Add methods accelerate(int amount) to increase speed and brake(int amount) to decrease speed. Speed should never go below 0.
Question 12: Book Details
Create a Book class with private fields: title, author, numberOfPages, and currentPage (starting at 1). Provide getters for all fields. Add methods nextPage() and previousPage() to navigate through the book. The current page should never be less than 1 or greater than the total number of pages.
Question 13: Light Switch
Create a LightSwitch class with a private boolean field isOn (starting as false). Provide methods: turnOn(), turnOff(), toggle() (switches between on and off), and isLightOn() to check the status. Don't provide direct access to the isOn field.
Question 14: Simple Wallet
Create a Wallet class with a private field money (starting at 0.0). Provide methods: addMoney(double amount) (only accepts positive values), spendMoney(double amount) (only if enough money is available), and checkBalance(). Users should not be able to directly set the money value.
Question 15: Age Validator
Create a Person class with private fields: name and age. The age should only accept values between 0 and 150. Provide a setter for age that validates the input. If someone tries to set an invalid age, print an error message and keep the old value. Provide getters for both fields.
Question 16: Phone Battery
Create a Phone class with a private field batteryLevel (0-100, starting at 100). Provide methods: charge(int amount) to increase battery (max 100), useBattery(int amount) to decrease battery (min 0), and getBatteryLevel(). The battery level should always stay within the 0-100 range.
Question 17: Dice Roller
Create a Dice class with a private field numberOfSides (set in constructor, cannot be changed). Provide a method roll() that returns a random number between 1 and the number of sides. Also provide a getSides() method. The number of sides should be read-only after object creation.
Question 18: Score Tracker
Create a GameScore class with a private field score (starting at 0). Provide methods: addPoints(int points) (only accepts positive values), subtractPoints(int points) (score cannot go below 0), resetScore(), and getScore(). Users should not be able to set the score directly.
Question 19: Time Format
Create a Time class with private fields: hours (0-23) and minutes (0-59). Provide setters that validate these ranges. If invalid values are given, print an error and don't update. Provide getters and a method displayTime() that returns the time in "HH:MM" format.
Question 20: Traffic Light
Create a TrafficLight class with a private String field currentColor (can be "RED", "YELLOW", or "GREEN", starting with "RED"). Provide a method changeLight() that cycles through the colors in order (RED → GREEN → YELLOW → RED). Provide a getCurrentColor() method. Don't allow direct setting of the color.
