package org.proj.presenter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.proj.SimulationApp;
import org.proj.model.SimulationProps;
import org.proj.model.elements.EMoveStyle;
import org.proj.model.elements.EMutationStyle;

public class PropsFormPresenter {
    @FXML
    TextField mapWidth;
    @FXML
    TextField mapHeight;
    @FXML
    TextField animalCount;
    @FXML
    TextField plantCount;
    @FXML
    TextField maxEnergy;
    @FXML
    TextField genesCount;
    @FXML
    TextField energyToReproduce;
    @FXML
    TextField energyToPass;
    @FXML
    ComboBox moveStyleCBox;
    @FXML
    TextField energyFromPlant;
    @FXML
    TextField startEnergy;


    @FXML
    public void initialize() {
        moveStyleCBox.getItems().removeAll(moveStyleCBox.getItems());
        moveStyleCBox.getItems().addAll("FULLY_PREDESTINED", "BACK_AND_FORTH");
        moveStyleCBox.getSelectionModel().select("FULLY_PREDESTINED");
    }

    public void onNewSimulationClicked(ActionEvent actionEvent) {
        EMoveStyle moveStyle = (moveStyleCBox.getValue() == "FULLY_PREDESTINED" ? EMoveStyle.FULLY_PREDESTINED : EMoveStyle.BACK_AND_FORTH);
        SimulationProps props = new SimulationProps(
                Integer.parseInt(mapWidth.getText()),
                Integer.parseInt(mapHeight.getText()),
                4,
                Integer.parseInt(animalCount.getText()),
                Integer.parseInt(plantCount.getText()),
                10,
                Integer.parseInt(startEnergy.getText()),
                Integer.parseInt(maxEnergy.getText()),
                Integer.parseInt(energyFromPlant.getText()),
                moveStyle,
                EMutationStyle.FULLY_RANDOM,
                Integer.parseInt(genesCount.getText()),
                Integer.parseInt(energyToReproduce.getText()),
                Integer.parseInt(energyToPass.getText()),
                10
        );

        SimulationApp app = new SimulationApp(props);
        //Thread appThread = new Thread(app);
        app.run();
    }
}