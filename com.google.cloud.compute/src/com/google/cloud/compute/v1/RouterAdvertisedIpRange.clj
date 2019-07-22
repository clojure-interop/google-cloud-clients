(ns com.google.cloud.compute.v1.RouterAdvertisedIpRange
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterAdvertisedIpRange]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RouterAdvertisedIpRange`

  returns: `com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder`"
  (^com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder [^com.google.cloud.compute.v1.RouterAdvertisedIpRange prototype]
    (RouterAdvertisedIpRange/newBuilder prototype))
  (^com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder []
    (RouterAdvertisedIpRange/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RouterAdvertisedIpRange`"
  (^com.google.cloud.compute.v1.RouterAdvertisedIpRange []
    (RouterAdvertisedIpRange/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterAdvertisedIpRange this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RouterAdvertisedIpRange this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RouterAdvertisedIpRange this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-description
  "User-specified description for the IP range.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterAdvertisedIpRange this]
    (-> this (.getDescription))))

(defn get-range
  "The IP range to advertise. The value must be a CIDR-formatted string.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterAdvertisedIpRange this]
    (-> this (.getRange))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RouterAdvertisedIpRange this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RouterAdvertisedIpRange this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RouterAdvertisedIpRange this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder`"
  (^com.google.cloud.compute.v1.RouterAdvertisedIpRange$Builder [^RouterAdvertisedIpRange this]
    (-> this (.toBuilder))))

