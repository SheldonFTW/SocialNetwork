package training.homeworkExeption;

public class Url {

    public String protocol;
    public String domainName;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public Url(String protocol, String domainName) {
        this.protocol = protocol;
        this.domainName = domainName;
    }

    @Override
    public String toString() {
        return "Url{" +
                "protocol='" + protocol + '\'' +
                ", domainName='" + domainName + '\'' +
                '}';
    }
}
