package Registration;

import java.util.ArrayList;

import Data.Customer;

public class CustomerReg {

	private ArrayList<Customer> cR;

	public CustomerReg() {
		cR = new ArrayList<Customer>();
	}

	public void addCustomer(Customer customer) {
		cR.add(customer);

	}

	public Customer getCustomer(int index) {
		return cR.get(index);

	}

	public void removeCustomer(Customer customer) {
		cR.remove(customer);
	}

	public void removeCustomer(int index) {
		cR.remove(index);
	}

	public int size() {
		return cR.size();
	}

}
