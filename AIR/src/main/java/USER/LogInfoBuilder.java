/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER;

/**
 *
 * @author hun24
 */
public class LogInfoBuilder {

    private String id;
    private String pw;

    public LogInfoBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public LogInfoBuilder setPw(String pw) {
        this.pw = pw;
        return this;
    }

    public LogInfo build() {
        LogInfo logInfo = new LogInfo(this.id, this.pw);
        return logInfo;
    }

}
