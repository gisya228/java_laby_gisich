import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Main {
    private String name;
    private List<Department> departments;

    public Main(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String name) {
        Department department = new Department(name);
        departments.add(department);
    }

    public void addProductToDepartment(String departmentName, String productName) {
        Department department = getDepartmentByName(departmentName);
        if (department != null) {
            department.addProduct(productName);
        }
    }

    public void addServiceToDepartment(String departmentName, String serviceName) {
        Department department = getDepartmentByName(departmentName);
        if (department != null) {
            department.addService(serviceName);
        }
    }

    private Department getDepartmentByName(String departmentName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                return department;
            }
        }
        System.out.println("Department " + departmentName + " not found.");
        return null;
    }

    public class Department {
        private String name;
        private List<String> products;
        private List<String> services;

        public Department(String name) {
            this.name = name;
            this.products = new ArrayList<>();
            this.services = new ArrayList<>();
        }

        public void addProduct(String productName) {
            products.add(productName);
        }

        public void addService(String serviceName) {
            services.add(serviceName);
        }

        public String getName() {
            return name;
        }

        public List<String> getProducts() {
            return products;
        }

        public List<String> getServices() {
            return services;
        }
    }
}