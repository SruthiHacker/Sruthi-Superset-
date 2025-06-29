public class CustomerService {
    private final CustomerRepository customerRepository;

    
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomer(String id) {
        Customer customer = customerRepository.findCustomerById(id);
        if (customer != null) {
            customer.display();
        } else {
            System.out.println("Customer not found for ID: " + id);
        }
    }
}
