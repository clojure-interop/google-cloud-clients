(ns com.google.cloud.compute.deprecated.Metadata$Builder
  "A builder for Metadata objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Metadata$Builder]))

(defn set-values
  "Sets the metadata for the instance as key/value pairs. The total size of all keys and values
   must be less than 512 KB. Keys must conform to the following regexp: [a-zA-Z0-9-_]+,
   and be less than 128 bytes in length. This is reflected as part of a URL in the metadata
   server. Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys
   for the project. Values must be less than or equal to 32768 bytes.

  values - `java.util.Map`

  returns: `com.google.cloud.compute.deprecated.Metadata$Builder`"
  (^com.google.cloud.compute.deprecated.Metadata$Builder [^Metadata$Builder this ^java.util.Map values]
    (-> this (.setValues values))))

(defn add
  "Adds a key/value pair to the instance metadata. The total size of all keys and values must be
   less than 512 KB. Keys must conform to the following regexp: [a-zA-Z0-9-_]+, and be
   less than 128 bytes in length. This is reflected as part of a URL in the metadata server.
   Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the
   project. Values must be less than or equal to 32768 bytes.

  key - `java.lang.String`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Metadata$Builder`"
  (^com.google.cloud.compute.deprecated.Metadata$Builder [^Metadata$Builder this ^java.lang.String key ^java.lang.String value]
    (-> this (.add key value))))

(defn set-fingerprint
  "Sets the fingerprint for the metadata. This value can be used to update instance's metadata.

  fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Metadata$Builder`"
  (^com.google.cloud.compute.deprecated.Metadata$Builder [^Metadata$Builder this ^java.lang.String fingerprint]
    (-> this (.setFingerprint fingerprint))))

(defn build
  "Creates a Metadata object.

  returns: `com.google.cloud.compute.deprecated.Metadata`"
  (^com.google.cloud.compute.deprecated.Metadata [^Metadata$Builder this]
    (-> this (.build))))

