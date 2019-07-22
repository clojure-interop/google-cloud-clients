(ns com.google.cloud.compute.v1.BackendServiceIAP
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServiceIAP]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.BackendServiceIAP`

  returns: `com.google.cloud.compute.v1.BackendServiceIAP$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceIAP$Builder [^com.google.cloud.compute.v1.BackendServiceIAP prototype]
    (BackendServiceIAP/newBuilder prototype))
  (^com.google.cloud.compute.v1.BackendServiceIAP$Builder []
    (BackendServiceIAP/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.BackendServiceIAP`"
  (^com.google.cloud.compute.v1.BackendServiceIAP []
    (BackendServiceIAP/getDefaultInstance )))

(defn get-oauth-2-client-secret
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceIAP this]
    (-> this (.getOauth2ClientSecret))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendServiceIAP this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceIAP this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^BackendServiceIAP this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^BackendServiceIAP this]
    (-> this (.getApiMessageRequestBody))))

(defn get-oauth-2-client-secret-sha-256
  "[Output Only] SHA256 hash value for the field oauth2_client_secret above.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceIAP this]
    (-> this (.getOauth2ClientSecretSha256))))

(defn get-enabled?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BackendServiceIAP this]
    (-> this (.getEnabled))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BackendServiceIAP this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BackendServiceIAP this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-oauth-2-client-id
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceIAP this]
    (-> this (.getOauth2ClientId))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.BackendServiceIAP$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceIAP$Builder [^BackendServiceIAP this]
    (-> this (.toBuilder))))

