(ns com.google.cloud.compute.v1.InterconnectCircuitInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectCircuitInfo]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectCircuitInfo`

  returns: `com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder [^com.google.cloud.compute.v1.InterconnectCircuitInfo prototype]
    (InterconnectCircuitInfo/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder []
    (InterconnectCircuitInfo/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectCircuitInfo`"
  (^com.google.cloud.compute.v1.InterconnectCircuitInfo []
    (InterconnectCircuitInfo/getDefaultInstance )))

(defn get-customer-demarc-id
  "Customer-side demarc ID for this circuit.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectCircuitInfo this]
    (-> this (.getCustomerDemarcId))))

(defn get-google-circuit-id
  "Google-assigned unique ID for this circuit. Assigned at circuit turn-up.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectCircuitInfo this]
    (-> this (.getGoogleCircuitId))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectCircuitInfo this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectCircuitInfo this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectCircuitInfo this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectCircuitInfo this]
    (-> this (.getApiMessageRequestBody))))

(defn get-google-demarc-id
  "Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to
   the customer in the LOA.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectCircuitInfo this]
    (-> this (.getGoogleDemarcId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectCircuitInfo this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectCircuitInfo this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectCircuitInfo$Builder [^InterconnectCircuitInfo this]
    (-> this (.toBuilder))))

