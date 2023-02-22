/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COMMAND;


/**
 *
 * @author 공용
 */
public class commandexcut extends seatshiftcommand{
    private Command theCommand;
    
    public commandexcut(Command theCommand){
        setCommand(theCommand);
    }

    public void setCommand(Command newCommand){
        this.theCommand = newCommand;
    }
    public void pressed() {
        theCommand.execute();
    }
}
