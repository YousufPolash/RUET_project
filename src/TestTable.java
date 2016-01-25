import javax.swing.*;

public class TestTable extends JApplet {
private String[] columnNames = {"Country ", "Capital", "Population", " Democracy"};

private Object[][] data = {
		{"Usa", " New York", 348, "Yes"},
		{"BD", "Dhaka", 5767, "No" }
};

private JTable jTable  = new JTable(data, columnNames);

public TestTable(){
	add(new JScrollPane(jTable));
}
	
}
