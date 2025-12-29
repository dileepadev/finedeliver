/*
   --------------------------------------
      Developed by
      Dileepa Bandara
      https://dileepabandara.github.io
      contact.dileepabandara@gmail.com
      ©dileepabandara.dev
      2021
   --------------------------------------
*/

package dev.dileepabandara.finedeliver.HelperClasses;

import com.google.firebase.database.PropertyName;

public class UserPostItemHelperClass {

    private String postItemCategory, postOrderName, postItemDescription, postItemPackageSize, postItemPackageWeight,
            postItemDueDatAndTime, postItemOriginLocation, postItemDestinationLocation, itemImageUri,
            userID, orderID;


    public UserPostItemHelperClass() {
    }

    public UserPostItemHelperClass(String postItemCategory, String postOrderName, String postItemDescription, String postItemPackageSize, String postItemPackageWeight, String postItemDueDatAndTime, String postItemOriginLocation, String postItemDestinationLocation, String itemImageUri, String userID, String orderID) {
        this.postItemCategory = postItemCategory;
        this.postOrderName = postOrderName;
        this.postItemDescription = postItemDescription;
        this.postItemPackageSize = postItemPackageSize;
        this.postItemPackageWeight = postItemPackageWeight;
        this.postItemDueDatAndTime = postItemDueDatAndTime;
        this.postItemOriginLocation = postItemOriginLocation;
        this.postItemDestinationLocation = postItemDestinationLocation;
        this.itemImageUri = itemImageUri;
        this.userID = userID;
        this.orderID = orderID;
    }

    @PropertyName("postItemCategory")
    public String getPostItemCategory() {
        return postItemCategory;
    }

    @PropertyName("postItemCategory")
    public void setPostItemCategory(String postItemCategory) {
        this.postItemCategory = postItemCategory;
    }

    @PropertyName("postOrderName")
    public String getPostOrderName() {
        return postOrderName;
    }

    @PropertyName("postOrderName")
    public void setPostOrderName(String postOrderName) {
        this.postOrderName = postOrderName;
    }

    @PropertyName("postItemDescription")
    public String getPostItemDescription() {
        return postItemDescription;
    }

    @PropertyName("postItemDescription")
    public void setPostItemDescription(String postItemDescription) {
        this.postItemDescription = postItemDescription;
    }

    @PropertyName("postItemPackageSize")
    public String getPostItemPackageSize() {
        return postItemPackageSize;
    }

    @PropertyName("postItemPackageSize")
    public void setPostItemPackageSize(String postItemPackageSize) {
        this.postItemPackageSize = postItemPackageSize;
    }

    @PropertyName("postItemPackageWeight")
    public String getPostItemPackageWeight() {
        return postItemPackageWeight;
    }

    @PropertyName("postItemPackageWeight")
    public void setPostItemPackageWeight(String postItemPackageWeight) {
        this.postItemPackageWeight = postItemPackageWeight;
    }

    @PropertyName("postItemDueDatAndTime")
    public String getPostItemDueDatAndTime() {
        return postItemDueDatAndTime;
    }

    @PropertyName("postItemDueDatAndTime")
    public void setPostItemDueDatAndTime(String postItemDueDatAndTime) {
        this.postItemDueDatAndTime = postItemDueDatAndTime;
    }

    @PropertyName("postItemOriginLocation")
    public String getPostItemOriginLocation() {
        return postItemOriginLocation;
    }

    @PropertyName("postItemOriginLocation")
    public void setPostItemOriginLocation(String postItemOriginLocation) {
        this.postItemOriginLocation = postItemOriginLocation;
    }

    @PropertyName("postItemDestinationLocation")
    public String getPostItemDestinationLocation() {
        return postItemDestinationLocation;
    }

    @PropertyName("postItemDestinationLocation")
    public void setPostItemDestinationLocation(String postItemDestinationLocation) {
        this.postItemDestinationLocation = postItemDestinationLocation;
    }

    @PropertyName("itemImageUri")
    public String getItemImageUri() {
        return itemImageUri;
    }

    @PropertyName("itemImageUri")
    public void setItemImageUri(String itemImageUri) {
        this.itemImageUri = itemImageUri;
    }

    @PropertyName("userID")
    public String getUserID() {
        return userID;
    }

    @PropertyName("userID")
    public void setUserID(String userID) {
        this.userID = userID;
    }

    @PropertyName("orderID")
    public String getOrderID() {
        return orderID;
    }

    @PropertyName("orderID")
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
}
