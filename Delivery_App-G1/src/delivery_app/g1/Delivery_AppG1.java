/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery_app.g1;

/**
 *
 * @author fshai
 */
import javax.swing.JOptionPane;
public class Delivery_AppG1 {

    
    public static void main(String[] args) {

        // Arrays to store months and delivery years
        String[] months = {" ", "JAN", "FEB", "MAR"};
        String[] deliveryYears = {"DELIVERIES 2018     ", "DELIVERIES 2019     ", "DELIVERIES 2020     "};

        // 2D array to store the number of deliveries each month for each year
        int[][] deliveries = {
                {128, 135, 139},
                {155, 129, 175},
                {129, 130, 185},
        };

        // Arrays to store the total deliveries for each month and the maximum and minimum deliveries
        int[] totalDeliveries = {0, 0, 0};
        int maximum = 0;
        int minimum = 2000;

        // Loop through the deliveries array to find the maximum, minimum, and accumulate total deliveries
        for (int i = 0; i < deliveries.length; i++) {
            for (int j = 0; j < deliveries[i].length; j++) {
                if (deliveries[i][j] > maximum) {
                    maximum = deliveries[i][j];
                }
                if (deliveries[i][j] < minimum) {
                    minimum = deliveries[i][j];
                }
                totalDeliveries[j] += deliveries[i][j];
            }
        }

        // StringBuilder to create the formatted output
        StringBuilder output = new StringBuilder();

        // Header for the deliveries report
        output.append("**********************************************\n");
        output.append("DELIVERIES REPORT\n");
        output.append("**********************************************\n");

        // Display the months
        for (int i = 0; i < months.length; i++) {
            if (i == 0) {
                // For the first column (empty), add extra spaces for alignment
                output.append(String.format("                    %-18s", months[i]));
            } else {
                // For other columns, add proper formatting for month names
                output.append(String.format("%-8s ", months[i]));
            }
        }

        output.append("\n");

        // Display the deliveries for each year
        for (int i = 0; i < deliveries.length; i++) {
            // Format each cell to have spaces to align properly
            output.append(String.format("%-17s", deliveryYears[i]));
            for (int j = 0; j < deliveries[i].length; j++) {
                // Format each cell to have 9 spaces to align the numbers properly
                output.append(String.format("%-9s ", deliveries[i][j]));
            }
            output.append("\n");
        }

        // Header for the deliveries statistics
        output.append("**********************************************\n");
        output.append("DELIVERIES STATISTICS\n");
        output.append("**********************************************\n");

        // Display the total, maximum, and minimum deliveries
        output.append("Total deliveries: " + "  " + (totalDeliveries[0] + totalDeliveries[1] + totalDeliveries[2])
                + "\nMaximum deliveries: " + maximum
                + "\nMinimum deliveries: " + minimum
                + "\n**********************************************");

        // Show the result in a JOptionPane dialog
        JOptionPane.showMessageDialog(null, output.toString(), "Deliveries Report", JOptionPane.INFORMATION_MESSAGE);
    }
}

/*
In the line output.append(String.format("%-17s", deliveryYears[i]));, the code uses the String.format() method to format the deliveryYears[i] string before appending it to 
the output StringBuilder.

Let's break down the components of the line:

    String.format(): This is a method in Java that allows you to format strings using placeholders and arguments. It returns a formatted string based on the specified format pattern.

    "%-17s": This is the format pattern used in String.format(). 
Here's what each part means:
        % : Indicates a placeholder for an argument that will be provided.
        - : A flag that specifies left-justification of the string within the given width.
        17 : The width of the field. In this case, the width is set to 17 characters.
        s : The conversion specifier indicating that the argument will be treated as a string.

    deliveryYears[i]: This is the argument that will be formatted using the specified format pattern. 
    deliveryYears[i] represents the string value stored in the deliveryYears array at the index i.

The String.format() method will take the deliveryYears[i] string and ensure that it occupies 17 characters, left-justified. 
If the original string is shorter than 17 characters, it will be padded on the right with spaces to reach the specified width. If it's longer, it will remain as is.

For example, if deliveryYears[i] is "DELIVERIES 2018", 
the result of String.format("%-17s", deliveryYears[i]) would be "DELIVERIES 2018 " (padded with 2 spaces on the right to reach 17 characters). 
If deliveryYears[i] is "DEL 2021", the result would be "DEL 2021 " (padded with 8 spaces on the right to reach 17 characters).
*/