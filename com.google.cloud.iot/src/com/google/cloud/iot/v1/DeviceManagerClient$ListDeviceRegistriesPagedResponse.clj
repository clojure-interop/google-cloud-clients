(ns com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iot.v1 DeviceManagerClient$ListDeviceRegistriesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (DeviceManagerClient$ListDeviceRegistriesPagedResponse/createAsync context future-response)))

