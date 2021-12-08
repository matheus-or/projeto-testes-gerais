package teste02;

import java.util.Calendar;
import java.util.Date;

public class Main {



    public static void main(String[] args) {

        Date dataDeAlteracao;
        String dataFormatada;

        dataDeAlteracao = buscarDataDeAlteracao();

        Calendar cal = Calendar.getInstance();
        cal.setTime(dataDeAlteracao);

        if (cal.get(Calendar.MONTH) >= 10) {
            dataFormatada = (cal.get(Calendar.MONTH)) + "/" + cal.get(Calendar.YEAR);
        } else {
            dataFormatada = "0" + (cal.get(Calendar.MONTH)) + "/" + cal.get(Calendar.YEAR);
        }

        System.out.println(dataFormatada);
    }

    static Date buscarDataDeAlteracao() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2021);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

}
