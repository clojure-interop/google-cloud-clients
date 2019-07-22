(ns com.google.cloud.compute.v1.SslCertificate$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslCertificate$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslCertificate$Builder`"
  (^com.google.cloud.compute.v1.SslCertificate$Builder [^SslCertificate$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslCertificate$Builder`"
  (^com.google.cloud.compute.v1.SslCertificate$Builder [^SslCertificate$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#sslCertificate for SSL certificates.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate$Builder this]
    (-> this (.getKind))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslCertificate$Builder`"
  (^com.google.cloud.compute.v1.SslCertificate$Builder [^SslCertificate$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#sslCertificate for SSL certificates.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslCertificate$Builder`"
  (^com.google.cloud.compute.v1.SslCertificate$Builder [^SslCertificate$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-private-key
  "A write-only private key in PEM format. Only insert requests will include this field.

  private-key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslCertificate$Builder`"
  (^com.google.cloud.compute.v1.SslCertificate$Builder [^SslCertificate$Builder this ^java.lang.String private-key]
    (-> this (.setPrivateKey private-key))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslCertificate$Builder`"
  (^com.google.cloud.compute.v1.SslCertificate$Builder [^SslCertificate$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.SslCertificate`"
  (^com.google.cloud.compute.v1.SslCertificate [^SslCertificate$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslCertificate$Builder`"
  (^com.google.cloud.compute.v1.SslCertificate$Builder [^SslCertificate$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SslCertificate`

  returns: `com.google.cloud.compute.v1.SslCertificate$Builder`"
  (^com.google.cloud.compute.v1.SslCertificate$Builder [^SslCertificate$Builder this ^com.google.cloud.compute.v1.SslCertificate other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate$Builder this]
    (-> this (.getSelfLink))))

(defn get-private-key
  "A write-only private key in PEM format. Only insert requests will include this field.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate$Builder this]
    (-> this (.getPrivateKey))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SslCertificate$Builder`"
  (^com.google.cloud.compute.v1.SslCertificate$Builder [^SslCertificate$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-certificate
  "A local certificate file. The certificate must be in PEM format. The certificate chain must
   be no greater than 5 certs long. The chain must include at least one intermediate cert.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate$Builder this]
    (-> this (.getCertificate))))

(defn set-certificate
  "A local certificate file. The certificate must be in PEM format. The certificate chain must
   be no greater than 5 certs long. The chain must include at least one intermediate cert.

  certificate - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslCertificate$Builder`"
  (^com.google.cloud.compute.v1.SslCertificate$Builder [^SslCertificate$Builder this ^java.lang.String certificate]
    (-> this (.setCertificate certificate))))

