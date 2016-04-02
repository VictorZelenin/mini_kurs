import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 27.10.2015.
 */
public class MainFrame extends JFrame {
    private JButton start;
    private JButton exit;

    private JTextArea textArea;
    private JTextArea result;

    private JScrollPane textAreaScroll;
    private JScrollPane resultScroll;

    private JPanel buttonPanel;
    private JPanel panel;
    private JPanel labelPanel;

    public MainFrame() {


        setLayout(new BorderLayout());

        panel = new JPanel();
        labelPanel = new JPanel();
        buttonPanel = new JPanel();

        buttonPanel.setLayout(new GridBagLayout());
        labelPanel.setLayout(new GridBagLayout());

        JLabel label = new JLabel("Програма-аналізатор тексту :");
        setSize(600, 600);
        setLocation(400, 50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        textArea = new JTextArea(20,50);
        result = new JTextArea(10,50);

        start = new JButton("start");
        exit = new JButton("exit");

        buttonPanel.add(start,new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5),0,0));
        buttonPanel.add(exit,new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5),0,0));
        labelPanel.add(label,new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5),0,0));



        result.setEditable(false);

        textArea.setLineWrap(true);


        result.setLineWrap(true);

        textAreaScroll = new JScrollPane(textArea);
        resultScroll = new JScrollPane(result);

        add(label, BorderLayout.NORTH);
        panel.add(textAreaScroll);
        panel.add(resultScroll);

        Font font = new Font("Helvetica", Font.PLAIN, 15);
        label.setFont(font);
        labelPanel.add(label);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
        add(labelPanel, BorderLayout.NORTH);

    }


    public JButton getStart() {
        return start;
    }

    public JButton getExit() {
        return exit;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setResult(String result) {
        this.result.setText(result);
    }
}
