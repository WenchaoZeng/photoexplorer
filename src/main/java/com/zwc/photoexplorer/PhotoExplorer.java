package com.zwc.photoexplorer;

/**
 * 主入口函数
 */
public class PhotoExplorer {

    public static void main(String[] args) throws Exception {
        Log.info("App version: %s", Global.version);
        AppUI ui = new AppUI();
        WebServer server = new WebServer();
        ui.updateText(server.url);
    }
}
