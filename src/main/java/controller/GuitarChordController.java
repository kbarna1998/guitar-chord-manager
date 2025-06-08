package controller;

import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.GuitarChord;

public class GuitarChordController {
    @FXML
    private Button searchButton;
    @FXML
    private Button createButton;
    @FXML
    private Button exitButton;
    @FXML
    private TextField rootTextField;
    @FXML
    private TextField typeTextField;
    @FXML
    private TextField bassTextField;
    @FXML
    private TextField fingeringTextField;
    @FXML
    private Button actionButton;
    @FXML
    private TableView guitarChordTable;
    @FXML
    private TableColumn idTableColumb;
    @FXML
    private TableColumn chordTableColumb;
    @FXML
    private TableColumn fingeringTableColumb;

    private GuitarChord guitarChord;


}
