(ns com.google.cloud.compute.v1.GuestOsFeature
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GuestOsFeature]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.GuestOsFeature`

  returns: `com.google.cloud.compute.v1.GuestOsFeature$Builder`"
  (^com.google.cloud.compute.v1.GuestOsFeature$Builder [^com.google.cloud.compute.v1.GuestOsFeature prototype]
    (GuestOsFeature/newBuilder prototype))
  (^com.google.cloud.compute.v1.GuestOsFeature$Builder []
    (GuestOsFeature/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.GuestOsFeature`"
  (^com.google.cloud.compute.v1.GuestOsFeature []
    (GuestOsFeature/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^GuestOsFeature this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^GuestOsFeature this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GuestOsFeature this]
    (-> this (.getFieldMask))))

(defn get-type
  "The ID of a supported feature. Read Enabling guest operating system features to see a list of
   available options.

  returns: `java.lang.String`"
  (^java.lang.String [^GuestOsFeature this]
    (-> this (.getType))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.GuestOsFeature$Builder`"
  (^com.google.cloud.compute.v1.GuestOsFeature$Builder [^GuestOsFeature this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GuestOsFeature this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GuestOsFeature this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GuestOsFeature this]
    (-> this (.hashCode))))

