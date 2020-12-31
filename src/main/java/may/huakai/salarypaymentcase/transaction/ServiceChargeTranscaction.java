package may.huakai.salarypaymentcase.transaction;

import may.huakai.salarypaymentcase.Affiliation;
import may.huakai.salarypaymentcase.ServiceCharge;
import may.huakai.salarypaymentcase.UnionAffiliation;
import may.huakai.salarypaymentcase.dao.GpayrollDatabase;
import may.huakai.salarypaymentcase.dao.impl.GpayrollDatabaseImpl;
import may.huakai.salarypaymentcase.entity.Employee;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author: huakaimay
 * @since: 2020-12-30
 */
public class ServiceChargeTranscaction extends Transaction {
    private GpayrollDatabase gpayrollDatabase = new GpayrollDatabaseImpl();
    /**
     * 协会成员id
     */
    private int memeberId;
    private LocalDateTime date;
    /**
     * 会费
     */
    private BigDecimal charge;

    public ServiceChargeTranscaction(int memeberId, LocalDateTime date, BigDecimal charge) {
        this.memeberId = memeberId;
        this.date = date;
        this.charge = charge;
    }

    @Override
    public void execute() {
        Employee unionMember = gpayrollDatabase.getUnionMemberById(memeberId);
        if (unionMember != null) {
            Affiliation affiliation = unionMember.getAffiliation();
            if (affiliation instanceof UnionAffiliation) {
                UnionAffiliation unionAffiliation = (UnionAffiliation)affiliation;
                unionAffiliation.addServiceCharge(new ServiceCharge(date, charge));
            } else {
                System.out.println("The member is no a UnionAffiliation");
            }
        } else {
            System.err.println("No Such Union Member");
        }

    }
}
