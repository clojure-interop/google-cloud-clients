(ns com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectDiagnosticsARPEntry]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder [^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry prototype]
    (InterconnectDiagnosticsARPEntry/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder []
    (InterconnectDiagnosticsARPEntry/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry []
    (InterconnectDiagnosticsARPEntry/getDefaultInstance )))

(defn get-ip-address
  "The IP address of this ARP neighbor.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsARPEntry this]
    (-> this (.getIpAddress))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectDiagnosticsARPEntry this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsARPEntry this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectDiagnosticsARPEntry this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectDiagnosticsARPEntry this]
    (-> this (.getApiMessageRequestBody))))

(defn get-mac-address
  "The MAC address of this ARP neighbor.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsARPEntry this]
    (-> this (.getMacAddress))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectDiagnosticsARPEntry this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectDiagnosticsARPEntry this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry$Builder [^InterconnectDiagnosticsARPEntry this]
    (-> this (.toBuilder))))

