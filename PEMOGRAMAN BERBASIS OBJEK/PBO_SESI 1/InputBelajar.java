import javax.swing.JOptionPane;

public class InputBelajar {

    public static void main(String[] args) {

        // Dialog input
        String pelajaran = JOptionPane.showInputDialog(
                null,
                "Anda sedang belajar apa?",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );

        // Jika tidak menekan cancel
        if (pelajaran != null) {

            JOptionPane.showMessageDialog(
                    null,
                    "Belajar " + pelajaran + " sangat mudah",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}