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
public class jeju implements Gobehavior {

    public static String A;

    @Override
    public void dogo() {
        A = "부산" + " " + "제주";
        System.out.println(A);
    }
}
