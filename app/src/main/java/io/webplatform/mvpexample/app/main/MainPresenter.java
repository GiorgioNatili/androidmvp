package io.webplatform.mvpexample.app.main;
/**
 * Created by Giorgio_Natili on 1/28/16.
 */
public interface MainPresenter {

    void onResume();
    void onItemClicked(int position);
    void onDestroy();

}
