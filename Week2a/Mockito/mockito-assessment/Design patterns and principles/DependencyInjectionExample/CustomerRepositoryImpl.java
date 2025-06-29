import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerDB;

    public CustomerRepositoryImpl() {
        customerDB = new HashMap<>();
        customerDB.put("C001", new Customer("C001", "Alice"));
        customerDB.put("C002", new Customer("C002", "Bob"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerDB.getOrDefault(id, null);
    }
}
