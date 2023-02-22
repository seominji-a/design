/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEAT;

import COMMAND.seatshiftcommand.Command;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 공용
 */
public class seatshiftdata3 implements Command {

    private seatshiftdata data3;

    public seatshiftdata3(seatshiftdata data3) {
        this.data3 = data3;
    }

    @Override
    public void execute() {
        try {
            data3.datashift3();
        } catch (IOException ex) {
            Logger.getLogger(seatshiftdata3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
