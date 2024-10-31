package rekursi.praktikum;

public class menaraHanoi {
    public static void doMenara(int n, char fromRod, char toRod, char auxRod){
        if (n == 1) {
            System.out.println("pindah disk 1 dari " + fromRod + " ke " + toRod);
            return;
        }

        doMenara(n - 1, fromRod, auxRod, toRod);
        
        System.out.println("Pindah disk " + n + " dari " + fromRod + " ke " + toRod);

        doMenara(n - 1, auxRod, toRod, fromRod);

    }
    public static void main(String[] args){
        int n = 3;
        doMenara(n, 'A', 'C', 'B');
    }
}
