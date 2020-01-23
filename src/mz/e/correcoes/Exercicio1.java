
package mz.e.correcoes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author joseseie
 */
public class Exercicio1 {
    
    // # Algoritmo:
    // 1. Ler o nome do aluno
    // 2. Ler as notas de cada uma das disciplinas.
    // 3. Calcular a media
    // 4. Imprimir a media
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int total = 2;
        String nomes[] = new String[total];
        double medias[] = new double[total];
        double matematica[] = new double[total];
        double fisica[] = new double[total];
        
        for (int i = 0; i < total; i++) {
            
            System.out.println("Introduza o nome do aluno [" + i + "]");
            nomes[i] = s.next();

            System.out.println("Introduza a nota de Matemática: ");
            matematica[i] = s.nextDouble();

            System.out.println("Introduza a nota de Fisica: ");
            fisica[i] = s.nextDouble();

            medias[i] = matematica[i] * 0.7 + fisica[i] * 0.3;
            
        }
        
        System.out.println("Alunos: " + Arrays.toString(nomes));
        System.out.println("Matematica: " + Arrays.toString(matematica));
        System.out.println("Fisica: " + Arrays.toString(fisica));
        System.out.println("Media: " + Arrays.toString(medias));
        
        
    }

    
}
