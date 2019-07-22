(ns com.google.cloud.compute.v1.Condition
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Condition]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Condition`

  returns: `com.google.cloud.compute.v1.Condition$Builder`"
  (^com.google.cloud.compute.v1.Condition$Builder [^com.google.cloud.compute.v1.Condition prototype]
    (Condition/newBuilder prototype))
  (^com.google.cloud.compute.v1.Condition$Builder []
    (Condition/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Condition`"
  (^com.google.cloud.compute.v1.Condition []
    (Condition/getDefaultInstance )))

(defn get-values-list
  "The objects of the condition.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Condition this]
    (-> this (.getValuesList))))

(defn get-sys
  "Trusted attributes supplied by any service that owns resources and uses the IAM system for
   access control.

  returns: `java.lang.String`"
  (^java.lang.String [^Condition this]
    (-> this (.getSys))))

(defn get-svc
  "Trusted attributes discharged by the service.

  returns: `java.lang.String`"
  (^java.lang.String [^Condition this]
    (-> this (.getSvc))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Condition this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Condition this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Condition this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Condition this]
    (-> this (.getApiMessageRequestBody))))

(defn get-iam
  "Trusted attributes supplied by the IAM system.

  returns: `java.lang.String`"
  (^java.lang.String [^Condition this]
    (-> this (.getIam))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Condition this]
    (-> this (.hashCode))))

(defn get-op
  "An operator to apply the subject with.

  returns: `java.lang.String`"
  (^java.lang.String [^Condition this]
    (-> this (.getOp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Condition this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Condition$Builder`"
  (^com.google.cloud.compute.v1.Condition$Builder [^Condition this]
    (-> this (.toBuilder))))

