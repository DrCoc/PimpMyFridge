package Controller;
import Device.DeviceListenerController;
import Model.IModel;

public class Controller implements IController{
    private IModel M;
    private DeviceListenerController DLC;
    public Controller(IModel m, DeviceListenerController dlc) {
        this.M = m;
        this.DLC = dlc;
    }

    @Override
    public void setInterfaceTemperature(int temperature){
        M.set_interfaceTemperature(temperature);
    }

    public void set_temperatureConfig(int _temperatureConfig){
        M.set_temperatureConfig(_temperatureConfig);
    }

    public int get_temperatureConfig() {
       return M.get_temperatureConfig();
    }

    public int getInterfaceTemp(){
        return  M.getInterfaceTemp();
    }

    @Override
    public void set_interfaceUnit(String _unit) {
        M.set_interfaceUnit(_unit);
    }

    @Override
    public String getInterfaceUnit() {
        return M.getInterfaceUnit();
    }

    @Override
    public void set_interfaceTimeZone(String _timeZone) {
        M.set_interfaceTimeZone(_timeZone);
    }

    @Override
    public String getInterfaceTimeZone() {
        return M.getInterfaceTimeZone();
    }

    @Override
    public void initializeFromFile() {
        M.initializeFromFile();
    }

    @Override
    public void saveInFile() {
        M.saveInFile();
    }

    public double get_temperatureInterieur() {
        return M.get_temperatureInterieur();
    }

    public double get_temperatureExterieur() {
        return M.get_temperatureExterieur();
    }

    public double get_temperaturePeltier() {
        return M.get_temperaturePeltier();
    }

    @Override
    public void updateListDevice() {
        DLC.setListDevice();
    }

    @Override
    public void selectDevice(String device) {
        DLC.selectDevice(device);
    }

    @Override
    public void sendData() {
        DLC.sendTrame();
    }


}
