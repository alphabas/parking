public class Vehicle {
    private String registerNumber;
    private String category;

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Vehicle{" +
                "registerNumber'" + registerNumber + '\'' +
                ", category'" + category + '\'' +
                '}';
    }
}
