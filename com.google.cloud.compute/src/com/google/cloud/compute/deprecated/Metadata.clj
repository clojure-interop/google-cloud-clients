(ns com.google.cloud.compute.deprecated.Metadata
  "Metadata for Google Compute Engine Instance as ket/value pairs. This includes custom metadata and
  predefined keys."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Metadata]))

(defn *new-builder
  "Returns a builder for a Metadata object.

  returns: `com.google.cloud.compute.deprecated.Metadata$Builder`"
  (^com.google.cloud.compute.deprecated.Metadata$Builder []
    (Metadata/newBuilder )))

(defn *of
  "Returns a Metadata object given the the metadata as a map. The total size of all keys
   and values must be less than 512 KB. Keys must conform to the following regexp: [a-zA-Z0-9-_]+, and be less than 128 bytes in length. This is reflected as part of a URL in
   the metadata server. Additionally, to avoid ambiguity, keys must not conflict with any other
   metadata keys for the project. Values must be less than or equal to 32768 bytes.

  values - `java.util.Map`

  returns: `com.google.cloud.compute.deprecated.Metadata`"
  (^com.google.cloud.compute.deprecated.Metadata [^java.util.Map values]
    (Metadata/of values)))

(defn get-values
  "Returns instance's metadata as key/value pairs.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^Metadata this]
    (-> this (.getValues))))

(defn get-fingerprint
  "Returns the fingerprint for the metadata. This value can be used to update instance's metadata.

  returns: `java.lang.String`"
  (^java.lang.String [^Metadata this]
    (-> this (.getFingerprint))))

(defn to-builder
  "Returns a builder for the current instance metadata.

  returns: `com.google.cloud.compute.deprecated.Metadata$Builder`"
  (^com.google.cloud.compute.deprecated.Metadata$Builder [^Metadata this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Metadata this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Metadata this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Metadata this ^java.lang.Object obj]
    (-> this (.equals obj))))

