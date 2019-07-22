(ns com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SubnetworksSetPrivateIpGoogleAccessRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest`

  returns: `com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest$Builder [^com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest prototype]
    (SubnetworksSetPrivateIpGoogleAccessRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest$Builder []
    (SubnetworksSetPrivateIpGoogleAccessRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest`"
  (^com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest []
    (SubnetworksSetPrivateIpGoogleAccessRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SubnetworksSetPrivateIpGoogleAccessRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SubnetworksSetPrivateIpGoogleAccessRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SubnetworksSetPrivateIpGoogleAccessRequest this]
    (-> this (.getFieldMask))))

(defn get-private-ip-google-access?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^SubnetworksSetPrivateIpGoogleAccessRequest this]
    (-> this (.getPrivateIpGoogleAccess))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest$Builder [^SubnetworksSetPrivateIpGoogleAccessRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SubnetworksSetPrivateIpGoogleAccessRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SubnetworksSetPrivateIpGoogleAccessRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SubnetworksSetPrivateIpGoogleAccessRequest this]
    (-> this (.hashCode))))

