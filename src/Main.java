import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    static carro opala6c = new carro(75,3,1970, "chevrolet", "opala");
    public static void main(String[] args) {
        float strength = opala6c.getStrength(); //retorna o valor de força do carro
        float distance = opala6c.getDistance();
        float resultadoT = torqueCalculator(distance, strength);
        float resultadoC = cvCalculator(opala6c.getTorque(), opala6c.getRpm());


        //utilizarei um metodo com retorno para calcular a potência de um carro
        //Fórmula:
        //Torque (T) = Força (F) x Distância (d)
        //Fórmula Geral:
        //Potência (cv) = (Torque (Nm) x RPM) / 5252
    }
    public static float torqueCalculator(float distance, float strength){
        float torque = distance * strength;
        opala6c.setTorque(torque);   //pega o valor da variável torque a setta como o valor para o atributo
        System.out.println("o torque do seu carro é:" +torque);
        return torque;
    }
    public static float cvCalculator(float torque, int rpm){
        System.out.println("digite a quantos rpm você deseja saber a potencia do seu carro:");
        int rotaçõesPorSegundo = sc.nextInt();
        opala6c.setRpm(rotaçõesPorSegundo);
        float resultadoemcv = (torque * rotaçõesPorSegundo) /7121; //calculo para cv de potência em cavalos
        System.out.println("a potencia do seu carro é:"+ resultadoemcv);

        return resultadoemcv;
    }
}