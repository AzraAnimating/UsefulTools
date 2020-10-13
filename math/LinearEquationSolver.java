public class LinearEquationSolver {

    public double[][] gaussAlgorythmSolve(final double[][] matrix) {

        double factor1 = 0;
        double factor2 = 0;


        for (int i = 0; i < matrix.length; i++) {

            factor1 = matrix[i][i];
            if (factor1 != 0) {
                for (int j = 0; j < matrix.length; j++) {
                    factor2 = matrix[j][i];
                    if (i != j && factor2 != 0) {
                        for (int k = 0; k < matrix.length + 1; k++) {
                            matrix[j][k] = factor1 * matrix[j][k] - factor2 * matrix[i][k];
                        }
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            factor1 = matrix[i][i];
            if (matrix[i][i] != 0) {
                for (int j = 0; j < matrix.length + 1; j++) {
                    if (matrix[i][j] != 0) {
                        matrix[i][j] = matrix[i][j] / factor1;
                    }
                }
            }
        }

        return matrix;
    }

}

/*
        double[][] mat = {{2, 3, -6, 8}, {5, 1, 9, 5}, {9, 6, 8, 8}};


        final LinearEquationSolver linearEquationSolver = new LinearEquationSolver();

        mat = linearEquationSolver.gaussAlgorythmSolve(mat);

        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][3]);//i=0-2,j=amountOfVariables
        }
 */
