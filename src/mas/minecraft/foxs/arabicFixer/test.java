package mas.minecraft.foxs.arabicFixer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;

class test {
    public static ArrayList<Rule> RULES = new ArrayList<Rule>();

    public static void test() {
        String nonJoinerLetters = "ﺬآداﺇﺁﺃﺎﺈﺂﺄرﺮزﺰژﮋذﺲﺶﺺﺾوﭗﺚﺖﺞﭻﺢﺦﺐﻂﻆﻊﻎﻒﻖﮏﮓﻚﻞﻢﻦﻮﻪﻰﺊﻲﺪﻼﻻﻺﻹﻶﻵﻸﻷﷺﷲﺔﻪﺅ";
        // String nospaceBefore = "(?<!\\s|^)";
        String nospaceAfter = "(?!\\s|$|^)";
        String spaceAfter = "(?=\\s|^|$)";
        String nonJoinerRegex = "(?<!\\s|^|$|[" + nonJoinerLetters + "])";
        String isnonJoinerRegex = "(?<=\\s|^|$|[" + nonJoinerLetters + "])";
        String JoinerRegex = "(?<!\\s\\w[^" + nonJoinerLetters + "])";
        RULES.add(new Rule(spaceAfter + "الله", "ﷲ"));//الله
        RULES.add(new Rule(spaceAfter + "الله" + spaceAfter, "ﷲ"));//الله
        RULES.add(new Rule(spaceAfter + "صلى", "ﷺ"));//ﷺ
        RULES.add(new Rule("لإ", "ﻹ"));//إ
        RULES.add(new Rule(JoinerRegex + "ﻹ", "ﻺ"));
        RULES.add(new Rule("لآ", "ﻵ"));//آ
        RULES.add(new Rule(JoinerRegex + "ﻵ", "ﻶ"));
        RULES.add(new Rule("لأ", "ﻷ"));//أ
        RULES.add(new Rule(JoinerRegex + "ﻷ", "ﻸ"));
        RULES.add(new Rule( "لا", "ﻻ"));//ا
        RULES.add(new Rule(JoinerRegex + "ﻼ" + spaceAfter, "ﻼ"));
        RULES.add(new Rule(nonJoinerRegex + "ا", "ﺎ"));
        RULES.add(new Rule(nonJoinerRegex + "ب" + nospaceAfter, "ﺒ"));
        RULES.add(new Rule(JoinerRegex + "ب" + nospaceAfter, "ﺑ"));
        RULES.add(new Rule(nonJoinerRegex + "ب" + spaceAfter, "ﺐ"));
        RULES.add(new Rule(nonJoinerRegex + "پ" + nospaceAfter, "ﭙ"));
        RULES.add(new Rule(JoinerRegex + "پ" + nospaceAfter, "ﭘ"));
        RULES.add(new Rule(nonJoinerRegex + "پ" + spaceAfter, "ﭗ"));
        RULES.add(new Rule(nonJoinerRegex + "ت" + nospaceAfter, "ﺘ"));
        RULES.add(new Rule(JoinerRegex + "ت" + nospaceAfter, "ﺗ"));
        RULES.add(new Rule(nonJoinerRegex + "ت" + spaceAfter, "ﺖ"));
        RULES.add(new Rule(nonJoinerRegex + "ث" + nospaceAfter, "ﺜ"));
        RULES.add(new Rule(JoinerRegex + "ث" + nospaceAfter, "ﺛ"));
        RULES.add(new Rule(nonJoinerRegex + "ث" + spaceAfter, "ﺚ"));
        RULES.add(new Rule(nonJoinerRegex + "ج" + nospaceAfter, "ﺠ"));
        RULES.add(new Rule(JoinerRegex + "ج" + nospaceAfter, "ﺟ"));
        RULES.add(new Rule(nonJoinerRegex + "ج" + spaceAfter, "ﺞ"));
        RULES.add(new Rule(nonJoinerRegex + "چ" + nospaceAfter, "ﭽ"));
        RULES.add(new Rule(JoinerRegex + "چ" + nospaceAfter, "ﭼ"));
        RULES.add(new Rule(nonJoinerRegex + "چ" + spaceAfter, "ﭻ"));
        RULES.add(new Rule(nonJoinerRegex + "ح" + nospaceAfter, "ﺤ"));
        RULES.add(new Rule(JoinerRegex + "ح" + nospaceAfter, "ﺣ"));
        RULES.add(new Rule(nonJoinerRegex + "ح" + spaceAfter, "ﺢ"));
        RULES.add(new Rule(nonJoinerRegex + "خ" + nospaceAfter, "ﺨ"));
        RULES.add(new Rule(JoinerRegex + "خ" + nospaceAfter, "ﺧ"));
        RULES.add(new Rule(JoinerRegex + "خ" + spaceAfter, "ﺦ"));
        RULES.add(new Rule(JoinerRegex + "د" + spaceAfter, "ﺪ"));
        RULES.add(new Rule(JoinerRegex + "ذ" + spaceAfter, "ﺬ"));
        RULES.add(new Rule(JoinerRegex + "ر" + spaceAfter, "ﺮ"));
        RULES.add(new Rule(JoinerRegex + "ز" + spaceAfter, "ﺰ"));
        RULES.add(new Rule(JoinerRegex + "ژ" + spaceAfter, "ﮋ"));
        RULES.add(new Rule(nonJoinerRegex + "س" + nospaceAfter, "ﺴ"));
        RULES.add(new Rule(JoinerRegex + "س" + nospaceAfter, "ﺳ"));
        RULES.add(new Rule(nonJoinerRegex + "س" + spaceAfter, "ﺲ"));
        RULES.add(new Rule(nonJoinerRegex + "ش" + nospaceAfter, "ﺸ"));
        RULES.add(new Rule(JoinerRegex + "ش" + nospaceAfter, "ﺷ"));
        RULES.add(new Rule(nonJoinerRegex + "ش" + spaceAfter, "ﺶ"));
        RULES.add(new Rule(nonJoinerRegex + "ص" + nospaceAfter, "ﺼ"));
        RULES.add(new Rule(JoinerRegex + "ص" + nospaceAfter, "ﺻ"));
        RULES.add(new Rule(nonJoinerRegex + "ص" + spaceAfter, "ﺺ"));
        RULES.add(new Rule(nonJoinerRegex + "ض" + nospaceAfter, "ﻀ"));
        RULES.add(new Rule(JoinerRegex + "ض" + nospaceAfter, "ﺿ"));
        RULES.add(new Rule(nonJoinerRegex + "ض" + spaceAfter, "ﺾ"));
        RULES.add(new Rule(nonJoinerRegex + "ط" + nospaceAfter, "ﻄ"));
        RULES.add(new Rule(JoinerRegex + "ط" + nospaceAfter, "ﻃ"));
        RULES.add(new Rule(nonJoinerRegex + "ط" + spaceAfter, "ﻂ"));
        RULES.add(new Rule(nonJoinerRegex + "ظ" + nospaceAfter, "ﻈ"));
        RULES.add(new Rule(JoinerRegex + "ظ" + nospaceAfter, "ﻇ"));
        RULES.add(new Rule(nonJoinerRegex + "ظ" + spaceAfter, "ﻆ"));
        RULES.add(new Rule(nonJoinerRegex + "ع" + nospaceAfter, "ﻌ"));
        RULES.add(new Rule(JoinerRegex + "ع" + nospaceAfter, "ﻋ"));
        RULES.add(new Rule(nonJoinerRegex + "ع" + spaceAfter, "ﻊ"));
        RULES.add(new Rule(nonJoinerRegex + "غ" + nospaceAfter, "ﻐ"));
        RULES.add(new Rule(JoinerRegex + "غ" + nospaceAfter, "ﻏ"));
        RULES.add(new Rule(nonJoinerRegex + "غ" + spaceAfter, "ﻎ"));
        RULES.add(new Rule(nonJoinerRegex + "ف" + nospaceAfter, "ﻔ"));
        RULES.add(new Rule(JoinerRegex + "ف" + nospaceAfter, "ﻓ"));
        RULES.add(new Rule(nonJoinerRegex + "ف" + spaceAfter, "ﻒ"));
        RULES.add(new Rule(nonJoinerRegex + "ق" + nospaceAfter, "ﻘ"));
        RULES.add(new Rule(JoinerRegex + "ق" + nospaceAfter, "ﻗ"));
        RULES.add(new Rule(nonJoinerRegex + "ق" + spaceAfter, "ﻖ"));
        RULES.add(new Rule(nonJoinerRegex + "ک" + nospaceAfter, "ﮑ"));
        RULES.add(new Rule(JoinerRegex + "ک" + nospaceAfter, "ﮐ"));
        RULES.add(new Rule(nonJoinerRegex + "ک" + spaceAfter, "ﮏ"));
        RULES.add(new Rule(nonJoinerRegex + "ك" + nospaceAfter, "ﻜ"));
        RULES.add(new Rule(JoinerRegex + "ك" + nospaceAfter, "ﻛ"));
        RULES.add(new Rule(nonJoinerRegex + "ك" + spaceAfter, "ﻚ"));
        RULES.add(new Rule(nonJoinerRegex + "گ" + nospaceAfter, "ﮕ"));
        RULES.add(new Rule(JoinerRegex + "گ" + nospaceAfter, "ﮔ"));
        RULES.add(new Rule(nonJoinerRegex + "گ" + spaceAfter, "ﮓ"));
        RULES.add(new Rule(nonJoinerRegex + "ل" + nospaceAfter, "ﻠ"));
        RULES.add(new Rule(JoinerRegex + "ل" + nospaceAfter, "ﻟ"));
        RULES.add(new Rule(nonJoinerRegex + "ل" + spaceAfter, "ﻞ"));
        RULES.add(new Rule(nonJoinerRegex + "م" + nospaceAfter, "ﻤ"));
        RULES.add(new Rule(JoinerRegex + "م" + nospaceAfter, "ﻣ"));
        RULES.add(new Rule(nonJoinerRegex + "م" + spaceAfter, "ﻢ"));
        RULES.add(new Rule(nonJoinerRegex + "ن" + nospaceAfter, "ﻨ"));
        RULES.add(new Rule(JoinerRegex + "ن" + nospaceAfter, "ﻧ"));
        RULES.add(new Rule(nonJoinerRegex + "ن" + spaceAfter, "ﻦ"));
        RULES.add(new Rule(nonJoinerRegex + "و" + spaceAfter, "ﻮ"));
        RULES.add(new Rule(nonJoinerRegex + "ه" + nospaceAfter, "ﻬ"));
        RULES.add(new Rule(JoinerRegex + "ه" + nospaceAfter, "ﻫ"));
        RULES.add(new Rule(nonJoinerRegex + "ه" + spaceAfter, "ﻪ"));
        RULES.add(new Rule(isnonJoinerRegex + "ه" + spaceAfter, "ﮦ"));
        RULES.add(new Rule(nonJoinerRegex + "ی" + nospaceAfter, "ﻴ"));
        RULES.add(new Rule(JoinerRegex + "ی" + nospaceAfter, "ﻳ"));
        RULES.add(new Rule(nonJoinerRegex + "ی" + spaceAfter, "ﻰ"));
        RULES.add(new Rule(nonJoinerRegex + "ي" + nospaceAfter, "ﻴ"));
        RULES.add(new Rule(JoinerRegex + "ي" + nospaceAfter, "ﻳ"));
        RULES.add(new Rule(nonJoinerRegex + "ي" + spaceAfter, "ﻲ"));
        RULES.add(new Rule(nonJoinerRegex + "ي" + nospaceAfter, "ﺌ"));
        RULES.add(new Rule(JoinerRegex + "ي" + nospaceAfter, "ﺋ"));
        RULES.add(new Rule(nonJoinerRegex + "ي" + spaceAfter, "ﺊ"));
    }
    //    public String getPlayerPrefix(org.bukkit.entity.Player player) get;
    public static void main(String[] args) {
        test();
        String message = new Scanner(System.in).nextLine();
        if (message.matches("^[\u0600-\u06FF\uFB8A\u067E\u0686\u06AF\u200C\u200F ]+$")) {
            for (Rule nrule : RULES) {
                Matcher m = nrule.regex.matcher(message);
                while (m.find()) {
                    message = m.replaceAll(nrule.replacerchar);
                }
            }

            StringBuilder Reversed = new StringBuilder();
            char[] MessageArray = message.toCharArray();
            for (int i = message.toCharArray().length - 1; i >= 0; i--) {
                Reversed.append(MessageArray[i]);
            }
            System.out.println(Reversed.toString());
        }
    }
}
