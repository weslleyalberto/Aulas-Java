package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntrada {
    private String username;
    private Date momento;

    public LogEntrada(String username, Date momento) {
        this.username = username;
        this.momento = momento;
    }

    public String getUsername() {
        return username;
    }

    public Date getMomento() {
        return momento;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntrada)) return false;
        LogEntrada that = (LogEntrada) o;
        return getUsername().equals(that.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }
}
