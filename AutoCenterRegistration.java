import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AutoCenterRegistration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtClientName;
    private JTextField txtCarModel;
    private JTextArea txtAreaResults;
    private JButton btnRegister;

    public AutoCenterRegistration() {
        
        createGUI();
    }

    private void createGUI() {
        setTitle("Система Регистрации Автоцентра");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

      
        txtClientName = new JTextField(15);
        txtCarModel = new JTextField(15);
        txtAreaResults = new JTextArea(5, 20);
        txtAreaResults.setEditable(false);

        btnRegister = new JButton("Регистрация");

        add(new JLabel("ФИО Клиента:"));
        add(txtClientName);
        add(new JLabel("Модель Авто:"));
        add(txtCarModel);
        add(btnRegister);
        add(new JScrollPane(txtAreaResults));

   
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerClient();
            }
        });

    
        setVisible(true);
    }

    private void registerClient() {
        String clientName = txtClientName.getText();
        String carModel = txtCarModel.getText();

        txtAreaResults.append("Клиент " + clientName + " с авто " + carModel + " зарегистрирован.\n");

   
        txtClientName.setText("");
        txtCarModel.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AutoCenterRegistration();
            }
        });
    }
}
