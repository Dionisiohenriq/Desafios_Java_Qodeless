import java.util.Arrays;

public class Desafio2 {
    // REQUERIMENTOS:
    //R01 – SOMAR A IDADE DE TODOS OS UBUNTUS
    //R02 – AGRUPAR O NOME DE TODOS OS UBUNTUS
    //R03 – CALCULAR MÉDIA IMC DE TODOS UBUNTOS
    //R04 – CONTAR QUANTOS UBUNTUS SÃO DEVS
    //R05 – EXIBIR SOMENTE UBUNTUS COM SOBRENOME SILVA

    public static void main(String[] args) {

        System.out.println("UBUNTU 02 - STARTS");

        String nome1 = "Ubuntu1 Silva";
        int idade1 = 33;
        double peso1 = 88.50;
        float altura1 = 1.65f;
        boolean ehDev1 = true;

        String nome2 = "Ubuntu2 Santos";
        int idade2 = 26;
        double peso2 = 84.5;
        float altura2 = 2.10f;
        boolean ehDev2 = true;

        String nome3 = "Ubuntu3 Silva";
        int idade3 = 85;
        double peso3 = 66.5;
        float altura3 = 1.40f;
        boolean ehDev3 = false;

        //R01 – SOMAR A IDADE DE TODOS OS UBUNTUS
        int soma = idade1 + idade2 + idade3;
        System.out.println("A soma das idades é: " + soma);

        //R02 – AGRUPAR O NOME DE TODOS OS UBUNTUS
        String[] nomes = {nome1, nome2, nome3};
        System.out.println(Arrays.toString(nomes));

        //R03 – CALCULAR MÉDIA IMC DE TODOS UBUNTOS
        double imc1 = peso1 * Math.pow(altura1, 2);
        double imc2 = peso2 * Math.pow(altura2, 2);
        double imc3 = peso3 * Math.pow(altura3, 2);
        double mediaImcs = (imc1 + imc2 + imc3)/ 3;
        System.out.println("A média dos imcs é: " + Math.round(mediaImcs));


        //R04 – CONTAR QUANTOS UBUNTUS SÃO DEVS
        boolean[] devs = {ehDev1, ehDev2, ehDev3};
        int counter = 0;
        for (boolean ehDev : devs) {
            if(ehDev)
                counter++;
        }
        System.out.println("Qtd de Devs: " + counter);

        //R05 – EXIBIR SOMENTE UBUNTUS COM SOBRENOME SILVA
        for(String nome : nomes) {
            if(nome.contains("Silva"))
                System.out.println(nome);

        }
    }
}
