# UT-IT

## Data Validator

Data Validator is a Scala project that provides functionalities for validating and processing different types of data. It includes methods for checking duplicate elements in a list, calculating factorials of a number, and validating passwords.
Prerequisites

    Java 8 or later
    Scala 2.12.x or later

## Getting Started

    Clone the repository to your local machine.
    Navigate to the project root directory.
    Run sbt test to execute the test cases.

## Usage
DataValidation

The DataValidation class provides two methods:
        isContainsDuplicateElement

This method takes a list of elements of type T as input and returns a boolean indicating whether the list contains duplicate elements or not.


        def isContainsDuplicateElement[T](list: List[T]): Boolean

### Example

        import com.knoldus.dataValidator.DataValidation

        val dataValidation = new DataValidation
        val list = List(1, 2, 3, 4, 5, 5)
        val result = dataValidation.isContainsDuplicateElement(list)
        println(result) // Output: true

## findFactorial

This method takes a non-negative integer as input and returns the factorial of that number as a Try[Double].


      def findFactorial(number: Int): Try[Double]

Example

      import com.knoldus.dataValidator.DataValidation

      val dataValidation = new DataValidation
      val input = 5
      val result = dataValidation.findFactorial(input)
      println(result) // Output: Success(120.0)

## PasswordValidation

The PasswordValidation case class provides a method for validating a password based on certain conditions.


      case class PasswordValidation(userName: String, password: String, email: String) {
        def isValidPassword(password: String): Boolean
      }

Example

      import com.knoldus.dataValidator.PasswordValidation

      val passwordValidation = PasswordValidation("John Doe", "Password1@", "johndoe@example.com")
      val result = passwordValidation.isValidPassword(passwordValidation.password)
      println(result) // Output: true

## Running the Tests

To run the tests, navigate to the project root directory and execute the following command:

sbt test
