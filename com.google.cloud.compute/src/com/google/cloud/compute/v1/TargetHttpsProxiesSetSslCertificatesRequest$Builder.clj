(ns com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetHttpsProxiesSetSslCertificatesRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder [^TargetHttpsProxiesSetSslCertificatesRequest$Builder this ^com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest other]
    (-> this (.mergeFrom other))))

(defn get-ssl-certificates-list
  "New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
   Currently exactly one SslCertificate resource must be specified.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetHttpsProxiesSetSslCertificatesRequest$Builder this]
    (-> this (.getSslCertificatesList))))

(defn add-all-ssl-certificates
  "New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
   Currently exactly one SslCertificate resource must be specified.

  ssl-certificates - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder [^TargetHttpsProxiesSetSslCertificatesRequest$Builder this ^java.util.List ssl-certificates]
    (-> this (.addAllSslCertificates ssl-certificates))))

(defn add-ssl-certificates
  "New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
   Currently exactly one SslCertificate resource must be specified.

  ssl-certificates - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder [^TargetHttpsProxiesSetSslCertificatesRequest$Builder this ^java.lang.String ssl-certificates]
    (-> this (.addSslCertificates ssl-certificates))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest [^TargetHttpsProxiesSetSslCertificatesRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder [^TargetHttpsProxiesSetSslCertificatesRequest$Builder this]
    (-> this (.clone))))

