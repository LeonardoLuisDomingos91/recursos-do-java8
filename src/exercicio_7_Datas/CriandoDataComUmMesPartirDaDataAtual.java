package exercicio_7_Datas;

import java.time.LocalDate;

public class CriandoDataComUmMesPartirDaDataAtual {

    public static void main(String[] args) {

        LocalDate mesQueVem = LocalDate.now().plusMonths(1);

        System.out.println(mesQueVem);
    }
}
