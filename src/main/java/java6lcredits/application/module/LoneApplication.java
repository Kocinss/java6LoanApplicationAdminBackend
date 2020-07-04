package java6lcredits.application.module;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.Date;

public class LoneApplication {
    @Id
    @GeneratedValue
    private long LoneApplication;
    @Column
    private LoneApplication loneApplication;
    @Column(name = "{from}")
    private Data from;
    @Column(name = "{to}")
    private Date to;
    @Column
    private BigDecimal amount;
    @Column
    private String type;
    @Column
    @ManyToOne(fetch = FetchType.EAGER  )
    private User user;

    public long getLoneApplication() {
        return LoneApplication;
    }

    public void setLoneApplication(java6lcredits.application.module.LoneApplication loneApplication) {
        this.loneApplication = loneApplication;
    }

    public Data getFrom() {
        return from;
    }

    public void setFrom(Data from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setLoneApplication(long loneApplication) {
        LoneApplication = loneApplication;
    }
}
