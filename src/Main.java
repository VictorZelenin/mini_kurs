import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 27.10.2015.
 */
public class Main {

    private static JOptionPane err;
    private List list = new ArrayList<>();
    private TextAnalyzer textAnalyzer;
    private static MainFrame mainFrame;


    public static void main(String[] args) throws IOException {


        EventQueue.invokeLater(() -> {
            mainFrame = new MainFrame();

            mainFrame.getStart().addActionListener(e -> {
                String textData = mainFrame.getTextArea().getText();
                ArrayList<String> list = new ArrayList<>();
                TextAnalyzer textAnalyzer = new TextAnalyzer(list, textData);


                List<String> result = textAnalyzer.getResult();
                String resultStr = Arrays.toString(textAnalyzer.getResultStr(result));
                resultStr = resultStr.replace("[", "");
                resultStr = resultStr.replace("]", "");





                if (resultStr.endsWith("!") || resultStr.endsWith("?")) {
                    if (resultStr.length() == 0) {
                        resultStr = "Слів не знайдено";
                    }

                    mainFrame.setResult("Кількість слів : " + textAnalyzer.getSize(textData) + '\n' + "Знайдені слова : " + resultStr);

                }

                else {
                    err.showMessageDialog(mainFrame, "Текст має завершуватись символом \"!\" або" +
                            "символом \"?\" ");
                }


            });

            mainFrame.getExit().addActionListener(e -> System.exit(0));


            //    textAnalyzer = new TextAnalyzer();


        });


    }
}
