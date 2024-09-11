package com.cxl.ch8.demo3;


public class DeepClient {
    public static void main(String[] args)  {
        Customer customer,copyCustomer = null;
        customer = new Customer();
        customer.setId("110010");
        customer.setName("张三");
        customer.setAge(20);
        Address address = new Address();
        address.setCountry("中国");
        address.setCity("福建");
        address.setDistrict("ye");
        customer.setAddress(address);

        try {
            copyCustomer =  (Customer) customer.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(customer);
        System.out.println(copyCustomer);
        System.out.print("customer==copyCustomer? ");
        System.out.println(customer == copyCustomer);
        System.out.print("customer.getAddress()==copyCustomer.getAddress()? ");
        System.out.println(customer.getAddress()==copyCustomer.getAddress());
        System.out.print("customer.getId()==copyCustomer.getId() ");
        System.out.println(customer.getId() == copyCustomer.getId());
        System.out.print("customer.getAge()==customer.getAge() ");
        System.out.println(customer.getAge()==customer.getAge());
        System.out.print("copyCustomer.equals(copyCustomer) ");
        System.out.println(customer.equals(copyCustomer));

    }
}
