package serialport_utils;


/**
 * Created by 10188 on 2019/1/24.
 */

public class FandelayThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            Send_Controller.isClicked=2;
            Send_Controller.send_type=7;
            sleep(500);
            Send_Controller.isClicked=2;
            Send_Controller.send_type=8;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
