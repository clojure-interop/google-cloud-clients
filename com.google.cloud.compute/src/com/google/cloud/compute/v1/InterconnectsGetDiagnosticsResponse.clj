(ns com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectsGetDiagnosticsResponse]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse`

  returns: `com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse$Builder`"
  (^com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse$Builder [^com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse prototype]
    (InterconnectsGetDiagnosticsResponse/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse$Builder []
    (InterconnectsGetDiagnosticsResponse/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse`"
  (^com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse []
    (InterconnectsGetDiagnosticsResponse/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectsGetDiagnosticsResponse this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectsGetDiagnosticsResponse this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectsGetDiagnosticsResponse this]
    (-> this (.getFieldMask))))

(defn get-result
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnostics`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics [^InterconnectsGetDiagnosticsResponse this]
    (-> this (.getResult))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse$Builder`"
  (^com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse$Builder [^InterconnectsGetDiagnosticsResponse this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectsGetDiagnosticsResponse this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectsGetDiagnosticsResponse this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectsGetDiagnosticsResponse this]
    (-> this (.hashCode))))

