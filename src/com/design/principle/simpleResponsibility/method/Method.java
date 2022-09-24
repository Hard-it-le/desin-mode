package com.design.principle.simpleResponsibility.method;

/**

 */
public class Method {
    private void modifyUserInfo(String userName, String address) {
        userName = "Tom";
        address = "Changsha";
    }

    private void modifyUserName(String userName) {

    }

    private void modifyAddress(String address) {

    }

    private void modifyUserInfo(String userName, String... files) {

    }

    private void modifyUserInfo(String userName, String address, Boolean bool) {
        if (bool) {

        } else {

        }
    }
}
