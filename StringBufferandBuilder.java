public class StringBufferandBuilder {
    public static void main(String[] args) {
        // StringBuffer 
        // its threat safe
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(", World!");
        System.out.println("StringBuffer: " + stringBuffer.toString());//convert the buffer data to string
        System.out.println("StringBuffer: " + stringBuffer);//directly print the buffer data

        System.out.println("StringBuffer: " + stringBuffer.capacity());//prvides buffer capacity by default is 16
        System.out.println("StringBuffer: " + stringBuffer.length());//provides the length of the buffer

        stringBuffer.delete(0, 6);
        System.out.println("StringBuffer: " + stringBuffer);

        // Strig builder
        // its not thread safe
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", World!");
        System.out.println("StringBuilder: " + stringBuilder.toString());
        System.out.println("StringBuilder: " + stringBuilder);//directly print the builder data

    }
}
