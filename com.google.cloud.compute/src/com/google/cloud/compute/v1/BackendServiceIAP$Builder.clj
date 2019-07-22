(ns com.google.cloud.compute.v1.BackendServiceIAP$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServiceIAP$Builder]))

(defn get-oauth-2-client-secret
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceIAP$Builder this]
    (-> this (.getOauth2ClientSecret))))

(defn set-oauth-2-client-id
  "oauth-2-client-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendServiceIAP$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceIAP$Builder [^BackendServiceIAP$Builder this ^java.lang.String oauth-2-client-id]
    (-> this (.setOauth2ClientId oauth-2-client-id))))

(defn set-oauth-2-client-secret-sha-256
  "[Output Only] SHA256 hash value for the field oauth2_client_secret above.

  oauth-2-client-secret-sha-256 - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendServiceIAP$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceIAP$Builder [^BackendServiceIAP$Builder this ^java.lang.String oauth-2-client-secret-sha-256]
    (-> this (.setOauth2ClientSecretSha256 oauth-2-client-secret-sha-256))))

(defn build
  "returns: `com.google.cloud.compute.v1.BackendServiceIAP`"
  (^com.google.cloud.compute.v1.BackendServiceIAP [^BackendServiceIAP$Builder this]
    (-> this (.build))))

(defn set-oauth-2-client-secret
  "oauth-2-client-secret - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendServiceIAP$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceIAP$Builder [^BackendServiceIAP$Builder this ^java.lang.String oauth-2-client-secret]
    (-> this (.setOauth2ClientSecret oauth-2-client-secret))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.BackendServiceIAP`

  returns: `com.google.cloud.compute.v1.BackendServiceIAP$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceIAP$Builder [^BackendServiceIAP$Builder this ^com.google.cloud.compute.v1.BackendServiceIAP other]
    (-> this (.mergeFrom other))))

(defn set-enabled
  "enabled - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.BackendServiceIAP$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceIAP$Builder [^BackendServiceIAP$Builder this ^java.lang.Boolean enabled]
    (-> this (.setEnabled enabled))))

(defn get-oauth-2-client-secret-sha-256
  "[Output Only] SHA256 hash value for the field oauth2_client_secret above.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceIAP$Builder this]
    (-> this (.getOauth2ClientSecretSha256))))

(defn get-enabled?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BackendServiceIAP$Builder this]
    (-> this (.getEnabled))))

(defn clone
  "returns: `com.google.cloud.compute.v1.BackendServiceIAP$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceIAP$Builder [^BackendServiceIAP$Builder this]
    (-> this (.clone))))

(defn get-oauth-2-client-id
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceIAP$Builder this]
    (-> this (.getOauth2ClientId))))

