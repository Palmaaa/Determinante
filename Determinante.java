/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinante;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Gustavo Palma
 */
public class Determinante {
    
    public static double det(double m[][]) {
        double det = 0;
        if (m.length != 1) {
            for (int i = 0; i < m[0].length; i++) {
                if (i % 2 == 0) {
                    det += m[0][i]*det(criarMatriz(m, i)); 
                } else {
                    det += (-1)*m[0][i]*det(criarMatriz(m, i)); 
                }
            }
            return det;
        } else {
            return m[0][0];
        }               
    }
    
    public static double[][] criarMatriz(double m[][], int j) {
        double[][] novaMatriz = new double[m.length - 1][m.length - 1];
        for (int i = 1; i < m.length; i++) {
            for (int k = 0; k < m[0].length; k++) {
                if (k != j) {
                    if (novaMatriz.length == 1) {
                        novaMatriz[0][0] = m[i][k];   
                    } else {
                        if (k < j) {
                            novaMatriz[i - 1][k] = m[i][k];
                        } else {
                            novaMatriz[i - 1][k - 1] = m[i][k];
                        }
                    }
                }
            }
        }
        return novaMatriz;
    }
    
}
