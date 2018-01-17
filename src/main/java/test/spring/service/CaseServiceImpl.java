package test.spring.service;

import org.springframework.stereotype.Service;
import test.spring.entity.Case;

import java.util.List;

@Service
public class CaseServiceImpl extends ForseService implements CaseService{
    public List<Case> getAll() {
        return getForceApi().queryAll("SELECT Id, CaseNumber, ContactId, AccountId, AssetId, ParentId, SuppliedName, SuppliedEmail, SuppliedPhone, SuppliedCompany, Type, Status," +
                " Reason, Origin, Subject, Priority, Description, IsClosed, ClosedDate, IsEscalated, OwnerId, CreatedDate, CreatedById, LastModifiedDate, LastModifiedById, SystemModstamp, " +
                " ContactPhone, ContactMobile, ContactEmail, ContactFax, LastViewedDate, LastReferencedDate FROM Case", Case.class).getRecords();
    }

    public void add(Case newCase){
        create(newCase);
    }


    String getType() {
        return "Case";
    }
}
