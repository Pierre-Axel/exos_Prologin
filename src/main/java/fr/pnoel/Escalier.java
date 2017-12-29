package fr.pnoel;

class Escalier {

    public String printEscalier(int n) {
        String result = "";
        if (n >= 1 && n <= 200) {
            for (int i = n; i > 0; i--) {
                for (int j = 0; j <= n - i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        }
        return result;
    }
}
