
package com.cg;

import java.util.logging.Logger;

/**
 * Main class to test Employee functionality.
 */
public final class EmployeeMain {

    /** Logger instance for logging application messages */
    private static final Logger LOGGER = Logger.getLogger(EmployeeMain.class.getName());

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private EmployeeMain() {
        // Prevent object creation
    }

    /**
     * Main method - application entry point.
     * @param args command line arguments
     */
    public static void main(final String[] args) {

        // Creating employee object
        final Employee employee = new Employee(1, "Jack", "jack@gmail.com");

        // Logging employee details
        LOGGER.info(employee::toString);
    }
}
