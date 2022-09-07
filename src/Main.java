public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();


        double weight = 72;
        double growth = 180;

        double index = service.calculate(weight, growth);


        // округление
        String result = String.format("%.2f", index);
        System.out.print(result);


        // System.out.println(index);


    }
}
