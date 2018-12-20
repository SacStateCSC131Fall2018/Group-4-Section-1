import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * JTabbedPane to hold search, load and summarize tabs.
 *
 */
public class PirexTabbedPane extends JTabbedPane {
    public PirexTabbedPane() {
        super();
        this.setupLayout();
    }

    public void setupLayout() {
        JPanel searchTab    = new PirexSearchTab();
        JPanel loadTab      = new PirexLoadTab();
        JPanel summarizeTab = new PirexSummarizeTab();

        this.addTab("Search for Documents", null, searchTab,    null);
        this.addTab("Load Documents",       null, loadTab,      null);
        this.addTab("Summarize Documents",  null, summarizeTab, null);
    }
}
