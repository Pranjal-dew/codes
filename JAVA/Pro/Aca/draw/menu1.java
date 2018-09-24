import java.awt.*;
class menu1 extends Frame
{
	MenuBar mb;
	Menu m1, m2;
	MenuItem mi1, mi2, mi3, mi4;
	CheckboxMenuItem cbmi1;
	menu1()
	{
		super(" Notepad ..");

		mb=new MenuBar();
		setMenuBar(mb);

		m1=new Menu("File");
		m2=new Menu("Edit");
		mb.add(m1);
		mb.add(m2);

		mi1=new MenuItem("Open");
		mi2=new MenuItem("Save");
		mi3=new MenuItem("Copy");
		mi4=new MenuItem("Paste");
		cbmi1=new CheckboxMenuItem("Status Bar");
		m1.add(mi1);
		m1.add(mi2);
		m2.add(mi3);
		m2.add(mi4);
		m2.add("-");
		m2.add(cbmi1);

		setSize(200, 200);
		setVisible(true);
	}
	public static void main(String ar[])
	{
		new menu1();
	}
}