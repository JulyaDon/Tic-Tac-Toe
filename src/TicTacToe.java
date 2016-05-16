import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] A = new String[3][3];
        int n1;
        int n2;
        int k = 0;

        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<A.length; j++){
                A[i][j] = " ";
            }
        }

        getOut(A);

        do{

                System.out.println("Для заполнения клеточки крестиком введите номер строки:");
                Scanner s = new Scanner(System.in);
                n1 = s.nextInt();
                System.out.println("Для заполнения клеточки крестиком введите номер столбца:");
                Scanner sc = new Scanner(System.in);
                n2 = sc.nextInt();
            while(A[(n1-1)][(n2-1)] == "O"||A[(n1-1)][(n2-1)] == "X"){
                System.out.println("Вы ввели номера уже заполненой ячейки. Для заполнения клеточки крестиком введите номер строки повторно:");
                Scanner g = new Scanner(System.in);
                n1 = s.nextInt();
                System.out.println("Вы ввели номера уже заполненой ячейки. Для заполнения клеточки крестиком введите номер столбца повторно::");
                Scanner df = new Scanner(System.in);
                n2 = sc.nextInt();
                getOut(A);
            }
            A[(n1-1)][(n2-1)] = "X";

            //вывод
            getOut(A);
            //метод проверки на победу
            if (getWin(A) == true) break;
            k++;
            if(k == 9)break;
                System.out.println("Для заполнения клеточки ноликом введите номер строки:");
                Scanner c = new Scanner(System.in);
                n1 = c.nextInt();
                System.out.println("Для заполнения клеточки ноликом введите номер столбца:");
                Scanner cs = new Scanner(System.in);
                n2 = cs.nextInt();
                getOut(A);
            while(A[(n1-1)][(n2-1)] == "O"||A[(n1-1)][(n2-1)] == "X"){
                System.out.println("Вы ввели номера уже заполненой ячейки. Для заполнения клеточки ноликом введите номер строки повторно:");
                Scanner g = new Scanner(System.in);
                n1 = s.nextInt();
                System.out.println("Вы ввели номера уже заполненой ячейки. Для заполнения клеточки ноликом введите номер столбца повторно::");
                Scanner df = new Scanner(System.in);
                n2 = sc.nextInt();
                getOut(A);
            }
            A[(n1-1)][(n2-1)] = "O";

            //вывод:
            getOut(A);
            //метод проверки на победу:
            if (getWin(A) == true) break;
            k++;
        }
        while(k<9);
    }

    public static void getOut(String[][] A){

        System.out.println("  1    2    3");
        System.out.println(" ----+---+----");
        for(int i = 0; i<A.length; i++){
            System.out.print((i+1) + "|");
            for(int j = 0; j<A.length; j++){
                System.out.print(" " + A[i][j] + " |");
            }
            System.out.println();
            System.out.println(" ----+---+----");
        }
    }

    public static boolean getWin(String[][]A){
        boolean win = false;
        //ROWS
        if ((A[0][0].equals(A[0][1]))&&(A[0][1].equals(A[0][2]))&&(!A[0][0].equals(" "))){
            win = true;
            System.out.println(A[0][0] + " Wins!");
        }
        if ((A[1][0].equals(A[1][1]))&&(A[1][1].equals(A[1][2]))&&(!A[1][0].equals(" "))){
            win = true;
            System.out.println(A[1][0] + " Wins!");
        }
        if ((A[2][0].equals(A[2][1]))&&(A[2][1].equals(A[2][2]))&&(!A[2][0].equals(" "))){
            win = true;
            System.out.println(A[2][0] + " Wins!");
        }
        //COLUMNS
        if ((A[0][0].equals(A[1][0]))&&(A[1][0].equals(A[2][0]))&&(!A[0][0].equals(" "))){
            win = true;
            System.out.println(A[0][0] + " Wins!");
        }
        if ((A[0][1].equals(A[1][1]))&&(A[1][1].equals(A[2][1]))&&(!A[0][1].equals(" "))){
            win = true;
            System.out.println(A[0][1] + " Wins!");
        }
        if ((A[0][2].equals(A[1][2]))&&(A[1][2].equals(A[2][2]))&&(!A[0][2].equals(" "))){
            win = true;
            System.out.println(A[0][2] + " Wins!");
        }
        //DIAG
        if ((A[0][0].equals(A[1][1]))&&(A[1][1].equals(A[2][2]))&&(!A[1][1].equals(" "))){
            win = true;
            System.out.println(A[1][1] + " Wins!");
        }
        if ((A[0][2].equals(A[1][1]))&&(A[1][1].equals(A[2][0]))&&(!A[1][1].equals(" "))){
            win = true;
            System.out.println(A[1][1] + " Wins!");
        }
        return win;
    }
}
