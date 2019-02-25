/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorsandwichdemo;

/**
 *
 * @author Ivan
 */
public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    //this is key, composition, can be concrete class or another decorator
    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    public String make() {
        return customSandwich.make();
    }
}
