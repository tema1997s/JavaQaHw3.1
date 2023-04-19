public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        
        System.out.println(service.calculate(10000));
        System.out.println();

        System.out.println(service.calculate(22222));
        System.out.println();

        System.out.println(service.calculate(25000));
    }
}