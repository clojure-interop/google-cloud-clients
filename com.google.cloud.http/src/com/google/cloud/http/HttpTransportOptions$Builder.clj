(ns com.google.cloud.http.HttpTransportOptions$Builder
  "Builder for HttpTransportOptions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.http HttpTransportOptions$Builder]))

(defn build
  "returns: `com.google.cloud.http.HttpTransportOptions`"
  (^com.google.cloud.http.HttpTransportOptions [^HttpTransportOptions$Builder this]
    (-> this (.build))))

(defn set-http-transport-factory
  "Sets the HTTP transport factory.

  http-transport-factory - `com.google.auth.http.HttpTransportFactory`

  returns: the builder - `com.google.cloud.http.HttpTransportOptions$Builder`"
  (^com.google.cloud.http.HttpTransportOptions$Builder [^HttpTransportOptions$Builder this ^com.google.auth.http.HttpTransportFactory http-transport-factory]
    (-> this (.setHttpTransportFactory http-transport-factory))))

(defn set-connect-timeout
  "Sets the timeout in milliseconds to establish a connection.

  connect-timeout - connection timeout in milliseconds. 0 for an infinite timeout, a negative number for the default value (20000). - `int`

  returns: the builder - `com.google.cloud.http.HttpTransportOptions$Builder`"
  (^com.google.cloud.http.HttpTransportOptions$Builder [^HttpTransportOptions$Builder this ^Integer connect-timeout]
    (-> this (.setConnectTimeout connect-timeout))))

(defn set-read-timeout
  "Sets the timeout in milliseconds to read data from an established connection.

  read-timeout - read timeout in milliseconds. 0 for an infinite timeout, a negative number for the default value (20000). - `int`

  returns: the builder - `com.google.cloud.http.HttpTransportOptions$Builder`"
  (^com.google.cloud.http.HttpTransportOptions$Builder [^HttpTransportOptions$Builder this ^Integer read-timeout]
    (-> this (.setReadTimeout read-timeout))))

