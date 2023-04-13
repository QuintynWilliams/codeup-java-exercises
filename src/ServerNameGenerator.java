public class ServerNameGenerator {

    public static String getServer () {
        String[] adj = {"Quirky", "Majestic", "Luminous", "Witty", "Ethereal", "Vibrant", "Tantalizing", "Pristine", "Hilarious", "Enigmatic"};
        String[] noun = {"Chimera", "Avalanche", "Chandelier", "Obelisk", "Pegasus", "Kaleidoscope", "Serenade", "Infinity", "Maelstrom", "Paradox"};

        int rndAdj = (int) (Math.random() * 10)+1;
        int rndNoun = (int) (Math.random() * 10)+1;

        String wordAdj = adj[rndAdj];
        String wordNun = noun[rndNoun];

        String serverName = wordAdj + "-" + wordNun;

        return serverName;
    }

    public static void main(String[] args) {

        System.out.println(getServer());

    }

}




