/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex;

import javafx.scene.control.Tab;
import javafx.scene.control.TreeItem;

/**
 *
 * @author Thilina
 */
public class PageTreeItem extends TreeItem<Object> {

    private Tab tab;
    private String name;

    public PageTreeItem(Tab tab) {
        this.tab = tab;
    }

    public PageTreeItem(String name) {
        this.name = name;
    }

    /**
     * @return the tab
     */
    public Tab getTab() {
        return tab;
    }

    /**
     * @param tab the tab to set
     */
    public void setTab(Tab tab) {
        this.tab = tab;
    }

    @Override
    public String toString() {
        if (name == null) {
            name = tab.getText();
        }
        return name;
    }
}
