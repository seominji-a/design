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
public class LogInfo {

    private String id;
    private String pw;

    public LogInfo(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getPersonInfo() {
        String logInfo = String.format("%s%s", id, pw);
        return logInfo;
    }

}
