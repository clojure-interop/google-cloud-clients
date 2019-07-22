(ns com.google.cloud.http.HttpTransportOptions
  "Class representing service options for those services that use HTTP as the transport layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.http HttpTransportOptions]))

(defn ->http-transport-options
  "Constructor.

  builder - `com.google.cloud.http.HttpTransportOptions$Builder`"
  (^HttpTransportOptions [^com.google.cloud.http.HttpTransportOptions$Builder builder]
    (new HttpTransportOptions builder)))

(defn *new-builder
  "returns: `com.google.cloud.http.HttpTransportOptions$Builder`"
  (^com.google.cloud.http.HttpTransportOptions$Builder []
    (HttpTransportOptions/newBuilder )))

(defn get-http-transport-factory
  "Returns the HTTP transport factory.

  returns: `com.google.auth.http.HttpTransportFactory`"
  (^com.google.auth.http.HttpTransportFactory [^HttpTransportOptions this]
    (-> this (.getHttpTransportFactory))))

(defn get-http-request-initializer
  "Returns a request initializer responsible for initializing requests according to service
   options.

  service-options - `com.google.cloud.ServiceOptions`

  returns: `com.google.api.client.http.HttpRequestInitializer`"
  (^com.google.api.client.http.HttpRequestInitializer [^HttpTransportOptions this ^com.google.cloud.ServiceOptions service-options]
    (-> this (.getHttpRequestInitializer service-options))))

(defn get-connect-timeout
  "Returns the timeout in milliseconds to establish a connection. 0 is an infinite timeout, a
   negative number is the default value (20000).

  returns: `int`"
  (^Integer [^HttpTransportOptions this]
    (-> this (.getConnectTimeout))))

(defn get-read-timeout
  "Returns the timeout in milliseconds to read from an established connection. 0 is an infinite
   timeout, a negative number is the default value (20000).

  returns: `int`"
  (^Integer [^HttpTransportOptions this]
    (-> this (.getReadTimeout))))

(defn to-builder
  "returns: `com.google.cloud.http.HttpTransportOptions$Builder`"
  (^com.google.cloud.http.HttpTransportOptions$Builder [^HttpTransportOptions this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HttpTransportOptions this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HttpTransportOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

