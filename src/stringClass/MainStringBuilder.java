package stringClass;

public class MainStringBuilder {
    public static void main(String[] args) {
        String firstName = "Richcy";
        System.out.println("First Name "+ firstName);
        String lastName = "Dian Sukma";
        System.out.println("Last Name "+ lastName);
        String namaLengkap = firstName +" "+lastName;
        System.out.println("Nama Lengkap "+ namaLengkap);

        StringBuilder builder = new StringBuilder(firstName)
                .append(" ").append(lastName);
        System.out.println("Builder "+ builder);

        StringBuffer buffer = new StringBuffer(firstName)
                .append(" ").append(lastName);
        System.out.println("Buffer "+ buffer);

    }
}
