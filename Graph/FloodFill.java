public class FloodFill {

    // Recursive helper function to perform Flood Fill
    public static void helper(int[][] image, int sr, int sc, int newColor, boolean[][] visited, int oldColor) {
        // Base case: If the current pixel is out of bounds or not of old color, return
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor || visited[sr][sc]) {
            return;
        }

        // Mark the current pixel as visited and change its color to the new color
        visited[sr][sc] = true;
        image[sr][sc] = newColor;

        // Recursively call helper on neighboring pixels
        helper(image, sr + 1, sc, newColor, visited, oldColor); // Down
        helper(image, sr - 1, sc, newColor, visited, oldColor); // Up
        helper(image, sr, sc + 1, newColor, visited, oldColor); // Right
        helper(image, sr, sc - 1, newColor, visited, oldColor); // Left
    }

    // Main flood fill function
    public int[][] floodfill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        int oldColor = image[sr][sc]; // Store the old color of the starting pixel
        helper(image, sr, sc, newColor, visited, oldColor);
        return image;
    }

    // Main function to demonstrate the usage of FloodFill class
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1},
        };

        int sr = 1; // Starting row
        int sc = 1; // Starting column
        int newColor =2; // New color

        FloodFill floodFill = new FloodFill();
        int[][] result = floodFill.floodfill(image, sr, sc, newColor);

        // Print the result
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
