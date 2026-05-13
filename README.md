# Tutorial: Improve Testability and Test the Order Function

## Goal

In this tutorial, you will work with a small Java class that mixes UI behavior, input validation, business logic, and console output. Your job is to **improve the testability of the code** and then write unit tests for the important behavior.

The purpose of this assignment is not only to test the code, but also to recognize why some code is difficult to test and how refactoring can make testing easier.

---

## Starter Code

```java
public class OrderUI {
    public void onSubmitButtonClick(String input) {
        // UI logic
        if (input == null || input.isEmpty()) {
            System.out.println("Invalid input");
            return;
        }

        int price = Integer.parseInt(input);
        double finalPrice;

        if (price > 100) {
            finalPrice = price * 0.9; // discount
        } else {
            finalPrice = price;
        }
    }
}
