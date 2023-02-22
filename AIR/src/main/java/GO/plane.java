/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GO;

/**
 *
 * @author Free
 */
public class plane {

    private Gobehavior gobehavior;

    public void setgo(Gobehavior gobehavior) {
        System.out.println("--스트레티지 패턴 구현--");
        this.gobehavior = gobehavior;
    }

    public void dogo() {
        gobehavior.dogo();
        System.out.println("--스트레티지 패턴 완료--");
    }
}
