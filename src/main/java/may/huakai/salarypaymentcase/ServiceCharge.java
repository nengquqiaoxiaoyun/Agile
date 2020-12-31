package may.huakai.salarypaymentcase;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author: huakaimay
 * @since: 2020-12-30
 */
public class ServiceCharge {

    private LocalDateTime date;
    /**
     * 会费
     */
    private BigDecimal charge;

    public ServiceCharge() {

    }

    public ServiceCharge(LocalDateTime date, BigDecimal charge) {
        this.date = date;
        this.charge = charge;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public BigDecimal getCharge() {
        return charge;
    }
}
