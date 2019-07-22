(ns com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetSslProxiesSetSslCertificatesRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest`

  returns: `com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder [^TargetSslProxiesSetSslCertificatesRequest$Builder this ^com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest other]
    (-> this (.mergeFrom other))))

(defn get-ssl-certificates-list
  "New set of URLs to SslCertificate resources to associate with this TargetSslProxy. Currently
   exactly one ssl certificate must be specified.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetSslProxiesSetSslCertificatesRequest$Builder this]
    (-> this (.getSslCertificatesList))))

(defn add-all-ssl-certificates
  "New set of URLs to SslCertificate resources to associate with this TargetSslProxy. Currently
   exactly one ssl certificate must be specified.

  ssl-certificates - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder [^TargetSslProxiesSetSslCertificatesRequest$Builder this ^java.util.List ssl-certificates]
    (-> this (.addAllSslCertificates ssl-certificates))))

(defn add-ssl-certificates
  "New set of URLs to SslCertificate resources to associate with this TargetSslProxy. Currently
   exactly one ssl certificate must be specified.

  ssl-certificates - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder [^TargetSslProxiesSetSslCertificatesRequest$Builder this ^java.lang.String ssl-certificates]
    (-> this (.addSslCertificates ssl-certificates))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest [^TargetSslProxiesSetSslCertificatesRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder [^TargetSslProxiesSetSslCertificatesRequest$Builder this]
    (-> this (.clone))))

