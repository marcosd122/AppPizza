
package component;

import javax.swing.JPanel;

public class SwitchPanel {
    //
    private JPanel container;
    private JPanel content;


    public SwitchPanel(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }

}
