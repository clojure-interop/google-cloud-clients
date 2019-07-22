(ns com.google.cloud.dns.DnsOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns DnsOptions]))

(defn *get-default-http-transport-options
  "returns: `com.google.cloud.http.HttpTransportOptions`"
  (^com.google.cloud.http.HttpTransportOptions []
    (DnsOptions/getDefaultHttpTransportOptions )))

(defn *new-builder
  "returns: `com.google.cloud.dns.DnsOptions$Builder`"
  (^com.google.cloud.dns.DnsOptions$Builder []
    (DnsOptions/newBuilder )))

(defn *get-default-instance
  "Creates a default instance of DnsOptions with the project ID and credentials inferred
   from the environment.

  returns: `com.google.cloud.dns.DnsOptions`"
  (^com.google.cloud.dns.DnsOptions []
    (DnsOptions/getDefaultInstance )))

(defn to-builder
  "returns: `com.google.cloud.dns.DnsOptions$Builder`"
  (^com.google.cloud.dns.DnsOptions$Builder [^DnsOptions this]
    (-> this (.toBuilder))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DnsOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DnsOptions this]
    (-> this (.hashCode))))

