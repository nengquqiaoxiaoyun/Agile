package may.huakai.salarypaymentcase.paymentclafic;

import may.huakai.salarypaymentcase.TimeCard;

import java.math.BigDecimal;

/**
 * @author: huakaimay
 * @since: 2020-12-30
 */
public class HourlyClassfication implements PaymentClassification {

    private BigDecimal hourlyRate;

    private TimeCard timeCard;

    public HourlyClassfication() {
    }

    public HourlyClassfication(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void addTimeCard(TimeCard timeCard) {
        this.timeCard = timeCard;

    }
}
