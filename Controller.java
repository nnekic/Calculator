package application;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Controller{

	@FXML
	private Button button0;
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button4;
	@FXML
	private Button button5;
	@FXML
	private Button button6;
	@FXML
	private Button button7;
	@FXML
	private Button button8;
	@FXML
	private Button button9;
	@FXML
	private TextArea mainTextArea;
	

	public void addDigit(int digit) {
		mainTextArea.appendText(Integer.toString(digit));
	}
	
	public void handleZero() {
		addDigit(0);
	}
	public void handleOne() {
		addDigit(1);
	}
	public void handleTwo() {
		addDigit(2);
	}
	public void handleThree() {
		addDigit(3);
	}
	public void handleFour() {
		addDigit(4);
	}
	public void handleFive() {
		addDigit(5);
	}
	public void handleSix() {
		addDigit(6);
	}
	public void handleSeven() {
		addDigit(7);
	}
	public void handleEight() {
		addDigit(8);
	}
	public void handleNine() {
		addDigit(9);
	}
	
}
