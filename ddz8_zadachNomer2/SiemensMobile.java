package ddz7_zadachNomer2;

abstract class SiemensMobile implements Mobile {
    public Boolean incomingCall;
    public Boolean isTalkingNow;
    public int siemensSerialNumber;
    abstract void connectToSiemensOnline();
    
}
