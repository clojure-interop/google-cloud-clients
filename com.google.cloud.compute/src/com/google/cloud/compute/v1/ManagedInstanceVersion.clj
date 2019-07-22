(ns com.google.cloud.compute.v1.ManagedInstanceVersion
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ManagedInstanceVersion]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ManagedInstanceVersion`

  returns: `com.google.cloud.compute.v1.ManagedInstanceVersion$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstanceVersion$Builder [^com.google.cloud.compute.v1.ManagedInstanceVersion prototype]
    (ManagedInstanceVersion/newBuilder prototype))
  (^com.google.cloud.compute.v1.ManagedInstanceVersion$Builder []
    (ManagedInstanceVersion/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ManagedInstanceVersion`"
  (^com.google.cloud.compute.v1.ManagedInstanceVersion []
    (ManagedInstanceVersion/getDefaultInstance )))

(defn get-instance-template
  "[Output Only] The intended template of the instance. This field is empty when current_action is
   one of { DELETING, ABANDONING }.

  returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstanceVersion this]
    (-> this (.getInstanceTemplate))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ManagedInstanceVersion this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstanceVersion this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ManagedInstanceVersion this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "[Output Only] Name of the version.

  returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstanceVersion this]
    (-> this (.getName))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ManagedInstanceVersion this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ManagedInstanceVersion this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ManagedInstanceVersion this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ManagedInstanceVersion$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstanceVersion$Builder [^ManagedInstanceVersion this]
    (-> this (.toBuilder))))

