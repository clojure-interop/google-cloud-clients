(ns com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectAttachmentPrivateInfo]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo$Builder [^com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo prototype]
    (InterconnectAttachmentPrivateInfo/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo$Builder []
    (InterconnectAttachmentPrivateInfo/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo []
    (InterconnectAttachmentPrivateInfo/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectAttachmentPrivateInfo this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectAttachmentPrivateInfo this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectAttachmentPrivateInfo this]
    (-> this (.getFieldMask))))

(defn get-tag-8021q
  "[Output Only] 802.1q encapsulation tag to be used for traffic between Google and the customer,
   going to and from this network and region.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InterconnectAttachmentPrivateInfo this]
    (-> this (.getTag8021q))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo$Builder [^InterconnectAttachmentPrivateInfo this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachmentPrivateInfo this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectAttachmentPrivateInfo this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectAttachmentPrivateInfo this]
    (-> this (.hashCode))))

