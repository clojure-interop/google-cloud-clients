(ns com.google.cloud.compute.v1.ProjectGlobalSslCertificateName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalSslCertificateName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalSslCertificateName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSslCertificateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslCertificateName$Builder []
    (ProjectGlobalSslCertificateName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  ssl-certificate - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSslCertificateName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslCertificateName [^java.lang.String project ^java.lang.String ssl-certificate]
    (ProjectGlobalSslCertificateName/of project ssl-certificate)))

(defn *format
  "project - `java.lang.String`
  ssl-certificate - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String ssl-certificate]
    (ProjectGlobalSslCertificateName/format project ssl-certificate)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalSslCertificateName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalSslCertificateName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSslCertificateName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslCertificateName [^java.lang.String formatted-string]
    (ProjectGlobalSslCertificateName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalSslCertificateName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSslCertificateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslCertificateName$Builder [^ProjectGlobalSslCertificateName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSslCertificateName this]
    (-> this (.getProject))))

(defn get-ssl-certificate
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSslCertificateName this]
    (-> this (.getSslCertificate))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalSslCertificateName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSslCertificateName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSslCertificateName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalSslCertificateName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalSslCertificateName this]
    (-> this (.hashCode))))

