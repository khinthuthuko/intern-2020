package abstraction;

public class Application extends AccountDepartment implements Text{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Application account =new  Application();
  
 
account.setId(pp);
System.out.println(account.getId());
 account.setCompanyName(company);
 System.out.println(account.getCompanyName());
 account.setDepartmentName(department);
 System.out.println(account.getDepartmentName());
 account.setNumberOfEmployee(employee);
 System.out.println(account.getNumberOfEmployee());
 account.setCapitalAmount(capital);
 System.out.println(account.getCapitalAmount());
 account.setCraditAmount(cradit);
 System.out.println(account.getCraditAmount());
 account.work();
 account.call(mm);
 System.out.println(account.isMoreInvestmentOK());
	}

}
