package application;

import java.util.Iterator;

import javafx.fxml.FXML;
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

	public void addSign(String sign) {
		mainTextField.appendText(sign);
	}

	public void handlePlus() {
		addSign("+");
	}

	public void handleMinus() {
		addSign("-");
	}

	public void handleMultiply() {
		addSign("*");
	}

	public void handleDivide() {
		addSign("/");
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

	public void calculate() {
		double result = 0;
		double previousNum;
		double nextNum;
		double currentResult = 0;
		int operation = 0;
		String digits = mainTextField.getText();

		for (int i = 0; i < digits.length(); i++) {
			// Provera kada prvi put pronadjem neku operaciju
			if (operation == 0) {
				if (digits.charAt(i) == '+') {
					operation++;
					previousNum = Character.getNumericValue(digits.charAt(i - 1));
					nextNum = Character.getNumericValue(digits.charAt(i + 1));
					result = previousNum + nextNum;
					currentResult = result;
				} else if (digits.charAt(i) == '-') {
					operation++;
					previousNum = Character.getNumericValue(digits.charAt(i - 1));
					nextNum = Character.getNumericValue(digits.charAt(i + 1));
					result = previousNum - nextNum;
					currentResult = result;
				} else if (digits.charAt(i) == '*') {
					operation++;
					previousNum = Character.getNumericValue(digits.charAt(i - 1));
					nextNum = Character.getNumericValue(digits.charAt(i + 1));
					result = previousNum * nextNum;
					currentResult = result;
				} else if (digits.charAt(i) == '/') {
					operation++;
					previousNum = Character.getNumericValue(digits.charAt(i - 1));
					nextNum = Character.getNumericValue(digits.charAt(i + 1));
					result = previousNum / nextNum;
					currentResult = result;
				}

			} else if (digits.charAt(i) == '+') {
				operation++;
				nextNum = Character.getNumericValue(digits.charAt(i + 1));
				result = currentResult + nextNum;
			} else if (digits.charAt(i) == '-') {
				operation++;
				nextNum = Character.getNumericValue(digits.charAt(i + 1));
				result = currentResult - nextNum;
			} else if (digits.charAt(i) == '*') {
				operation++;
				nextNum = Character.getNumericValue(digits.charAt(i + 1));
				result = currentResult * nextNum;
			} else if (digits.charAt(i) == '/') {
				operation++;
				nextNum = Character.getNumericValue(digits.charAt(i + 1));
				result = currentResult / nextNum;
			}

		}

		mainTextField.setText(Double.toString(result));
	}

}
