package TicTacToe2;

public class Victory {
    public static boolean win1;
    public static boolean win = true;

    public static boolean victoryIfCross(String[][] a) {

            if (a[0][0].equals(StartGame.tic) && a[0][1].equals(StartGame.tic) && a[0][2].equals(StartGame.tic)) {
                peek1();
            } else if (a[1][0].equals(StartGame.tic) && a[1][1].equals(StartGame.tic) && a[1][2].equals(StartGame.tic)) {
                peek1();
            } else if (a[2][0].equals(StartGame.tic) && a[2][1].equals(StartGame.tic) && a[2][2].equals(StartGame.tic)) {
                peek1();
            } else if (a[0][0].equals(StartGame.tic) && a[1][0].equals(StartGame.tic) && a[2][0].equals(StartGame.tic)) {
                peek1();
            } else if (a[0][1].equals(StartGame.tic) && a[1][1].equals(StartGame.tic) && a[2][1].equals(StartGame.tic)) {
                peek1();
            } else if (a[0][2].equals(StartGame.tic) && a[1][2].equals(StartGame.tic) && a[2][2].equals(StartGame.tic)) {
                peek1();
            } else if (a[0][0].equals(StartGame.tic) && a[1][1].equals(StartGame.tic) && a[2][2].equals(StartGame.tic)) {
                peek1();
            } else if (a[0][2].equals(StartGame.tic) && a[1][1].equals(StartGame.tic) && a[2][0].equals(StartGame.tic)) {
                peek1();
            }
            return win1;
    }

    public static boolean victoryIfZero(String[][] a) {

            if (a[0][0].equals(StartGame.tac) && a[0][1].equals(StartGame.tac) && a[0][2].equals(StartGame.tac)) {
                peek1();
            } else if (a[1][0].equals(StartGame.tac) && a[1][1].equals(StartGame.tac) && a[1][2].equals(StartGame.tac)) {
                peek1();
            } else if (a[2][0].equals(StartGame.tac) && a[2][1].equals(StartGame.tac) && a[2][2].equals(StartGame.tac)) {
                peek1();
            } else if (a[0][0].equals(StartGame.tac) && a[1][0].equals(StartGame.tac) && a[2][0].equals(StartGame.tac)) {
                peek1();
            } else if (a[0][1].equals(StartGame.tac) && a[1][1].equals(StartGame.tac) && a[2][1].equals(StartGame.tac)) {
                peek1();
            } else if (a[0][2].equals(StartGame.tac) && a[1][2].equals(StartGame.tac) && a[2][2].equals(StartGame.tac)) {
                peek1();
            } else if (a[0][0].equals(StartGame.tac) && a[1][1].equals(StartGame.tac) && a[2][2].equals(StartGame.tac)) {
                peek1();
            } else if (a[0][2].equals(StartGame.tac) && a[1][1].equals(StartGame.tac) && a[2][0].equals(StartGame.tac)) {
                peek1();
            }
            return win1;
        }

    public static void peek1() {
        if(Inside.zeroOrOne && Player1.crossOrZero){
            System.out.println("?????????? 1 ??????????????!");
            System.out.println("????????????????????!");
            win1 = win;
        }else if(Inside.zeroOrOne && Player1.crossOrZero == false){
            System.out.println("?????????? 1 ??????????????!");
            System.out.println("????????????????????!");
            win1 = win;
        }else{
            System.out.println("?????????? 2 ??????????????!");
            System.out.println("????????????????????!");
            win1 = win;
        }
    }
    }

