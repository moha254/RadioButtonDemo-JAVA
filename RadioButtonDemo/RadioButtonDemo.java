import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private final ButtonGroup group;
    private JLabel imageLabel;

    public RadioButtonDemo() {
        super("RadioButtonDemo");
        setLayout(new FlowLayout());

        group = new ButtonGroup();

        
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));

        birdButton = new JRadioButton("Bird");
        birdButton.setActionCommand("bird");
        birdButton.addActionListener(this);
        radioPanel.add(birdButton);

        catButton = new JRadioButton("Cat");
        catButton.setActionCommand("cat");
        catButton.addActionListener(this);
        radioPanel.add(catButton);

        dogButton = new JRadioButton("Dog");
        dogButton.setActionCommand("dog");
        dogButton.addActionListener(this);
        radioPanel.add(dogButton);

        rabbitButton = new JRadioButton("Rabbit");
        rabbitButton.setActionCommand("rabbit");
        rabbitButton.addActionListener(this);
        radioPanel.add(rabbitButton);

        pigButton = new JRadioButton("Pig");
        pigButton.setActionCommand("pig");
        pigButton.addActionListener(this);
        radioPanel.add(pigButton);

        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        
        ImageIcon defaultImage = new ImageIcon("pig.jpeg");
        imageLabel = new JLabel(defaultImage);
        imageLabel.setPreferredSize(new Dimension(400, 400));

        // Panel for image
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new FlowLayout());
        imagePanel.add(imageLabel);

        
        add(radioPanel);
        add(imagePanel);

        pack();
    }

    public void actionPerformed(ActionEvent e) {
        String pet = e.getActionCommand();
        JOptionPane.showMessageDialog(this, "You selected: " + pet);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RadioButtonDemo frame = new RadioButtonDemo();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
