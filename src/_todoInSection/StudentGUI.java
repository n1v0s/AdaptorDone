package _todoInSection;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

@SuppressWarnings("serial")
public class StudentGUI extends JFrame {

  /**
   * Set the GUI to be visible
   * 
   * @param args
   *            unused
   */
  public static void main(String args[]) {
    new StudentGUI().setVisible(true);
  }

  // Need a TableModel to set as the model for a JTabel
  private TableModel model = null;
  StudentCollection foo=new StudentCollection();

  // Like DefaultListModel and JList, now we have
  // a class that implements TableModel so this JTable
  // can display rows and columns of data in a graphical manner
  private JTable table = null;

  /**
   * The constructor for a StudentTable. Sets up the GUI and the JTable
   */
  public StudentGUI() {
    // set up the JFrame
    setTitle("Sort Table Demo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(700, 140);
    setLocation(30, 30);

    // TODO: 2) Need a new StudentCollection as our model
 
    // TODO: 3) Construct the JTable (table) with our model as an argument (could use setModel)
 
    // TODO: 4) Construct a JScrollPane to decorate table so that if the data exceeds the 
    // side of the table in the  GUI, then it automatically becomes scrollable.
    
    // TODO: 5) Add JScrollPane to this JFrame
   
    
    // TODO: Run this code to see if the JTable appears (no code to write)

    
    // TODO: 6) Construct a new RowSorter<TableModel> to be a TableRowSorter
    // while setting its model to model
 
    // TODO: 7) Link up table and the sorter
 
    
    table=new JTable();
    table.setModel(foo);
    JScrollPane bar=new JScrollPane(table);
    this.add(bar);
    RowSorter<TableModel> baz=new TableRowSorter<TableModel>(foo);
    table.setRowSorter(baz);
    
    // Layout the GUI
    JButton button = new JButton("Select Highlighted Row");
    JPanel panel = new JPanel();
    panel.setMaximumSize(new Dimension(30, 30));
    panel.add(button);
    add(panel, BorderLayout.WEST);

    // Listen to the button click
    button.addActionListener(new ButtonListener());
  }

  private class ButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent arg0) {
      // TODO: 8) Show the name of the student on the currently selected
      // row need table's getSelectedRow and convertRowIndexToModel as
      // well as model's getValueAt(rowIndex, columnIndex). See the API
      // for details.
    	int selectedRow=table.getSelectedRow();
    	int actualRow=table.convertRowIndexToModel(selectedRow);
      System.out.println(foo.getValueAt(actualRow, 0));

    }
  }
}