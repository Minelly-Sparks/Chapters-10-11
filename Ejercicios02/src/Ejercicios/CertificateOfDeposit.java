package Ejercicios;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class CertificateOfDeposit {
    private Integer CertificateNum;
    private String LastName;
    private double AccountBalance;
    private GregorianCalendar IssueDate;
    private GregorianCalendar MaturityDate;
    
    public CertificateOfDeposit(int Certificate,String LastName,double Balance, int Day,int Month,int Year){
        CertificateNum=Certificate;
        IssueDate=new GregorianCalendar(19,2,2017);
        GregorianCalendar MaturityDateFinal = null;
        MaturityDate=MaturityDateFinal;
  
    }
    public CertificateOfDeposit(){
        super();
    }

    public Integer getCertificateNum() {
        return CertificateNum;
    }

    public void setCertificateNum(Integer CertificateNum) {
        this.CertificateNum = CertificateNum;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double AccountBalance) {
        this.AccountBalance = AccountBalance;
    }

    public GregorianCalendar getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(GregorianCalendar issueDate) {
        this.IssueDate = issueDate;
    }

    public GregorianCalendar getMaturityDate() {
        return MaturityDate;
    }

    public void setMaturityDate(GregorianCalendar MaturityDate) {
        this.MaturityDate = MaturityDate;
    }
    
    public GregorianCalendar MaturityDateFinal(){
        setIssueDate();
	IssueDate.add(Calendar.YEAR, 1);
	return MaturityDate;
    }

    private void setIssueDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
			
}

