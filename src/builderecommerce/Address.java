package builderecommerce;

public class Address {
    private String country;
    private String address;
    private String postalCode;


    public static class AddressBuilder {
        private final Address address;

        private AddressBuilder() {
            this.address = new Address();
        }

        public static AddressBuilder builder() {
            return new AddressBuilder();
        }

        public Address build() {
            return this.address;
        }//build va ritornare address popolato

        public AddressBuilder setCountry(String country) {
            this.address.country = country;
            return this;
        }

        public AddressBuilder setAddress(String address) {
            this.address.address = address;
            return this;
        }

        public AddressBuilder setPostalCode(String postalCode) {
            this.address.postalCode = postalCode;
            return this;
        }
    }
}
