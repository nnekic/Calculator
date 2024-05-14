package application;

import java.util.Iterator;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

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
	private TextField mainTextField;

	double firstNumber;
	double secondNumber;
	double result;
	char operation;

	public void addDigit(int digit) {

		mainTextField.appendText(Integer.toString(digit));
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

	public void addSign(char sign) {
		String numberOnDisplay = mainTextField.getText();
		firstNumber = Double.parseDouble(numberOnDisplay);
		operation = sign;
		mainTextField.clear();
	}

	public void handlePlus() {
		addSign('+');
	}

	public void handleMinus() {
		addSign('-');
	}

	public void handleMultiply() {
		addSign('*');
	}

	public void handleDivide() {
		addSign('/');
	}

	public void clearAll() {
		mainTextField.clear();

	}

	public void clear() {
		if (!mainTextField.getText().isEmpty()) {
			int lastIndex = mainTextField.getText().length() - 1;
			mainTextField.deleteText(lastIndex, lastIndex + 1);
		}
	}

	public void changeSign() {
		try {
			int number = Integer.parseInt(mainTextField.getText());
			if (number > 0 || number < 0) {
				int reversed = Math.negateExact(number);
				mainTextField.setText(String.valueOf(reversed));
			} else if (number == 0) {
				mainTextField.setText(String.valueOf(number));
			}

		} catch (Exception e) {
			System.out.println("Catching the exception");
		}
	}

	public void calculate() {

		String secondNumberOnDisplay = mainTextField.getText();
		secondNumber = Double.parseDouble(secondNumberOnDisplay);

		switch (operation) {
		case '+' -> result = firstNumber + secondNumber;
		case '-' -> result = firstNumber - secondNumber;
		case '*' -> result = firstNumber * secondNumber;
		case '/' -> result = firstNumber / secondNumber;
		default -> mainTextField.setText("Error");
		}

		mainTextField.setText(String.valueOf(result));
	}

}
