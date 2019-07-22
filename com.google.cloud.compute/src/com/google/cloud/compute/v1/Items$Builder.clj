(ns com.google.cloud.compute.v1.Items$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Items$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Items`

  returns: `com.google.cloud.compute.v1.Items$Builder`"
  (^com.google.cloud.compute.v1.Items$Builder [^Items$Builder this ^com.google.cloud.compute.v1.Items other]
    (-> this (.mergeFrom other))))

(defn get-key
  "Key for the metadata entry. Keys must conform to the following regexp: [a-zA-Z0-9-_]+, and be
   less than 128 bytes in length. This is reflected as part of a URL in the metadata server.
   Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the
   project.

  returns: `java.lang.String`"
  (^java.lang.String [^Items$Builder this]
    (-> this (.getKey))))

(defn set-key
  "Key for the metadata entry. Keys must conform to the following regexp: [a-zA-Z0-9-_]+, and be
   less than 128 bytes in length. This is reflected as part of a URL in the metadata server.
   Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the
   project.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Items$Builder`"
  (^com.google.cloud.compute.v1.Items$Builder [^Items$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-value
  "Value for the metadata entry. These are free-form strings, and only have meaning as
   interpreted by the image running in the instance. The only restriction placed on values is
   that their size must be less than or equal to 262144 bytes (256 KiB).

  returns: `java.lang.String`"
  (^java.lang.String [^Items$Builder this]
    (-> this (.getValue))))

(defn set-value
  "Value for the metadata entry. These are free-form strings, and only have meaning as
   interpreted by the image running in the instance. The only restriction placed on values is
   that their size must be less than or equal to 262144 bytes (256 KiB).

  value - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Items$Builder`"
  (^com.google.cloud.compute.v1.Items$Builder [^Items$Builder this ^java.lang.String value]
    (-> this (.setValue value))))

(defn build
  "returns: `com.google.cloud.compute.v1.Items`"
  (^com.google.cloud.compute.v1.Items [^Items$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Items$Builder`"
  (^com.google.cloud.compute.v1.Items$Builder [^Items$Builder this]
    (-> this (.clone))))

