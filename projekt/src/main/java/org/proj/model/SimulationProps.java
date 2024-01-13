package org.proj.model;

import org.proj.model.elements.EMoveStyle;
import org.proj.model.elements.EMutationStyle;

public class SimulationProps {
    private int width;
    private int height;
    private int equatorHeight;
    private int animalCount;
    private int plantCount;
    private int spawnPlantPerDay;
    private int energy;
    private int maxEnergy;
    private int plantEnergy;
    private EMoveStyle moveStyle;
    private EMutationStyle mutationStyle;
    private int genesCount;
    private int energyLevelNeededToReproduce;
    private int energyLevelToPassToChild;
    private int moveEnergy;
    private int daysElapsed;

    private boolean saveToCSV;
    private String CSVName;

    public SimulationProps(int width_, int height_, int equatorHeight_, int animalCount_, int plantCount_,
                           int spawnPlantPerDay_, int energy_, int maxEnergy_, int plantEnergy_,
                           EMoveStyle moveStyle_, EMutationStyle mutationStyle_, int genesCount_,
                           int energyLevelNeededToReproduce_, int energyLevelToPassToChild_, int moveEnergy_,
                           boolean saveToCSV_, String CSVName_) {
        width = width_;
        height = height_;
        equatorHeight = equatorHeight_;
        animalCount = animalCount_;
        plantCount = plantCount_;
        spawnPlantPerDay = spawnPlantPerDay_;
        energy = energy_;
        maxEnergy = maxEnergy_;
        plantEnergy = plantEnergy_;
        moveStyle = moveStyle_;
        mutationStyle = mutationStyle_;
        genesCount = genesCount_;
        energyLevelNeededToReproduce = energyLevelNeededToReproduce_;
        energyLevelToPassToChild = energyLevelToPassToChild_;
        moveEnergy = moveEnergy_;
        daysElapsed = 0;
        saveToCSV = saveToCSV_;
        CSVName = CSVName_;
    }

    public synchronized void incrementDaysElapsed() {
        daysElapsed++;
    }

    public Integer getMapWidth(){
        return width;
    }

    public Integer getMapHeight(){
        return height;
    }
    public int getSpawnPlantPerDay(){
        return spawnPlantPerDay;
    }
    public int getEquatorHeight(){
        return equatorHeight;
    }

    public int getStartAnimalCount(){
        return animalCount;
    }

    public int getStartPlantCount(){
        return plantCount;
    }

    public int getStartEnergy() {
        return energy;
    }

    public EMoveStyle getMoveStyle() {
        return moveStyle;
    }

    public EMutationStyle getMutationStyle() { return mutationStyle; }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getPlantEnergy(){
        return plantEnergy;
    }

    public int getGenesCount() {
        return genesCount;
    }

    public int getEnergyLevelNeededToReproduce() {
        return energyLevelNeededToReproduce;
    }

    public int getEnergyLevelToPassToChild() {
        return energyLevelToPassToChild;
    }
    public int getMoveEnergy() {
        return moveEnergy;
    }

    public int getDaysElapsed() {
        return daysElapsed;
    }

    public boolean shouldSaveCSV() { return saveToCSV; }
    public String getCSVName() {return CSVName; }
}
