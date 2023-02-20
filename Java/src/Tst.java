public class Tst {
    int ini = 0;
    int fim = 25;

    public void print() {
        // 4 chamda.
        // 22+2 = 24;
        System.out.println(ini + fim);
    }

    // 2 chamada.
    {
        // ini = 4;
        ini = fim % 7;
        // fim = 12;
        fim = ini * 3;
    }

    // 1 chamada.
    Tst(int a, int b) {
        // 3 chamada.
        // ini = 2;
        ini /= 2;
        // fim = 22;
        fim += 10;
    }

}
