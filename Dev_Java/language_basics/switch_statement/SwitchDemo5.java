public class SwitchDemo5 {
    public static void main(
        String[] args
    ) {
        int quarter = 0; 

        ConvertQuarterToString convertQuarterToString = new ConvertQuarterToString();

        String quarterString = convertQuarterToString.convertToLabel(quarter);
    }
}

class ConvertQuarterToString {
    public String convertToLabel(
        int quarter
    ) {
        String quarterLabel =
            switch (quarter) {
                case 0 -> {
                    System.out.println(
                        "Q1 - Winter"
                    );

                    yield "Q1 - Winter";
                }
                default -> "Unknown quarter";
            };

        return quarterLabel;
    }
}