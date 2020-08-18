package abstraction;

public class Application2 extends AdminDepartment implements Text2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Application2 admin=new Application2();
    
    admin.setId(id);
    System.out.println(admin.getId());
    admin.setCompanyName(company);
     System.out.println(admin.getCompanyName());
     admin.setDepartmentName(department);
     System.out.println(admin.getDepartmentName());
     admin.setNumberOfEmployee(employee);
     System.out.println(admin.getNumberOfEmployee());
     admin.setCostLimit(cost);
     System.out.println(admin.getCostLimit());
     admin.work();
     admin.call(message1);
     admin.requestAccess(cost);
	}

}
