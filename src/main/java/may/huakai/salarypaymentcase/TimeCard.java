package may.huakai.salarypaymentcase;

import java.time.LocalDateTime;

/**
 * 时间卡
 * @author: huakaimay
 * @since: 2020-12-30
 */
public class TimeCard {
    private LocalDateTime localDateTime;
    private Double hours;

    public TimeCard(LocalDateTime date, Double hours) {
        this.localDateTime = date;
        this.hours = hours;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public Double getHours() {
        return hours;
    }
}
