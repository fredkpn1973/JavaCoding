public class Phone {

    private String name;
    private int phone;

    public Phone(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String toString() {
        return name + phone;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Phone other = (Phone) obj;
        if (this.phone != other.getPhone())
            return false;
        return true;
    }

    public int hasCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + phone;
        return result;
    }

    public int getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

}
