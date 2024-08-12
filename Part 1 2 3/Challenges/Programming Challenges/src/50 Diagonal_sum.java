class Diagonal_sum {
    public static void main(String[] args) {
        System.out.println("welcome to Diogonal Sum Programme ");
        int[][] matrix = ArrayUtility.input2DArray();
        long sum = DiagonalSum(matrix);

        if(matrix.length % 2 != 0)  {
            int ind = matrix.length / 2;
            sum -= matrix[ind][ind];
        }
        System.out.println("The sum of Diagonal is : "+ sum);
    }

    public static long DiagonalSum(int[][] matrix)
    {
        long leftSum = Left_Diagonal_Sum(matrix);
        long rightSum = Right_Diagonal_Sum(matrix);

        return (leftSum + rightSum);
    }

    public static long Left_Diagonal_Sum(int[][] matrix) {
        int i = 0;
        long sum =0;
        while(i<matrix.length)  {
            sum += matrix[i][i];
            i++;
        }
        return sum;
    }

    public static long Right_Diagonal_Sum(int[][] matrix)    {
        int i = 0;
        long sum =0;
        while (i < matrix.length)   {
            int col = matrix.length - 1 - i;
            sum += matrix[i][col];
            i++;
        }
        return sum;
    }

}

