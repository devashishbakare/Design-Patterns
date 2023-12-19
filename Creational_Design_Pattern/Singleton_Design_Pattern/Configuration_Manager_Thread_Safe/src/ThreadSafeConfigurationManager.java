public class ThreadSafeConfigurationManager {

    private static volatile ThreadSafeConfigurationManager instance;
    private String dbUrl;
    private String userName;
    private String password;

    private ThreadSafeConfigurationManager(){
        setConfigureDetails();
    }

    public static ThreadSafeConfigurationManager getInstance(){

        if(instance == null){
            synchronized (ThreadSafeConfigurationManager.class){
                if(instance == null){
                    instance = new ThreadSafeConfigurationManager();
                }
            }
        }

        return instance;
    }

    public void printCurrentInstance(){
        System.out.println("Instance: "+instance);
    }
    private void setConfigureDetails(){
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
