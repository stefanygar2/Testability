package org.example;

public class UI {
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
