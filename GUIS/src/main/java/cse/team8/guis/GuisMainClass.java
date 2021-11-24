/**
 * Date : 21.10.06~
 * Title : 대학정보시스템
 * Project : GUIS (가자미 University Information System)
 * @author joonhee2 - 강준희 (20183203)
 * @author thelight0804 - 박상현 (20183145)
 * @author ssb3204 - 손성배 (20193116)
 * @author SH1NJH - 신종훈 (20183197)
 * @author dudgns0421 - 이영훈 (20173149)
 */

package cse.team8.guis;

import cse.team8.gui.LoginGUI;
import java.io.IOException;

public class GuisMainClass {
    public static void main(String[] args) throws InterruptedException, IOException {
        //로그인 창 출력
        
        LoginGUI login = new LoginGUI();
        login.setDefaultCloseOperation(LoginGUI.EXIT_ON_CLOSE);
        login.setVisible(true);
    } //main 종료
}
