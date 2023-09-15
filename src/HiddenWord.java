public class HiddenWord {
    private String hw;
    public HiddenWord (String hiddenWord)
    {
        hw = hiddenWord.toUpperCase();
    }
    public String getHint(String g) {
        if (!(g.toUpperCase().equals(g))) {
          throw new IllegalArgumentException("Your guess ( " +g+ " ) does not contain all uppercase letters. Your guess must contain all uppercase letters!");
        }
        else if (!(g.length()==hw.length())) {
            throw new IllegalArgumentException("Your guess ( " +g+ " ) has 7 characters. The hidden word has 9 characters. Your guess must be a word with 9 characters!");
        }
        else{
            String s = "";
            for (int i = 0; i < g.length(); i++) {
                char n = '*';
                if (g.charAt(i) == hw.charAt(i)) {
                    n = g.charAt(i);
                }
                else {
                    for (int j = 0; j < g.length(); j++) {
                        if (g.charAt(i) == hw.charAt(j)) {
                            n = '+';
                        }
                    }
                }
                s += n;
            }
            return s;
        }
    }
    public String getHiddenWord()
    {
        return hw;
    }}
