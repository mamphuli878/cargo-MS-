package com.cargoapp.util;

import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.JLabel;

public class ValidationUtil {

    // Regular expressions for validation
    private static final Pattern NUMERIC_PATTERN = Pattern.compile("\\d+");
    private static final Pattern ALPHABET_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$"); // Only alphabets and spaces
    private static final Pattern ALPHA_NUMERIC_PATTERN = Pattern.compile("^[a-zA-Z0-9]+$"); // Alphanumeric validation
    private static final Pattern WEIGHT_VOLUME_PATTERN = Pattern.compile("^\\d+(\\.\\d+)?$"); // Numeric with optional decimals

    /**
     * Checks if a string is null or empty.
     *
     * @param value the string to check
     * @return true if the string is null or empty, otherwise false
     */
    private static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates the Cargo ID.
     * It should be alphanumeric and exactly 5 characters long.
     *
     * @param cargoId the Cargo ID to validate
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidCargoId(String cargoId, JLabel lblError) {
        if (isNullOrEmpty(cargoId)) {
            lblError.setText("Cargo ID cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        if (!ALPHA_NUMERIC_PATTERN.matcher(cargoId).matches() || cargoId.length() != 5) {
            lblError.setText("Cargo ID must be alphanumeric and exactly 5 characters.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }

    /**
     * Validates the shipping cost, weight, and volume.
     * They must be numeric and not negative.
     *
     * @param value the value to validate (shipping cost, weight, or volume)
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidNumericValue(String value, JLabel lblError) {
        if (isNullOrEmpty(value)) {
            lblError.setText("Value cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        if (!WEIGHT_VOLUME_PATTERN.matcher(value).matches()) {
            lblError.setText("Value must be a valid numeric.");
            lblError.setForeground(Color.RED);
            return false;
        }
        double number = Double.parseDouble(value);
        if (number < 0) {
            lblError.setText("Value cannot be negative.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }

    /**
     * Validates the origin and destination.
     * They should be alphabetic and consist of a maximum of two words.
     *
     * @param location the location to validate (origin or destination)
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidLocation(String location, JLabel lblError) {
        if (isNullOrEmpty(location)) {
            lblError.setText("Location cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        if (!ALPHABET_PATTERN.matcher(location).matches() || location.split("\\s+").length > 2) {
            lblError.setText("Location must contain alphabets and a maximum of 2 words.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }

    /**
     * Validates the status.
     * It should not be empty.
     *
     * @param status the status to validate
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidStatus(String status, JLabel lblError) {
        if (isNullOrEmpty(status)) {
            lblError.setText("Status cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }

    /**
     * Validates the estimated delivery.
     * It should be numeric and between 1 and 21.
     *
     * @param estimatedDelivery the estimated delivery value to validate
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidEstimatedDelivery(String estimatedDelivery, JLabel lblError) {
        if (isNullOrEmpty(estimatedDelivery)) {
            lblError.setText("Estimated delivery cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        if (!NUMERIC_PATTERN.matcher(estimatedDelivery).matches()) {
            lblError.setText("Estimated delivery must be a valid number.");
            lblError.setForeground(Color.RED);
            return false;
        }
        int delivery = Integer.parseInt(estimatedDelivery);
        if (delivery < 1 || delivery > 21) {
            lblError.setText("Estimated delivery must be between 1 and 21 days.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }
}