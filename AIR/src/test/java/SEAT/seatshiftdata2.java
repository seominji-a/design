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
public class seatshiftdata2 implements Command {
    private seatshiftdata data2;
    public seatshiftdata2(seatshiftdata data2){
        this.data2 = data2;
    }

    @Override
    public void execute() {
        try {
            data2.datashift2();
        } catch (IOException ex) {
            Logger.getLogger(seatshiftdata2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
