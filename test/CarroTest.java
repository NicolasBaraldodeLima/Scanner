package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {

        public static void main(String[] args) {
            Carro carro1 = new Carro();
            Carro carro2 = new Carro();

            carro1.ano = 1969;
            carro1.nome = "Honda Bala";
            carro1.modelo = "Honda";

            carro2.ano = 1968;
            carro2.nome = "Mustang";
            carro2.modelo = "GT 500";

            carro1 = carro2;

            System.out.println("Carro 1:");
            System.out.println(carro1.nome);
            System.out.println(carro1.modelo);
            System.out.println(carro1.ano);

            System.out.println("\nCarro 3:");
            System.out.println(carro2.nome);
            System.out.println(carro2.modelo);
            System.out.println(carro2.ano);
        }
}
