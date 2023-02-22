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
public class seatshiftdata1 implements Command {

    private seatshiftdata data1;

    public seatshiftdata1(seatshiftdata data) {
        this.data1 = data;
    }

    @Override
    public void execute() {

        try {
            data1.datashift1();
        } catch (IOException ex) {
            Logger.getLogger(seatshiftdata1.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

    }
}
