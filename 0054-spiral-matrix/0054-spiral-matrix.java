class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length==0) {
            return  list;   
        }
        int k;
        int left=0,right= matrix[0].length-1,bottom=matrix.length-1,top =0;
        while (top<=bottom && left <= right) {  
        for(k=left;k<=right;k++) {
            list.add(matrix[top][k]);
        }
        top++;
        for(k=top;k<=bottom;k++) {
            list.add(matrix[k][right]);
        }
        right--;
        if(top<=bottom) {
        for(k=right;k>=left;k--) {
            list.add(matrix[bottom][k]);
        }
        }
        bottom--;
        if(right>=left) {
        for(k=bottom;k>=top;k--) {
            list.add(matrix[k][left]);
        }
    }
        left++;
    }
    return list;
    }
}