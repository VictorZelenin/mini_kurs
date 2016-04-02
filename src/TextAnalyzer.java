import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by User on 27.10.2015.
 */
public class TextAnalyzer {
    private List<String> list = new ArrayList<>();
    private String textData;
    private List<String> result;

    public TextAnalyzer(List list, String textData) {
        this.list = list;
        this.textData = textData;


        fillList(textData);

        result = findWords(list);
        System.out.println(result);

    }

    private void fillList(String string) {
        String[] words = string.split(" ");


        for (String s : words) {
            list.add(s);
        }
        System.out.println(list);
    }

    public List<String> findWords(List<String> list) {
        String temp;
        List<String> result = new ArrayList<>();
        for (String s : list) {
            char[] letters = s.toCharArray();
            if (letters[0] == 'A' || letters[0] == 'a') {
                temp = String.copyValueOf(letters);
                result.add(temp);
            }
        }

        return result;

    }


    public List<String> getResult(){
        return result;
    }

    public String[] getResultStr(List<String> result){

        String[] mas = new String[result.size()];

        for (int i = 0; i < result.size(); i++){
            mas[i] = result.get(i);

        }

        return mas;

    }

    public int getSize(String text){
        char[] letters = text.toCharArray();
        int counter = 0;

        for (char ch : letters){
            if (ch == ' '){
                counter++;
            }
        }
    return counter + 1;
    }

}
