(ns com.google.cloud.compute.v1.SignedUrlKey$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SignedUrlKey$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SignedUrlKey`

  returns: `com.google.cloud.compute.v1.SignedUrlKey$Builder`"
  (^com.google.cloud.compute.v1.SignedUrlKey$Builder [^SignedUrlKey$Builder this ^com.google.cloud.compute.v1.SignedUrlKey other]
    (-> this (.mergeFrom other))))

(defn get-key-name
  "Name of the key. The name must be 1-63 characters long, and comply with RFC1035.
   Specifically, the name must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^SignedUrlKey$Builder this]
    (-> this (.getKeyName))))

(defn set-key-name
  "Name of the key. The name must be 1-63 characters long, and comply with RFC1035.
   Specifically, the name must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  key-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SignedUrlKey$Builder`"
  (^com.google.cloud.compute.v1.SignedUrlKey$Builder [^SignedUrlKey$Builder this ^java.lang.String key-name]
    (-> this (.setKeyName key-name))))

(defn get-key-value
  "128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5
   base64url encoded string.

  returns: `java.lang.String`"
  (^java.lang.String [^SignedUrlKey$Builder this]
    (-> this (.getKeyValue))))

(defn set-key-value
  "128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5
   base64url encoded string.

  key-value - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SignedUrlKey$Builder`"
  (^com.google.cloud.compute.v1.SignedUrlKey$Builder [^SignedUrlKey$Builder this ^java.lang.String key-value]
    (-> this (.setKeyValue key-value))))

(defn build
  "returns: `com.google.cloud.compute.v1.SignedUrlKey`"
  (^com.google.cloud.compute.v1.SignedUrlKey [^SignedUrlKey$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SignedUrlKey$Builder`"
  (^com.google.cloud.compute.v1.SignedUrlKey$Builder [^SignedUrlKey$Builder this]
    (-> this (.clone))))

