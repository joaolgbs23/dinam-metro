import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a força do carro");
        float strength = sc.nextFloat();
        System.out.println("digite a distancia que essa força foi exercida");
        float distance = sc.nextFloat();
        float torque = torqueCalculator(distance, strength);


        //utilizarei um metodo com retorno para calcular a potência de um carro
        //Fórmula:
        //Torque (T) = Força (F) x Distância (d)
        //Fórmula Geral:
        //Potência (cv) = (Torque (Nm) x RPM) / 5252
    }
    public static float torqueCalculator(float distance, float strength){
        float torque = distance * strength;
        System.out.println("o torque do seu carro é:"+torque);
        return torque;
    }
    public static float cvCalculator(float torque, float rpm){


        return torque * rpm /2;
    }
}