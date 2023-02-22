/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import javax.swing.JOptionPane;

/**
 *
 * @author Free
 */
public class A200 implements Observer{
    
    @Override
    public void update() {
      JOptionPane.showMessageDialog(null,"A-200 비행기 출력");
    }
}
