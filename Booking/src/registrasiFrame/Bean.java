
package registrasiFrame;


public class Bean {
    
    private String username;
    private String noHp;
    private String password;
    private String reTypePassword;

    public Bean(String username, String noHp, String password, String reTypePassword) {
        this.username = username;
        this.noHp = noHp;
        this.password = password;
        this.reTypePassword = reTypePassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReTypePassword() {
        return reTypePassword;
    }

    public void setReTypePassword(String reTypePassword) {
        this.reTypePassword = reTypePassword;
    }
    
    
}
