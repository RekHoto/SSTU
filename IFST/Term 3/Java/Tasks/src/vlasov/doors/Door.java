package vlasov.doors;

public abstract class Door {
    public static final Door ONE = new Door() {
        public String getPrize() {
            return "a";
        }
    };
    public static final Door TWO = new Door() {
        public String getPrize() {
            return null;
        }
    };
    public static Door THREE = new Door() {
        public String getPrize(){
            return "c";
        }
    };
    public abstract String getPrize();
}
