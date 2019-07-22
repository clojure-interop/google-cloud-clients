(ns com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ShieldedInstanceIdentityEntry$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder [^ShieldedInstanceIdentityEntry$Builder this ^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry other]
    (-> this (.mergeFrom other))))

(defn get-ek-cert
  "A PEM-encoded X.509 certificate. This field can be empty.

  returns: `java.lang.String`"
  (^java.lang.String [^ShieldedInstanceIdentityEntry$Builder this]
    (-> this (.getEkCert))))

(defn set-ek-cert
  "A PEM-encoded X.509 certificate. This field can be empty.

  ek-cert - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder [^ShieldedInstanceIdentityEntry$Builder this ^java.lang.String ek-cert]
    (-> this (.setEkCert ek-cert))))

(defn get-ek-pub
  "A PEM-encoded public key.

  returns: `java.lang.String`"
  (^java.lang.String [^ShieldedInstanceIdentityEntry$Builder this]
    (-> this (.getEkPub))))

(defn set-ek-pub
  "A PEM-encoded public key.

  ek-pub - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder [^ShieldedInstanceIdentityEntry$Builder this ^java.lang.String ek-pub]
    (-> this (.setEkPub ek-pub))))

(defn build
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry [^ShieldedInstanceIdentityEntry$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder [^ShieldedInstanceIdentityEntry$Builder this]
    (-> this (.clone))))

