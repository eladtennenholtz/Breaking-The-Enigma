package logic;

import data.*;
import machine.EnigmaMachine;

import java.util.ArrayList;

public interface Engine {

    DataFromEngineToUiXml readTheMachineXmlFile(String path);
    DataFromEngineToUiShowingTheMachine displayingTheMachineSetting();
    DataFromEngineToUiRotors settingRotorsToMachine(DataFromUiToEngineInputRotors rotors);
    DataFromEngineToUiRotorsPositioning settingPositionsToMachine(DataFromUiToEngineInputRotorsPositioning positioning);
    DataFromEngineToUiReflector settingReflectors(DataFromUiToEngineReflector reflector);
    DataFromEngineToUiPlugBoard settingPlugBoard(DataFromUiToEngineInputPlugBoard plugBoard);
    void settingAllManually(ArrayList<String>results);
    DataFromEngineToUi selectingAnInitialCodeConfigurationAutomatically();
    DataFromEngineToUiEncryptedString inputProcessing(DataFromUiToEngineStringToEncrypt encrypt);
    DataFromEngineToUi resetSettings();
    DataFromEngineToUi historyAndStatistics();
    CurrentMachineDetails getDetails();
    DataFromEngineToUiEncryptedString inputProcessCharacter(DataFromUiToEngineStringToEncrypt encrypt,boolean res,boolean isDone,String theString);







}
