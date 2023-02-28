 public class Phone<String> {
     private String name;
     private double price;
     private String model;
     private PhoneType phoneType;

     public Phone(String name, double price, String model, PhoneType phoneType) {
         this.name = name;
         this.price = price;
         this.model = model;
         this.phoneType = phoneType;
     }


     public void repair() {
         // implementation for repairing a phone
         System.out.println("phone repaired");


     }

     public void exchange() {
         // implementation for exchanging a phone
         System.out.println("phone exchanged");
     }

     public void sell() {
         // implementation for selling a phone
         System.out.println("phone selled");
     }

     public String getName() {
         return name;
     }

     public double getPrice() {
         return price;
     }

     public String getModel() {
         return model;
     }

     public PhoneType getPhoneType() {
         return phoneType;
     }


     public java.lang.String toString() {
         return "Phone{" +
                 "name='" + name + '\'' +
                 ", price=" + price +
                 ", model='" + model + '\'' +
                 ", phoneType=" + phoneType +
                 '}';
     }
 }
