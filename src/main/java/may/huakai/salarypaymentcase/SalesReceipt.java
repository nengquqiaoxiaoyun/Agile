package may.huakai.salarypaymentcase;

import java.time.LocalDateTime;

/**
 * 销售凭条
 *
 * @author: huakaimay
 * @since: 2020-12-30
 */
public class SalesReceipt {

    private LocalDateTime date;
    /**
     * 销售数量
     */
    private int amount;

    public SalesReceipt() {
    }

    public SalesReceipt(LocalDateTime date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }
}
