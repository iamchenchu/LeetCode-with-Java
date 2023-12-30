/*You are given an m x n integer matrix matrix with the following two properties: Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row. Given an integer target, return true if target is in matrix or false otherwise.
You must write a solution in O(log(m * n)) time complexity.

1. Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true 
2. Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false*/

public class L74_Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;

        int row = matrix.length;
        int column = matrix[0].length;

        int left = 0;
        int right = row * column-1;
        while(left <= right ) {
            int midpoint = left + (right - left)/2;
            int midpoint_element = matrix[midpoint/column][midpoint%column];
            if(target == midpoint_element) {
                return true;
            } else if (target > midpoint_element){
                left = midpoint+1;
            } else if(target < midpoint_element) {
                right = midpoint -1;
            }
        }
        
        return false;
    }

    public static void main(String[] args){

        int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        L74_Search2DMatrix obj = new L74_Search2DMatrix();
        System.out.println(obj.searchMatrix(matrix, target));

    }
    
}
