package arrayExample;

public class ThreeDArrayExample {
    public static void main(String args[]) {
        // Initialize a 3D array with 3 layers, 4 rows, and 3 columns
        int arr[][][] = new int[3][4][3];
        
        // Manually filling each element of the 3D array
        // Layer 0
        arr[0][0][0] = 34;  // Element at layer 0, row 0, column 0
        arr[0][0][1] = 12;  // Element at layer 0, row 0, column 1
        arr[0][0][2] = 2;   // Element at layer 0, row 0, column 2

        arr[0][1][0] = 1;   // Element at layer 0, row 1, column 0
        arr[0][1][1] = 45;  // Element at layer 0, row 1, column 1
        arr[0][1][2] = 6;   // Element at layer 0, row 1, column 2

        arr[0][2][0] = 7;   // Element at layer 0, row 2, column 0
        arr[0][2][1] = 34;  // Element at layer 0, row 2, column 1
        arr[0][2][2] = 77;  // Element at layer 0, row 2, column 2

        arr[0][3][0] = 3;   // Element at layer 0, row 3, column 0
        arr[0][3][1] = 1;   // Element at layer 0, row 3, column 1
        arr[0][3][2] = 89;  // Element at layer 0, row 3, column 2

        // Layer 1
        arr[1][0][0] = 5;   // Element at layer 1, row 0, column 0
        arr[1][0][1] = 89;  // Element at layer 1, row 0, column 1
        arr[1][0][2] = 43;  // Element at layer 1, row 0, column 2

        arr[1][1][0] = 25;  // Element at layer 1, row 1, column 0
        arr[1][1][1] = 6;   // Element at layer 1, row 1, column 1
        arr[1][1][2] = 32;  // Element at layer 1, row 1, column 2

        arr[1][2][0] = 12;  // Element at layer 1, row 2, column 0
        arr[1][2][1] = 23;  // Element at layer 1, row 2, column 1
        arr[1][2][2] = 7;   // Element at layer 1, row 2, column 2

        arr[1][3][0] = 56;  // Element at layer 1, row 3, column 0
        arr[1][3][1] = 32;  // Element at layer 1, row 3, column 1
        arr[1][3][2] = 12;  // Element at layer 1, row 3, column 2

        // Layer 2
        arr[2][0][0] = 8;   // Element at layer 2, row 0, column 0
        arr[2][0][1] = 12;  // Element at layer 2, row 0, column 1
        arr[2][0][2] = 90;  // Element at layer 2, row 0, column 2

        arr[2][1][0] = 12;  // Element at layer 2, row 1, column 0
        arr[2][1][1] = 9;   // Element at layer 2, row 1, column 1
        arr[2][1][2] = 23;  // Element at layer 2, row 1, column 2

        arr[2][2][0] = 76;  // Element at layer 2, row 2, column 0
        arr[2][2][1] = 9;   // Element at layer 2, row 2, column 1
        arr[2][2][2] = 10;  // Element at layer 2, row 2, column 2

        arr[2][3][0] = 11;  // Element at layer 2, row 3, column 0
        arr[2][3][1] = 12;  // Element at layer 2, row 3, column 1
        arr[2][3][2] = 13;  // Element at layer 2, row 3, column 2

        // Display the filled 3D array
        System.out.println("3D array filled with elements:");
        for (int i = 0; i < 3; i++) {  // Iterate over layers
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {  // Iterate over rows
                for (int k = 0; k < 3; k++) {  // Iterate over columns
                    System.out.print(arr[i][j][k] + " ");  // Print element
                }
                System.out.println();  // New line after each row
            }
            System.out.println();  // New line after each layer
        }
    }
}
