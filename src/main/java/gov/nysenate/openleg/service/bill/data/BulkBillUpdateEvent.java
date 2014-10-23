package gov.nysenate.openleg.service.bill.data;

import gov.nysenate.openleg.model.bill.Bill;
import gov.nysenate.openleg.service.base.ContentUpdateEvent;

import java.time.LocalDateTime;
import java.util.Collection;

public class BulkBillUpdateEvent extends ContentUpdateEvent
{
    protected Collection<Bill> bills;

    public BulkBillUpdateEvent(Collection<Bill> bills, LocalDateTime updateDateTime) {
        super(updateDateTime);
        this.bills = bills;
    }

    public Collection<Bill> getBills() {
        return bills;
    }
}