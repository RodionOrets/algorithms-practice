package com.rodionorets.leetcode;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) {
            return image;
        }

        image[sr][sc] = newColor;

        if (sr + 1 <= image.length - 1) image = floodFill(image, sr + 1, sc, newColor);
        if (sc + 1 <= image.length - 1) image = floodFill(image, sr, sc + 1, newColor);
        if (sr - 1 >= 0) image = floodFill(image, sr - 1, sc, newColor);
        if (sc - 1 >= 0) image = floodFill(image, sr, sc - 1, newColor);

        return image;
    }
}
