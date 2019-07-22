(ns com.google.cloud.compute.v1.Data
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Data]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Data`

  returns: `com.google.cloud.compute.v1.Data$Builder`"
  (^com.google.cloud.compute.v1.Data$Builder [^com.google.cloud.compute.v1.Data prototype]
    (Data/newBuilder prototype))
  (^com.google.cloud.compute.v1.Data$Builder []
    (Data/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Data`"
  (^com.google.cloud.compute.v1.Data []
    (Data/getDefaultInstance )))

(defn get-key
  "[Output Only] A key that provides more detail on the warning being returned. For example, for
   warnings where there are no results in a list request for a particular zone, this key might be
   scope and the key value might be the zone name. Other examples might be a key indicating a
   deprecated resource and a suggested replacement, or a warning about invalid network settings
   (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
   forwarding).

  returns: `java.lang.String`"
  (^java.lang.String [^Data this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Data this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Data this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Data this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-value
  "[Output Only] A warning data value corresponding to the key.

  returns: `java.lang.String`"
  (^java.lang.String [^Data this]
    (-> this (.getValue))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Data this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Data this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Data this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Data$Builder`"
  (^com.google.cloud.compute.v1.Data$Builder [^Data this]
    (-> this (.toBuilder))))

