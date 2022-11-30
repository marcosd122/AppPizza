package swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class Button_Menu extends JButton {

    public Button_Menu() {
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setOpaque(true);
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 81, 81), 1));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 81, 81), 4));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 81, 81), 1));
            }

            @Override
            public void mousePressed(MouseEvent me) {
                setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 81, 81), 1));
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 81, 81), 4));
            }

        });
    }
}
