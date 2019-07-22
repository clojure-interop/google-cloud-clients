(ns com.google.cloud.logging.HttpRequest$RequestMethod
  "The HTTP request method."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging HttpRequest$RequestMethod]))

(def *-get
  "Static Constant.

  type: com.google.cloud.logging.HttpRequest$RequestMethod"
  HttpRequest$RequestMethod/GET)

(def *-head
  "Static Constant.

  type: com.google.cloud.logging.HttpRequest$RequestMethod"
  HttpRequest$RequestMethod/HEAD)

(def *-put
  "Static Constant.

  type: com.google.cloud.logging.HttpRequest$RequestMethod"
  HttpRequest$RequestMethod/PUT)

(def *-post
  "Static Constant.

  type: com.google.cloud.logging.HttpRequest$RequestMethod"
  HttpRequest$RequestMethod/POST)

(defn *value-of-strict
  "Get the RequestMethod for the given String constant, and throw an exception if the constant
   is not recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.logging.HttpRequest$RequestMethod`"
  (^com.google.cloud.logging.HttpRequest$RequestMethod [^java.lang.String constant]
    (HttpRequest$RequestMethod/valueOfStrict constant)))

(defn *value-of
  "Get the RequestMethod for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.logging.HttpRequest$RequestMethod`"
  (^com.google.cloud.logging.HttpRequest$RequestMethod [^java.lang.String constant]
    (HttpRequest$RequestMethod/valueOf constant)))

(defn *values
  "Return the known values for RequestMethod.

  returns: `com.google.cloud.logging.HttpRequest$RequestMethod[]`"
  ([]
    (HttpRequest$RequestMethod/values )))

