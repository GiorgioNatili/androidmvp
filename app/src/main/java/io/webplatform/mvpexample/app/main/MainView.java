package io.webplatform.mvpexample.app.main;

import java.util.List;

/**
 * Created by Giorgio_Natili on 1/28/16.
 */

public interface MainView {

    void showProgress();
    void hideProgress();
    void setItems(List<String> items);
    void showMessage(String message);

}
