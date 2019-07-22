(ns com.google.cloud.storage.HttpMethod
  "Http method supported by Storage service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage HttpMethod]))

(def *-get
  "Static Constant.

  type: com.google.cloud.storage.HttpMethod"
  HttpMethod/GET)

(def *-head
  "Static Constant.

  type: com.google.cloud.storage.HttpMethod"
  HttpMethod/HEAD)

(def *-put
  "Static Constant.

  type: com.google.cloud.storage.HttpMethod"
  HttpMethod/PUT)

(def *-post
  "Static Constant.

  type: com.google.cloud.storage.HttpMethod"
  HttpMethod/POST)

(def *-delete
  "Static Constant.

  type: com.google.cloud.storage.HttpMethod"
  HttpMethod/DELETE)

(def *-options
  "Static Constant.

  type: com.google.cloud.storage.HttpMethod"
  HttpMethod/OPTIONS)

(defn *value-of-strict
  "Get the HttpMethod for the given String constant, and throw an exception if the constant is not
   recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.storage.HttpMethod`"
  (^com.google.cloud.storage.HttpMethod [^java.lang.String constant]
    (HttpMethod/valueOfStrict constant)))

(defn *value-of
  "Get the HttpMethod for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.storage.HttpMethod`"
  (^com.google.cloud.storage.HttpMethod [^java.lang.String constant]
    (HttpMethod/valueOf constant)))

(defn *values
  "Return the known values for HttpMethod.

  returns: `com.google.cloud.storage.HttpMethod[]`"
  ([]
    (HttpMethod/values )))

