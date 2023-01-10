package data;

public class DataFromAgentToDm {

    private long numberOfThread;
    private String configuration;
    private String decrypted;

    public DataFromAgentToDm(long numberOfThread,String decrypted,String configuration){
        this.numberOfThread=numberOfThread;
        this.decrypted=decrypted;
        this.configuration=configuration;
    }

    public long getNumberOfThread() {
        return numberOfThread;
    }

    public String getDecrypted() {
        return decrypted;
    }

    public String getConfiguration() {
        return configuration;
    }
}
