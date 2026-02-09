public class Pet {
    private String name;
    public Pet()
    {
        setName("Pet Name");
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    public String getName()
    {
        return this.name;
    }
    public String toString()
    {
        String output = "Pet name: ";
        output += this.getName();
        return output;
    }
    public static void main(String[] args)
    {
        Pet pet1 = new Pet();
        pet1.setName("Pandora");
        System.out.println("Pet information: ");
        System.out.println(pet1);
        Pet pet2 = new Pet();
        System.out.println("Pet information: ");
        pet2.setName("Fuzzy");
        System.out.println(pet2);
    }
}