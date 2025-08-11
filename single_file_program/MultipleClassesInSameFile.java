public class MultipleClassesInSameFile {
    
    public static void main(
        String[] args
    ) {
        System.out.println(
            "\n" + GenerateMessage.generateMessage() +
            "\n" + AnotherMessage.generateAnotherMessage() + 
            "\n"
        );
    }
}

class GenerateMessage {
    static String generateMessage() {
        return "Here is one message";
    }
}

class AnotherMessage {
    static String generateAnotherMessage() {
        return "Here is another message";
    }
}