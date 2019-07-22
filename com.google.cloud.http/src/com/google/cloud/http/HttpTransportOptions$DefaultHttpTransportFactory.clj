(ns com.google.cloud.http.HttpTransportOptions$DefaultHttpTransportFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.http HttpTransportOptions$DefaultHttpTransportFactory]))

(defn ->default-http-transport-factory
  "Constructor."
  (^HttpTransportOptions$DefaultHttpTransportFactory []
    (new HttpTransportOptions$DefaultHttpTransportFactory )))

(defn create
  "returns: `com.google.api.client.http.HttpTransport`"
  (^com.google.api.client.http.HttpTransport [^HttpTransportOptions$DefaultHttpTransportFactory this]
    (-> this (.create))))

