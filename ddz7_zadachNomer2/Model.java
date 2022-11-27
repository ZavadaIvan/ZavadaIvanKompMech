package ddz7_zadachNomer2;

class Model extends SiemensMobile {
	 
    @Override
    void connectToSiemensOnline() {
        System.out.println("Під'єднались до сервісу Сіменс онлайн");
    }
 
    @Override
    public void startCall(String number) {
    	incomingCall = true;
    }
 
    @Override
    public String searchForCall() {
        while (true){
            if (incomingCall){
                if (isTalkingNow){
                    return "Абонент зайнятий";
                } else return "Виклик прийнято";
            }
        }
    }
 
    @Override
    public void acceptCall(String number) {
        isTalkingNow = true;
 
    }
 
    @Override
    public void breakCall() {
        isTalkingNow = false;
    }
}