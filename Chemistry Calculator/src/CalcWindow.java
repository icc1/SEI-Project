
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcWindow extends JFrame
{
	private JMenuBar chemBar;
	private JMenu chemMenu;
	
	private JMenuItem periodicItem;
	private JMenuItem molarMassItem;
	private JMenuItem molecularWeightItem;
	
	private JPanel screenPanel;
	private JTextField calcScreen;
	
	private JPanel buttonPanel;
	
	//Row 1
	private JButton functionExpBttn;
	private JButton functionSinBttn;
	private JButton functionCosBttn;
	private JButton functionTanBttn;
	private JButton unknownBttn;
	
	//Row 2
	private JButton functionRootBttn;
	private JButton inputParLBttn;
	private JButton inputParRBttn;
	private JButton utilBackspaceBttn;
	private JButton utilClearBttn;
	
	//Row 3
	private JButton functionLogBttn;
	private JButton num7Bttn;
	private JButton num8Bttn;
	private JButton num9Bttn;
	private JButton operatorDivideBttn;
	
	//Row 4
	private JButton functionNaturalLogBttn;
	private JButton num4Bttn;
	private JButton num5Bttn;
	private JButton num6Bttn;
	private JButton operatorMultiplyBttn;
	
	//Row 5
	private JButton utilMemStoreBttn;
	private JButton num1Bttn;
	private JButton num2Bttn;
	private JButton num3Bttn;
	private JButton operatorSubtractBttn;
	
	//Row 6
	private JButton utilMemRecallBttn;
	private JButton num0Bttn;
	private JButton inputDecBttn;
	private JButton utilEqualsBttn;
	private JButton operatorAddBttn;

	public CalcWindow()
	{
		super("Calculator");
		
		//This method is organized so that the calculator items are initialized
		//and added in the order that they appear from the top down.
		
		//Setting up the main calculator frame
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(400,600); 
	    setLayout(new GridBagLayout());
	    GridBagConstraints c = new GridBagConstraints();
	    
	    //Initializing the chemistry menu bar
	    chemBar = new JMenuBar();
	    
	    //Initializing the chemistry menu and adding it to the menu bar
	    chemMenu = new JMenu("Chemistry");
	    chemBar.add(chemMenu);
	      
	    //Initializing the chemistry menu items, adding their events and adding them to the menu
	    periodicItem = new JMenuItem("Periodic Table");
	    periodicItem.addActionListener(new ActionListener()
	    	{
	    		@Override
	    		public void actionPerformed(ActionEvent e) {
	    			//launch periodic table
	    		}
	    	});
	    molarMassItem = new JMenuItem("Molar Mass Calculator");
	    molarMassItem.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//launch molar mass calculator
    		}
    	});
	    molecularWeightItem = new JMenuItem("Molecular Weight Calculator");
	    molecularWeightItem.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//launch molecular weight calculator
    		}
    	});
	    chemMenu.add(periodicItem);
	    chemMenu.add(molarMassItem);
	    chemMenu.add(molecularWeightItem);
	    
	    c.gridy = 0;
	    c.fill = GridBagConstraints.BOTH;
	    add(chemBar, c);
	    //Moving down from the menu bar
	     
	    screenPanel = new JPanel();
	    calcScreen = new JTextField();
	    screenPanel.add(calcScreen);
	    c.gridy = 1;
	    add(screenPanel, c);
	    
	    buttonPanel = new JPanel();
	    buttonPanel.setLayout(new GridLayout(6, 5));
	    
	    createKeyRows();
	    
	    c.gridy = 2;
	    add(buttonPanel, c);
	    pack();
	    setVisible(true);
	}
	private void createKeyRows()
	{
		createKeyRow1();
	    createKeyRow2();
	    createKeyRow3();
	    createKeyRow4();
	    createKeyRow5();
	    createKeyRow6();
	}
	private void createKeyRow1()
	{
		//creating the buttons for the first row
	    functionExpBttn = new JButton("^");
	    functionExpBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//do exponentiation
    		}
    	});
	    functionSinBttn = new JButton("sin");
	    functionSinBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//do sin
    		}
    	});
	    functionCosBttn = new JButton("cos");
	    functionCosBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//do cos
    		}
    	});
	    functionTanBttn = new JButton("tan");
	    functionTanBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//do tan
    		}
    	});
	    unknownBttn = new JButton(" ");
	    unknownBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//blank?
    		}
    	});
	    buttonPanel.add(functionExpBttn);
	    buttonPanel.add(functionSinBttn);
	    buttonPanel.add(functionCosBttn);
	    buttonPanel.add(functionTanBttn);
	    buttonPanel.add(unknownBttn);
	}
	private void createKeyRow2()
	{
		functionRootBttn = new JButton("sqrt");
	    functionRootBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//do root
    		}
    	});
	    inputParLBttn = new JButton("(");
	    inputParLBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input (
    		}
    	});
	    inputParRBttn = new JButton(")");
	    inputParRBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input )
    		}
    	});
	    utilBackspaceBttn = new JButton("<-");
	    utilBackspaceBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//backspace
    		}
    	});
	    utilClearBttn = new JButton("C");
	    utilClearBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//clear
    		}
    	});
	    buttonPanel.add(functionRootBttn);
	    buttonPanel.add(inputParLBttn);
	    buttonPanel.add(inputParRBttn);
	    buttonPanel.add(utilBackspaceBttn);
	    buttonPanel.add(utilClearBttn);
	}
	private void createKeyRow3(){
		functionLogBttn = new JButton("log");
		functionLogBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//do root
    		}
    	});
		num7Bttn = new JButton("7");
		num7Bttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input 7
    		}
    	});
		num8Bttn = new JButton("8");
		num8Bttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input 8
    		}
    	});
		num9Bttn = new JButton("9");
		num9Bttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input 9
    		}
    	});
		operatorDivideBttn = new JButton("/");
		operatorDivideBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//divide
    		}
    	});
	    buttonPanel.add(functionLogBttn);
	    buttonPanel.add(num7Bttn);
	    buttonPanel.add(num8Bttn);
	    buttonPanel.add(num9Bttn);
	    buttonPanel.add(operatorDivideBttn);
	}
	private void createKeyRow4(){
		functionNaturalLogBttn = new JButton("ln");
		functionNaturalLogBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//do natural log
    		}
    	});
		num4Bttn = new JButton("4");
		num4Bttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input 4
    		}
    	});
		num5Bttn = new JButton("5");
		num5Bttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input 5
    		}
    	});
		num6Bttn = new JButton("6");
		num6Bttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input 6
    		}
    	});
		operatorMultiplyBttn = new JButton("*");
		operatorMultiplyBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//multiply
    		}
    	});
	    buttonPanel.add(functionNaturalLogBttn);
	    buttonPanel.add(num4Bttn);
	    buttonPanel.add(num5Bttn);
	    buttonPanel.add(num6Bttn);
	    buttonPanel.add(operatorMultiplyBttn);
	}
	private void createKeyRow5(){
		utilMemStoreBttn = new JButton("M");
		utilMemStoreBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//do root
    		}
    	});
		num1Bttn = new JButton("1");
		num1Bttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input 1
    		}
    	});
		num2Bttn = new JButton("2");
		num2Bttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input 2
    		}
    	});
		num3Bttn = new JButton("3");
		num3Bttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input 3
    		}
    	});
		operatorSubtractBttn = new JButton("-");
		operatorSubtractBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//subtract
    		}
    	});
	    buttonPanel.add(utilMemStoreBttn);
	    buttonPanel.add(num1Bttn);
	    buttonPanel.add(num2Bttn);
	    buttonPanel.add(num3Bttn);
	    buttonPanel.add(operatorSubtractBttn);
	}
	private void createKeyRow6(){
		utilMemRecallBttn = new JButton("MR");
		utilMemRecallBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//recall memory
    		}
    	});
		num0Bttn = new JButton("0");
		num0Bttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input 0
    		}
    	});
		inputDecBttn = new JButton(".");
		inputDecBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//input .
    		}
    	});
		utilEqualsBttn = new JButton("=");
		utilEqualsBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			//COMPUTE!
    		}
    	});
		operatorAddBttn = new JButton("+");
		operatorAddBttn.addActionListener(new ActionListener()
    	{
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			System.out.println("test!");
    		}
    	});
	    buttonPanel.add(utilMemRecallBttn);
	    buttonPanel.add(num0Bttn);
	    buttonPanel.add(inputDecBttn);
	    buttonPanel.add(utilEqualsBttn);
	    buttonPanel.add(operatorAddBttn);
	}
	
}

