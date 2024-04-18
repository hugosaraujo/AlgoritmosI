package algoritmos1.busca;

public class Salarios {
    public static void main(String[] args) {
        int totalDeFuncionarios = 4;
        int[] salarios = new int[totalDeFuncionarios];
        salarios[0] = 3200;
        salarios[1] = 6000;
        salarios[2] = 5000;
        salarios[3] = 2200;

        int maiorSalario = 0;
        int menorSalario = 0;

        for (int atual = 0; atual < totalDeFuncionarios; atual++) {
            if(salarios[atual] < salarios[menorSalario]) {
                menorSalario = atual;
            } else if (salarios[atual] > salarios[maiorSalario]){
                maiorSalario = atual;
            }
        }

        System.out.println(maiorSalario);
        System.out.printf("O menor salário entre os funcionarios é %d \n", salarios[menorSalario]);
        System.out.println(menorSalario);
        System.out.printf("O maior salario entre todos os funcionarios é %d \n", salarios[maiorSalario]);
    }
}
