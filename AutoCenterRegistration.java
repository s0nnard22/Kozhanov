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
        // Инициализация компонентов интерфейса
        createGUI();
    }

    private void createGUI() {
        setTitle("Система Регистрации Автоцентра");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Создание текстовых полей
        txtClientName = new JTextField(15);
        txtCarModel = new JTextField(15);
        txtAreaResults = new JTextArea(5, 20);
        txtAreaResults.setEditable(false);

        // Создание кнопок
        btnRegister = new JButton("Регистрация");

        // Добавление компонентов на форму
        add(new JLabel("ФИО Клиента:"));
        add(txtClientName);
        add(new JLabel("Модель Авто:"));
        add(txtCarModel);
        add(btnRegister);
        add(new JScrollPane(txtAreaResults));

        // Добавление слушателя на кнопку регистрации
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerClient();
            }
        });

        // Отображение окна
        setVisible(true);
    }

    // Метод для обработки нажатия кнопки регистрации
    private void registerClient() {
        String clientName = txtClientName.getText();
        String carModel = txtCarModel.getText();

        // Здесь должна быть логика регистрации клиента и авто...
        // Для примера мы просто выводим информацию в текстовую область
        txtAreaResults.append("Клиент " + clientName + " с авто " + carModel + " зарегистрирован.\n");

        // Очистка текстовых полей после регистрации
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
