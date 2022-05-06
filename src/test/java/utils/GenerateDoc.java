package utils;

import java.util.Random;

public class GenerateDoc {


    /**
     * Gerador de CPF para criação de massas B2C
     * @return CPF válido
     */
    public static String generateCPF() {

        int[] n = new int[11];
        int d1, d2;
        String cpf = "";
        Random rnd = new Random();
        //Randomize
        for (int i = 1; i < 10; i++) {
            n[i] = rnd.nextInt(10);
        }
        d1 = 0;
        for (int i = 1; i < 10; i++) {
            d1 = d1 + n[10 - i] * (1 + i);
        }
        d1 = (11 - (d1 % 11));
        d1 = (d1 >= 10) ? 0 : d1;
        d2 = d1 * 2;
        for (int i = 1; i < 10; i++) {
            d2 = d2 + n[10 - i] * (2 + i);
        }
        d2 = (11 - (d2 % 11));
        d2 = (d2 >= 10) ? 0 : d2;
        for (int i = 1; i < 10; i++) {
            cpf = cpf + n[i];
        }
        cpf = cpf + d1 + d2;
        return cpf;

    }

    /**
     * Gerador de CNPJ para criação de massas B2B
     * @return CNPJ válido
     */
    public static String generateCNPJ(){
        int[] n = new int[13];
        int d1,d2;
        String cnpj = "";
        Random rnd = new Random();
        //Randomize
        for(int i=1;i<9;i++) {
            n[i] = rnd.nextInt(10);
        }
        n[9]  = 0;
        n[10] = 0;
        n[11] = rnd.nextInt(10);
        n[12] = rnd.nextInt(10);
        d1 = 0;
        for(int i=1;i<9;i++) {
            d1 = d1 + n[13-i] * (1+i);
        }
        for(int i=1;i<5;i++) {
            d1 = d1 + n[5-i] * (1+i);
        }
        d1 = (11 - (d1 % 11));
        d1 = (d1 >= 10) ? 0 : d1 ;
        d2 = d1 *2;
        for(int i=1;i<8;i++) {
            d2 = d2 + n[13-i] * (2+i);
        }
        for(int i=1;i<6;i++) {
            d2 = d2 + n[6-i] * (1+i);
        }
        d2 = (11 - (d2 % 11));
        d2 = (d2 >= 10) ? 0 : d2 ;
        for(int i=1;i<13;i++) {
            cnpj = cnpj + n[i];
        }
        cnpj = cnpj + d1 + d2;
        return cnpj;
    }
}
