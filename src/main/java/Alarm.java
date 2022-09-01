public class Alarm {
    public static void main(String[] args) {

        int person = 61;
        String alarmlevel = "green";

        String output = alarmstufe(alarmlevel,person);

        print(person, alarmlevel,output);

    }

    public static String alarmstufe (String level, int person) {
        switch (level){
            case "rot":
                return alarm(person, 0);
            case "gelb":
                return alarm(person, 30);
            case "green":
                return alarm(person, 60);
            default:
                return "";
        }
    }

    public static String alarm(int person, int max) {

        if (person > max){
            return "Zu viele Personen";
        }
        else {
            return "Maximale Personenzahl nicht ueberschritten";
        }
    }

    public static void print(int person, String level, String toprint) {
        System.out.println("Personen: " + person);
        System.out.println("Alarmstufe: " + level);
        System.out.println("Ergebnis: " + toprint);
    }
}
