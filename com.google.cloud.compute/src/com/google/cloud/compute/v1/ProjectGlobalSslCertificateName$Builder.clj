(ns com.google.cloud.compute.v1.ProjectGlobalSslCertificateName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalSslCertificateName$Builder]))

(defn ->builder
  "Constructor.

  project-global-ssl-certificate-name - `com.google.cloud.compute.v1.ProjectGlobalSslCertificateName`"
  (^ProjectGlobalSslCertificateName$Builder [^com.google.cloud.compute.v1.ProjectGlobalSslCertificateName project-global-ssl-certificate-name]
    (new ProjectGlobalSslCertificateName$Builder project-global-ssl-certificate-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSslCertificateName$Builder this]
    (-> this (.getProject))))

(defn get-ssl-certificate
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSslCertificateName$Builder this]
    (-> this (.getSslCertificate))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSslCertificateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslCertificateName$Builder [^ProjectGlobalSslCertificateName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-ssl-certificate
  "ssl-certificate - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSslCertificateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslCertificateName$Builder [^ProjectGlobalSslCertificateName$Builder this ^java.lang.String ssl-certificate]
    (-> this (.setSslCertificate ssl-certificate))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSslCertificateName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslCertificateName [^ProjectGlobalSslCertificateName$Builder this]
    (-> this (.build))))

