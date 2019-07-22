(ns com.google.cloud.compute.v1.RouterNatLogConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterNatLogConfig]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RouterNatLogConfig`

  returns: `com.google.cloud.compute.v1.RouterNatLogConfig$Builder`"
  (^com.google.cloud.compute.v1.RouterNatLogConfig$Builder [^com.google.cloud.compute.v1.RouterNatLogConfig prototype]
    (RouterNatLogConfig/newBuilder prototype))
  (^com.google.cloud.compute.v1.RouterNatLogConfig$Builder []
    (RouterNatLogConfig/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RouterNatLogConfig`"
  (^com.google.cloud.compute.v1.RouterNatLogConfig []
    (RouterNatLogConfig/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterNatLogConfig this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RouterNatLogConfig this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RouterNatLogConfig this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-enable?
  "Indicates whether or not to export logs. This is false by default.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^RouterNatLogConfig this]
    (-> this (.getEnable))))

(defn get-filter
  "Specifies the desired filtering of logs on this NAT. If unspecified, logs are exported for all
   connections handled by this NAT.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterNatLogConfig this]
    (-> this (.getFilter))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RouterNatLogConfig this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RouterNatLogConfig this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RouterNatLogConfig this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RouterNatLogConfig$Builder`"
  (^com.google.cloud.compute.v1.RouterNatLogConfig$Builder [^RouterNatLogConfig this]
    (-> this (.toBuilder))))

