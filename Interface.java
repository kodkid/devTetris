public class Interface {
    private char [][] linha1;
    private char [][] coluna2;
    final private char VAZIO = '.';
    final private char OCUPADO_= '#';

    public Interface( char [][] linha1, char [][] coluna2 ) {
         this.linha1 = new char[20][10];
         this.coluna2 = new char[20][10];

    }

    public char[][] getLinha1() {
        return linha1;

    }
     public char[][] getColuna2() {
        return coluna2;

    }
    public void setBoard(char[][] boar1 , char[][] boar2) {
        for (int i = 0; i < 20; i++){
            for (int x = 0; x< 10 ; x++){
                linha1[i][x] = VAZIO;
                coluna2[i][x] = VAZIO;
            }
        }


    }

}
