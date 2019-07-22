(ns com.google.cloud.compute.v1.InterconnectLocationRegionInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectLocationRegionInfo]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectLocationRegionInfo`

  returns: `com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder [^com.google.cloud.compute.v1.InterconnectLocationRegionInfo prototype]
    (InterconnectLocationRegionInfo/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder []
    (InterconnectLocationRegionInfo/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectLocationRegionInfo`"
  (^com.google.cloud.compute.v1.InterconnectLocationRegionInfo []
    (InterconnectLocationRegionInfo/getDefaultInstance )))

(defn get-expected-rtt-ms
  "Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this
   region.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocationRegionInfo this]
    (-> this (.getExpectedRttMs))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectLocationRegionInfo this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocationRegionInfo this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectLocationRegionInfo this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-location-presence
  "Identifies the network presence of this location.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocationRegionInfo this]
    (-> this (.getLocationPresence))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectLocationRegionInfo this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectLocationRegionInfo this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectLocationRegionInfo this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "URL for the region of this location.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocationRegionInfo this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocationRegionInfo$Builder [^InterconnectLocationRegionInfo this]
    (-> this (.toBuilder))))

