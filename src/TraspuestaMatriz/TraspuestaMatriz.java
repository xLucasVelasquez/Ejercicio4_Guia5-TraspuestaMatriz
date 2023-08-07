
package TraspuestaMatriz;


public class TraspuestaMatriz {

    
    public static void main(String[] args) {
        int matriz[][]=new int[4][4];
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                matriz1[j] = (int)(Math.random()*3+1);
                System.out.print(matriz1[j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int[] matriz1 : matriz) {
                System.out.print(matriz1[i] + " ");
            }
            System.out.println("");
        }
    }
}
