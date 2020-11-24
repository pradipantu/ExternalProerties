package com.boot.profiles.ExternalProperties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("server")
public class ServerProperties {

    private String email;
    private String ip;
    private String path;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }


    @Override
    public String toString() {
        return "ServerProperties{" +
                "email='" + email + '\'' +
                "ip='" + ip + '\'' +
                "path='" + path + '\'' +
                '}';
    }
}
