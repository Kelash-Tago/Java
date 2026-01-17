import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class Activity3{
	
	
    public static void main(String[] args)throws Exception{
		
		
        MyFrame frame=new MyFrame();
		JLabel label1 = new JLabel("User Name");
		label1.setBounds(30,20,100,30);
		frame.add(label1);
		
		JTextField field1=new JTextField();
		field1.setBounds(30,50,250,30);
		frame.add(field1);
		
		JLabel label2 = new JLabel("Password");
		label2.setBounds(30,90,100,30);
		frame.add(label2);
		
		JTextField field2=new JTextField();
		field2.setBounds(30,120,250,30);
		frame.add(field2);
		
		JButton button1=new JButton("Login");
		button1.setBounds(100,170,80,30);
		frame.add(button1);
		frame.setVisible(true);
		
		
		MyFrame menu=new MyFrame("Main Menu");
		JLabel menulabel = new JLabel("Welcome To Main Menu");
		menulabel.setBounds(100,100,200,80);
		menu.add(menulabel);
        
		
		button1.addActionListener(new loginListener(frame,menu,field1,field2));
		
		
		
		
		
    }// end main method 
	
	 


}


class MyFrame extends JFrame{
	public MyFrame(){
		setTitle("Login Page");
		setSize(400,400);
		setLayout(null);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	
	public MyFrame(String str){
		setTitle(str);
		setSize(400,400);
		setLayout(null);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
}


class loginListener implements ActionListener{
	static Connection con;
	static Statement stmt;
	static ResultSet rs;
	JTextField username,password;
	JFrame frame;
	JFrame menu;
	
	public loginListener(JFrame frame,JFrame menu,JTextField username,JTextField password){
		this.rs=rs;
		this.username=username;
		this.password=password;
		this.frame=frame;
		this.menu=menu;
	}
	
	public void actionPerformed(ActionEvent e){
		
		String user_name;
		String pass_word;
		boolean NotfoundUserName=true;

		
		try{
			initSetup();
			rs = stmt.executeQuery("SELECT userName,userPassword FROM Users");
			
		while(rs.next()){
			user_name=rs.getString("userName");
	if(user_name.equals(username.getText())){
		NotfoundUserName=false;
		//System.out.println("Name found");
		pass_word=rs.getString("userPassword");
			if(pass_word.equals(password.getText())){
				System.out.println("Login Successfully");
				frame.setVisible(false);
				menu.setVisible(true);
				
			}
			else 
				System.out.println("incorrect password");
		
	}
		}//loop
		
		
	
	if(NotfoundUserName) System.out.println("Username not found");
		
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}//method
	
	
	
	public static void initSetup()throws Exception{
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	String url = "jdbc:mysql://localhost:3306/LoginPageData";
        String username = "root";
        String password = "Kelash2936";
		
		con=DriverManager.getConnection(url,username,password);
		stmt=con.createStatement();
		}
		catch(Exception err){
			System.out.println(err.getMessage());
		}
		
	//	String query="Select userName,password from users;";
	//	rs=stmt.executeQuery(query);
	}
	
	
	
}//class


	
	
   