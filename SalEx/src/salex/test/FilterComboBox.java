/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.test;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Thilina
 */
public class FilterComboBox<T> extends ComboBox<T> {

    private final FilterComboBox<T> fcbo = this;
//private FilterComboBox fcbo = this;
    private ObservableList<T> items;
    private ObservableList<T> filter;
    private String s;
    private Object selection;

    private class KeyHandler implements EventHandler< KeyEvent> {

        private SingleSelectionModel<T> sm;

        public KeyHandler() {
            sm = getSelectionModel();
            s = "";
        }

        @Override
        public void handle(KeyEvent event) {
            if (event.getCode().isArrowKey()) {
                s = "";
                return;
            }
            if (event.getCode() == KeyCode.ENTER) {
//                System.out.println("Entered------------------");
            }
            filter.clear();
            // handle non alphanumeric keys like backspace, delete etc
            if (event.getCode() == KeyCode.BACK_SPACE && s.length() > 0) {
                s = s.substring(0, s.length() - 1);
            } else {
                s += event.getText();
            }
            if (s.length() == 0) {
                fcbo.setItems(items);
                sm.selectFirst();
                return;
            }
            //System.out.println(s);
            if (event.getCode().isLetterKey() || event.getCode().isDigitKey() || event.getCode() == KeyCode.BACK_SPACE) {
                for (T item : items) {
                    if (item.toString().toUpperCase().startsWith(s.toUpperCase())) {

                        filter.add(item);
                        //System.out.println(item);


                        //sm.clearSelection();
                        //sm.select(item);

                    }
                }
                if (filter.size() > 0) {
                    fcbo.setItems(filter);
                }
                sm.select(0);
            }

        }
    }

    public FilterComboBox(final ObservableList<T> items) {
        super(items);
        this.items = items;
        this.filter = FXCollections.observableArrayList();

        setOnKeyReleased(new KeyHandler());

        this.focusedProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                if (newValue == false) {
                    s = "";
                    fcbo.setItems(items);
                    fcbo.getSelectionModel().select((T) selection);
                }

            }
        });

        this.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                if (newValue != null) {
                    selection = (Object) newValue;
                }
            }
        });
    }
}