/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GO;

/**
 *
 * @author smj
 */
public class plane {

private Gobehavior gobehavior;

public void setgo(Gobehavior gobehavior){
this.gobehavior=gobehavior;
}

public void dogo(){
gobehavior.dogo(); 
}
}
