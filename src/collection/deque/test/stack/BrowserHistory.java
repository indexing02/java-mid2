package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    Deque<String> browserHistory = new ArrayDeque<>();
    private String currentBrowser;

    public void visitPage(String browser) {

        if(currentBrowser != null){
            browserHistory.push(currentBrowser);
        }

        currentBrowser = browser;
        System.out.println("방문 : " + browser);

    }

    public String goBack() {
        if(! browserHistory.isEmpty()){
            currentBrowser = browserHistory.pop();
            System.out.println("뒤로가기 : "  + currentBrowser );
            return currentBrowser;
        }
        return null;
    }
}
