package abstraction;

public class Application3 extends HRDepartment implements Text3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application3 hr=new Application3();
		hr.setId(id);
		System.out.println(hr.getId());
		 hr.setCompanyName(company);
		 System.out.println(hr.getCompanyName());
		 hr.setDepartmentName(department);
		 System.out.println(hr.getDepartmentName());
		 hr.setNumberOfEmployee(employee);
		 System.out.println(hr.getNumberOfEmployee());
		 hr.work();
		 hr.call(m3);
		 
	}

}
