import java.util.Arrays;

public class Array2D {
    private int[][] d = new int[][]{{0,2}, {1,2}};

    public void array(){
        for (int i = 0; i < d.length; i++) {
            System.out.println(Arrays.toString(d[i]));


        }
    }
}
