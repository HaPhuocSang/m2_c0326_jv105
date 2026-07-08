package case_study.entity;

import case_study.entity.enums.CustomerType;
import case_study.entity.enums.Gender;

public class Customer extends Person {
    private CustomerType customerType;
    private String address;

    public Customer() {
    }

    public Customer(String id, String fullName, String birthday, Gender gender, String identityCard, String phoneNumber, String email, CustomerType customerType, String address) {
        super(id, fullName, birthday, gender, identityCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() + "customerType=" + customerType + ", address='" + address + '\'' + '}';
    }
}
