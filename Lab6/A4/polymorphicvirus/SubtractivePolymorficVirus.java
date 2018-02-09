/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphicvirus;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Heeramani
 */
public class SubtractivePolymorficVirus extends PolymorphicVirusClass {
    
    /**
     *
     * @param number1
     * @param number2
     */
    public SubtractivePolymorficVirus(int number1, int number2) {
        super(number1, number2);
    }
    
    public String execute() {
        int sum = this.getPolymorphicVirusSum();
        int number1 = ThreadLocalRandom.current().nextInt(sum, 2 * sum +1);
        int number2 = number1 - sum;
        return (number1 + " - " + number2 + " = " + sum);
    }
}
