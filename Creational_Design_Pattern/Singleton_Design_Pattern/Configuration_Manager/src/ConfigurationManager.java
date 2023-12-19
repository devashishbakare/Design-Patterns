public class ConfigurationManager {

    public static ConfigurationManager instance;

    private String dbUrl;
    private String userName;
    private String password;

    private ConfigurationManager(){
        setConfiguration();
    }

    public static ConfigurationManager getInstance(){
        if(instance == null){
           instance = new ConfigurationManager();
        }
        return instance;
    }
    private void setConfiguration(){
        this.dbUrl = "db connection url";
        this.userName = "user";
        this.password = "password";
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
