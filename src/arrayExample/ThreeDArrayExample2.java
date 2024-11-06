package arrayExample;

public class ThreeDArrayExample2 {
    public static void main(String[] args) {
        // Initialize a 3D array with predefined values
        int arr[][][] = {
            {   // Layer 0
                {1, 2, 3},  // Row 0
                {4, 5, 6},  // Row 1
                {7, 8, 9}   // Row 2
            },
            {   // Layer 1
                {10, 11, 12}, // Row 0
                {13, 14, 15}, // Row 1
                {16, 17, 18}  // Row 2
            },
            {   // Layer 2
                {19, 20, 21}, // Row 0
                {22, 23, 24}, // Row 1
                {25, 26, 27}  // Row 2
            }
        };

        System.out.println("Element in 3D array:");
        
        // Iterate through each layer of the 3D array
        for (int i = 0; i < 3; i++) {
            System.out.println("Layer: " + (i + 1)); // Print current layer number (1-based index)
            
            // Iterate through each row in the current layer
            for (int j = 0; j < 3; j++) {
                
                // Iterate through each column in the current row
                for (int k = 0; k < 3; k++) {
                    System.out.print(arr[i][j][k] + " "); // Print the current element
                }
                System.out.println(); // Move to the next line after printing all columns in the row
            }
            System.out.println(); // Move to the next line after printing all rows in the layer
        }
        
      
        System.out.println("Accessing specific elements in the 3D array:");
        
        System.out.println("Element in layer 2 at row 3, column 2 is: " + arr[1][2][1]); // Should print 17
    }
}
